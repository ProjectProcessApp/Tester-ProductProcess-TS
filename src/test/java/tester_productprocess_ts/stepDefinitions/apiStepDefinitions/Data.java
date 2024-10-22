package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import org.json.JSONObject;

public class Data {

    public JSONObject data86(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 6);
        expectedData.put("customerName", "alican");
        expectedData.put("gasanNo", "1000 ABC 100002");
        expectedData.put("orderNumber", "100002");
        expectedData.put("orderDate", "2024-10-21");
        expectedData.put("deliveryDate", "2026-10-10");
        expectedData.put("orderType", "BLOKLIFT");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 0);
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
        expectedData.put("orderNumber", "303096");
        expectedData.put("deliveryDate", "2025-09-16");
        expectedData.put("orderType", "LIFT");
        expectedData.put("orderQuantity", 1000);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }
}
