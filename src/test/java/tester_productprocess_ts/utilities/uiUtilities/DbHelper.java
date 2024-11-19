package tester_productprocess_ts.utilities.uiUtilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {
    private static final String userName ="user";
    private static final String password ="1234";
    private static final String dbUrl="jdbc:postgresql://localhost:5432/stajProje";

    static Statement statement = null;
    static ResultSet resultSet;
    PreparedStatement preparedStatement =null;
    static Connection connection = null;

    public static void showErrorMessage(SQLException exception){
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Error Code : "+exception.getErrorCode());
    }

    public static Statement connection() throws SQLException {
        ReusableMethods.waitFor(5000);
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(dbUrl, userName, password);
        }
        statement = connection.createStatement();
        return statement;
    }

    public static void get(String query) throws SQLException {
        try{
            resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)
                       + resultSet.getString(2)
                       + resultSet.getString(3)
                       + resultSet.getString(4));
            }
        }catch(SQLException exception) {
            showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }

    public static void set(String query) throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(dbUrl, userName, password);
            }
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Kayit eklendi");
        } catch (SQLException exception) {
            showErrorMessage(exception);
        } finally {
            // Connection close işlemi yapılabilir, ancak her zaman yapılmaması önerilir, çünkü connection'ı tekrar kullanabilirsiniz.
            // closeConnection();
        }
    }

    public static void update(String query) throws SQLException {
        try{
            connection= DriverManager.getConnection(dbUrl,userName,password);
            statement= connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Kayit guncellendi");
        }catch (SQLException exception) {
            showErrorMessage(exception);
        }
        finally {
            closeConnection();
        }
    }

    public static void delete(String query) throws SQLException {
        try{
            connection= DriverManager.getConnection(dbUrl,userName,password);
            statement= connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Kayit silindi");
        }catch (SQLException exception) {
            showErrorMessage(exception);
        }
        finally {
            closeConnection();
        }
    }

    public static List<String> getColumnNames(String query) throws SQLException {
        resultSet=statement.executeQuery(query);
        List<String> columns = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columns.add(rsmd.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columns;
    }

    public static List<List<Object>> getQueryResultList(String query) throws SQLException {
        resultSet=statement.executeQuery(query);
        List<List<Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                List<Object> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.add(resultSet.getObject(i));
                }
                rowList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    public static void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
