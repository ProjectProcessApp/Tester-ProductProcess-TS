package tester_productprocess_ts.stepDefinitions.apiStepDefinitions;

import org.json.JSONObject;

public class Data {

    public JSONObject data86(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 1);
        expectedData.put("customerName", "omer");
        expectedData.put("gasanNo", "3000 ABC 300000");
        expectedData.put("orderNumber", "3000-A0000");
        expectedData.put("orderDate", "2024-11-13");
        expectedData.put("deliveryDate", "2026-10-10");
        expectedData.put("orderType", "Lift");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 100);
        return expectedData;
    }

    public JSONObject data87(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("id", 87);
        expectedData.put("customerName", "alican");
        expectedData.put("gasanNo", "3000 ABC 100003");
        expectedData.put("orderNumber", "3000000003");
        expectedData.put("orderDate", "2024-09-10");
        expectedData.put("deliveryDate", "2024-10-10");
        expectedData.put("orderType", "Blok Lift");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 0);
        return expectedData;
    }

    public JSONObject post93(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "Ozer");
        expectedData.put("gasanNo", "9333 AB 123456");
        expectedData.put("orderNumber", "933352");
        expectedData.put("deliveryDate", "2026-10-10");
        expectedData.put("orderType", "Lift");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }

    public JSONObject post94(){

        JSONObject expectedData = new JSONObject();
        expectedData.put("customerName", "Elif");
        expectedData.put("gasanNo", "0182 ZC 839048");
        expectedData.put("orderNumber", "2000051236");
        expectedData.put("deliveryDate", "2027-09-16");
        expectedData.put("orderType", "Lift");
        expectedData.put("orderQuantity", 1500);
        expectedData.put("orderStatus", "İşlenmeyi Bekliyor");
        expectedData.put("readyMilCount", 200);
        return expectedData;
    }
}
