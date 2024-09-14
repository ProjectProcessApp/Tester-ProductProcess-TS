package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import org.json.JSONObject;

public class Data {

    public JSONObject data86(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 86);
        expectedData.put("customerName", "omer");
        expectedData.put("gasanNo", "1111 A 123456");
        expectedData.put("orderNumber", "123451");
        expectedData.put("orderDate", "2024-09-10");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "LIFT");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 100);
        return expectedData;
    }

    public JSONObject data87(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 87);
        expectedData.put("customerName", "hasan");
        expectedData.put("gasanNo", "1111 AB 123456");
        expectedData.put("orderNumber", "123452");
        expectedData.put("orderDate", "2024-09-10");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "DAMPER");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }

    public JSONObject post93(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "Ozer");
        expectedData.put("gasanNo", "9111 AB 123456");
        expectedData.put("orderNumber", "923452");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "DAMPER");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }

    public JSONObject post94(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "memet");
        expectedData.put("gasanNo", "3111 AB 123456");
        expectedData.put("orderNumber", "323452");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "DAMPER");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }
}
