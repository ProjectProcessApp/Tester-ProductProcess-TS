package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import tester_productprocess_ts.utilities.apiUtilities.Authentication;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class GetRequest extends Authentication  {

    Response response;

    String token="";

    public void get01() {
        // Token'ı alıyoruz
         token = token();
        // Request URL oluşturma
        String url = "http://localhost:8080/orders/getOrderById/6";
        // API'den response alıyoruz ve durumu kontrol ediyoruz
        response = given()
                .header("Authorization", "Bearer " + token) // Token'ı ekliyoruz
                .when()
                .get(url) // İstekte bulunuyoruz
                .then()
                .statusCode(200) // 200 OK bekliyoruz
                .extract().response(); // Response'u kaydediyoruz

        JSONObject actualData = new JSONObject(response.jsonPath().getMap("returnBody"));
        // Assert.assertEquals kullanarak her bir alanı karşılaştırıyoruz
        Data data = new Data();
            assertEquals(data.data86().getInt("id"), actualData.getInt("id"));
            assertEquals(data.data86().getString("customerName"), actualData.getString("customerName"));
            assertEquals(data.data86().getString("gasanNo"), actualData.getString("gasanNo"));
            assertEquals(data.data86().getString("orderNumber"), actualData.getString("orderNumber"));
            assertEquals(data.data86().getString("orderDate"), actualData.getString("orderDate"));
            assertEquals(data.data86().getString("deliveryDate"), actualData.getString("deliveryDate"));
            assertEquals(data.data86().getString("orderType"), actualData.getString("orderType"));
            assertEquals(data.data86().getInt("orderQuantity"), actualData.getInt("orderQuantity"));
            assertEquals(data.data86().getString("orderStatus"), actualData.getString("orderStatus"));
            assertEquals(data.data86().getInt("readyMilCount"), actualData.getInt("readyMilCount"));

        // "message" ve "httpStatus" alanlarını kontrol ediyoruz
        assertEquals("Sipariş bulundu", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));

        System.out.println("ID numarasi ile siparis, basari ile API den test edildi");
    }
    public void get02() {

        token = token();

        String url = "http://localhost:8080/orders/getByOrderNumber/100002";

        response = given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().response();

        JsonPath actualData = response.jsonPath();

        Data data = new Data();
        assertEquals(data.data86().getInt("id"), actualData.getInt("id"));
        assertEquals(data.data86().getString("customerName"), actualData.getString("customerName"));
        assertEquals(data.data86().getString("gasanNo"), actualData.getString("gasanNo"));
        assertEquals(data.data86().getString("orderNumber"), actualData.getString("orderNumber"));
        assertEquals(data.data86().getString("orderDate"), actualData.getString("orderDate"));
        assertEquals(data.data86().getString("deliveryDate"), actualData.getString("deliveryDate"));
        assertEquals(data.data86().getString("orderType"), actualData.getString("orderType"));
        assertEquals(data.data86().getInt("orderQuantity"), actualData.getInt("orderQuantity"));
        assertEquals(data.data86().getString("orderStatus"), actualData.getString("orderStatus"));
        assertEquals(data.data86().getInt("readyMilCount"), actualData.getInt("readyMilCount"));

        System.out.println("order numarasi ile siparis, basari ile API den test edildi");
    }

    public void post(){

        token = token();
        String url= "http://localhost:8080/orders/createOrder";
        Data data = new Data();
        response = given()
                .when()
                .header("Authorization", "Bearer "+token)
                .contentType(ContentType.JSON)
                .body(data.data86())
                .post(url);
        System.out.println(data.data86());
        JSONObject actualData = new JSONObject(response.jsonPath().getMap("returnBody"));
        System.out.println(response.prettyPrint());
            assertEquals(data.post93().getString("customerName"), actualData.getString("customerName"));
            assertEquals(data.post93().getString("gasanNo"), actualData.getString("gasanNo"));
            assertEquals(data.post93().getString("orderNumber"), actualData.getString("orderNumber"));
            assertEquals(data.post93().getString("deliveryDate"), actualData.getString("deliveryDate"));
            assertEquals(data.post93().getString("orderType"), actualData.getString("orderType"));
            assertEquals(data.post93().getInt("orderQuantity"), actualData.getInt("orderQuantity"));
            assertEquals(data.post93().getString("orderStatus"), actualData.getString("orderStatus"));
            assertEquals(data.post93().getInt("readyMilCount"), actualData.getInt("readyMilCount"));

        assertEquals("Sipariş oluşturuldu", response.jsonPath().getString("message"));
        assertEquals("CREATED", response.jsonPath().getString("httpStatus"));

        System.out.println("siparisin API araciligiyla eklendigi test edildi");

    }

    public void delete(int ordernummer){
        token = token();
        Data data = new Data();
        RestAssured.baseURI = "http://localhost:8080/orders/deleteOrder/"+ordernummer+"";
        response=given()
                .when()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .delete();

        assertEquals("Sipariş silindi", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));

        System.out.println(ordernummer+" numarali siparisin basari ile silindigi API den test edildi");
    }

    public void put(int id){
        token=token();
        Data data = new Data();
        String  url="http://localhost:8080/orders/updateOrder/"+id+"";
        response=given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .when()
                .body(data.post94().toString())
                .put(url);

        JsonPath expectedData = response.jsonPath();
        assertEquals("Sipariş güncellendi", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));

        System.out.println(id+" numarali kayidin basari ile guncellendigi API den test edildi");
    }
}
