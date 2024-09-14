package tester_productprocess_ts.baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;



public class BaseUrl {
    public static RequestSpecification spec;

    public static void setUpp(String email, String password){

        spec =new RequestSpecBuilder()
                .setBaseUri("http://www.getlandestate.com:8092")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization","Bearer " )
                .build();
    }
}

