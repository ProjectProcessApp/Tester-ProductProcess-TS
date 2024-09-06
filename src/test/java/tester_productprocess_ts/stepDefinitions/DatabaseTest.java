package tester_productprocess_ts.stepDefinitions;

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

    @Then("{string} siparis sorgusu yapilir")
    public void siparis_sorgusu_yapilir(String query) throws SQLException {

        query ="select * from t_order";
        System.out.println(DbHelper.getColumnNames(query));
        System.out.println(DbHelper.getQueryResultList(query));
    }

    @Then("{string} siparis guncellenir")
    public void siparis_guncellenir(String query) {

    }

    @Then("{string} siparis silinebilir")
    public void siparis_silinebilir(String query) {

    }
}
