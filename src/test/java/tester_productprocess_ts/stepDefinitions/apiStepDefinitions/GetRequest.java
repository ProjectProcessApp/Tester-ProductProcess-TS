package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import tester_productprocess_ts.utilities.apiUtilities.Authentication;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class GetRequest extends Authentication  {

Response response;

    public void get01(int ordernummer) {
        // Token'ı alıyoruz
        String token = token();

        // Request URL oluşturma
        String url = "http://localhost:8080/orders/getOrderById/"+ordernummer+"";

        // API'den response alıyoruz ve durumu kontrol ediyoruz
        response = given()
                .header("Authorization", "Bearer " + token) // Token'ı ekliyoruz
                .when()
                .get(url) // İstekte bulunuyoruz
                .then()
                .statusCode(200) // 200 OK bekliyoruz
                .extract().response(); // Response'u kaydediyoruz

        //Assertion
        // Yanıtı JSON formatında elde ediyoruz
        JSONObject actualData = new JSONObject(response.jsonPath().getMap("returnBody"));

        // Assert.assertEquals kullanarak her bir alanı karşılaştırıyoruz
        Data data = new Data();
        if (ordernummer == 86) {
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
        } else if (ordernummer == 87) {
            assertEquals(data.data87().getInt("id"), actualData.getInt("id"));
            assertEquals(data.data87().getString("customerName"), actualData.getString("customerName"));
            assertEquals(data.data87().getString("gasanNo"), actualData.getString("gasanNo"));
            assertEquals(data.data87().getString("orderNumber"), actualData.getString("orderNumber"));
            assertEquals(data.data87().getString("orderDate"), actualData.getString("orderDate"));
            assertEquals(data.data87().getString("deliveryDate"), actualData.getString("deliveryDate"));
            assertEquals(data.data87().getString("orderType"), actualData.getString("orderType"));
            assertEquals(data.data87().getInt("orderQuantity"), actualData.getInt("orderQuantity"));
            assertEquals(data.data87().getString("orderStatus"), actualData.getString("orderStatus"));
            assertEquals(data.data87().getInt("readyMilCount"), actualData.getInt("readyMilCount"));
        }
        // "message" ve "httpStatus" alanlarını kontrol ediyoruz
        assertEquals("Sipariş bulundu", response.jsonPath().getString("message"));
        assertEquals("OK", response.jsonPath().getString("httpStatus"));
    }

    public void post(){

        String token = token();
        String url= "http://localhost:8080/orders/createOrder";
        Data data = new Data();
        response = given()
                .when()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(data.post94().toString()) // data classindan post94 adli jsonobjeyi gonderiyoruz
                .post(url);


        JSONObject actualData = new JSONObject(response.jsonPath().getMap("returnBody"));

        //apiden donmesi gereken datayi kaydediyoruz

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "memet");
        expectedData.put("gasanNo", "3111 AB 123456");
        expectedData.put("orderNumber", "323452");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "DAMPER");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);

        // Assert.assertEquals kullanarak her bir alanı karşılaştırıyoruz
        //response.then().assertThat().contentType(ContentType.JSON).statusCode(200);

            assertEquals(data.post94().getString("customerName"), expectedData.getString("customerName"));
            assertEquals(data.post94().getString("gasanNo"), expectedData.getString("gasanNo"));
            assertEquals(data.post94().getString("orderNumber"), expectedData.getString("orderNumber"));
            assertEquals(data.post94().getString("deliveryDate"), expectedData.getString("deliveryDate"));
            assertEquals(data.post94().getString("orderType"), expectedData.getString("orderType"));
            assertEquals(data.post94().getInt("orderQuantity"), expectedData.getInt("orderQuantity"));
            assertEquals(data.post94().getString("orderStatus"), expectedData.getString("orderStatus"));
            assertEquals(data.post94().getInt("readyMilCount"), expectedData.getInt("readyMilCount"));

        // "message" ve "httpStatus" alanlarını kontrol ediyoruz
        assertEquals("Sipariş oluşturuldu", response.jsonPath().getString("message"));
        assertEquals("CREATED", response.jsonPath().getString("httpStatus"));

    }
}
