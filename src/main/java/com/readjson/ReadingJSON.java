package com.readjson;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingJSON {

    public static void main(String[] args) {

        try {
            JSONObject o = new JSONObject(new String((Files.readAllBytes(
                    (Paths.get("/home/matheus/code/readjson/src/main/java/com/readjson/BobFile.json"))))));

            o.getJSONArray("emails").forEach(email -> {
                System.out.println(email);
            });

            JSONObject f = o.getJSONObject("family");
            System.out.println(f.getString("spouse"));

            f.getJSONArray("children").forEach(children -> {
                System.out.println(children);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
