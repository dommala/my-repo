package com.org.complex.object.json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecoding {
    public static void main(String[] args) {
        String json = "{\"chandra\":\"29\",\"naidu\":\"30\"}";
        Object obj = JSONValue.parse(json);
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject.get("chandra")+" "+jsonObject.get("naidu"));
    }
}
