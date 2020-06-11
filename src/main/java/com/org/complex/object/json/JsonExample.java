package com.org.complex.object.json;

import org.json.simple.JSONObject;
public class JsonExample {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("chandra", "29");
        jsonObject.put("naidu", "30");
        System.out.println(jsonObject);
    }
}
