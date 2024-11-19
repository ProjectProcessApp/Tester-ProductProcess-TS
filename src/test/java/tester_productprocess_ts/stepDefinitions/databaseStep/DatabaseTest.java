package tester_productprocess_ts.stepDefinitions.databaseStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tester_productprocess_ts.utilities.databaseUtilities.DB_Utilty;
import tester_productprocess_ts.utilities.uiUtilities.DbHelper;
import tester_productprocess_ts.utilities.uiUtilities.ReusableMethods;

import java.sql.SQLException;


public class DatabaseTest {

    String query="";

    @And("yeni siparis kaydi eklenir")
    public void yeniSiparisKaydiEklenir() throws SQLException {
        String query = "INSERT INTO t_order (customer_name, delivery_date, final_product_quantity, gasan_no, order_date, order_number, order_quantity, order_type, ready_mil_count) " +
                "VALUES ('cemil', '2025-11-05', 100, '1189 ABC 987662', '2024-11-05', '963860', 100, 'LIFT', 50)";
        try {
            DbHelper.set(query);
        } catch (SQLException e) {
            System.err.println("Sorgu hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @And("siparis guncellenir")
    public void siparisGuncellenir() throws SQLException {
        ReusableMethods.waitFor(1500);
        query= "UPDATE t_order SET customer_name = 'cemil', delivery_date = '2025-09-10', gasan_no = '1122 AB 987655', "
                + "order_date = '2025-09-08', order_number = '965853', order_quantity = '100', order_type = 'LIFT',"
                + "ready_mil_count = '50', status_id = '3' WHERE customer_name = 'halil'";
        DbHelper.update(query);
    }

    @And("siparis silinebilir")
    public void siparisSilinebilir() throws SQLException {
        String deleteQuery = "DELETE FROM t_order WHERE customer_name = 'cemil'";
        DbHelper.delete(deleteQuery);
    }

    @And("butun kayitlar getirilir")
    public void butunKayitlarGetirilir() throws SQLException {
        DbHelper.connection();
        String query ="select * from t_order";
        System.out.println(DbHelper.getQueryResultList(query));
    }

}
