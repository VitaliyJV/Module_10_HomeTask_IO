package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_4_Deserialization_From_Json {

    String jSonAsString;
    {
        try {
            jSonAsString = Files.readAllLines(Path.of("C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\jsonFileFinish.txt")).toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    List<User> deserJsonFile(String jSonAsString) {
        ObjectMapper mapper = new ObjectMapper();
        List<User> methodList = new ArrayList<>();
        try {
            methodList = Arrays.asList(mapper.readValue(jSonAsString, User[].class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return methodList;

    }

    public void print() {
        System.out.println(jSonAsString);
    }

}



