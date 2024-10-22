package tester_productprocess_ts.utilities.apiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import tester_productprocess_ts.stepDefinitions.apiStepDefinitions.GetRequest;

import static io.restassured.RestAssured.given;

public class Authentication  {

    String token;
    Response response;

    public String token(){

        RestAssured.baseURI = "http://localhost:8080";

        response = given()
                .when()
                .contentType(ContentType.JSON)
                .body("{ \"username\": \"UretimPlanlama\", \"password\": \"Ankara04*\" }")
                .when()
                .post("/auth/login");

        return token = response.jsonPath().getString("token");

    }
}
