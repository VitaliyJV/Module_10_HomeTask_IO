package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Task_4_Deserialization_From_Json {

    public String readJsonFile() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\jsonFileFinish.txt"));) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
            }
        }
        return  stringBuilder.toString();
    }

    public ArrayList<User> deserJsonFile(String json) throws JsonProcessingException {
        Type listType = new TypeToken<ArrayList<User>>() {}.getType();
        ArrayList<User> users1 = new Gson().fromJson(json, listType);
        //ArrayList<User> users1 = (ArrayList<User>) new ObjectMapper().readValue(json, new TypeReference<ArrayList<User>>(){});
        System.out.println(users1);
        return users1;

    }

}







