package tester_productprocess_ts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tester_productprocess_ts.utilities.databaseUtilities.DB_Utilty;
import tester_productprocess_ts.utilities.uiUtilities.DbHelper;

import java.sql.SQLException;


public class DatabaseTest {
    @Then("Database baglanilir")
    public void database_baglanilir() throws SQLException, ClassNotFoundException {
      //Class.forName("org.postgresql.Driver");
        DbHelper.connection();
    }

    @And("yeni siparis kaydi eklenir")
    public void yeniSiparisKaydiEklenir() throws SQLException {
        String query="INSERT INTO t_order (customer_name, delivery_date, gasan_no, order_date, order_number, order_quantity, order_type, ready_mil_count)" +
                "VALUES ('*', '2024-09-10', '1189 AB 987654', '2024-09-08', '963852', -100, 'paslanmaz', -50)";
        DbHelper.set(query);
    }

    @And("butun kayitlar getirilir")
    public void butunKayitlarGetirilir() throws SQLException {
       String query ="select * from t_order";
        System.out.println(DbHelper.getColumnNames(query));
        System.out.println(DbHelper.getQueryResultList(query));
    }

    @Then("{string} siparis guncellenir")
    public void siparis_guncellenir(String query) throws SQLException {
       query= "UPDATE t_order SET customer_name = 'halil', delivery_date = '2024-09-10', gasan_no = '11 AB 987654', "
               + "order_date = '2024-09-08', order_number = '965852', order_quantity = '100', order_type = 'paslanmaz',"
               + "ready_mil_count = '50', status_id = '3' WHERE customer_name = '*'";
        DbHelper.update(query);
    }

    @Then("{string} siparis silinebilir")
    public void siparis_silinebilir(String query) throws SQLException {
        String deleteQuery = "DELETE FROM t_order WHERE gasan_no = '3111 AB 123456'";
        DbHelper.delete(deleteQuery);
    }




}
