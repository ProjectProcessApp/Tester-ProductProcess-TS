package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import org.json.JSONObject;

public class Data {

    public JSONObject data86(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 68);
        expectedData.put("customerName", "omer");
        expectedData.put("gasanNo", "2000 ABC 100000");
        expectedData.put("orderNumber", "200000");
        expectedData.put("orderDate", "2024-11-05");
        expectedData.put("deliveryDate", "2026-10-10");
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
        expectedData.put("gasanNo", "9333 AB 123456");
        expectedData.put("orderNumber", "933352");
        expectedData.put("deliveryDate", "2026-10-10");
        expectedData.put("orderType", "LIFT");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }

    public JSONObject post94(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "Elif");
        expectedData.put("gasanNo", "0182 ZC 839048");
        expectedData.put("orderNumber", "200005");
        expectedData.put("deliveryDate", "2025-09-16");
        expectedData.put("orderType", "LIFT");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }
}
