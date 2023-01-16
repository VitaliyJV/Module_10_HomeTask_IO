package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task_2_byJackson {
    String sourcePath1 = "C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\fileSourceForJson.txt";

    public List<User> readFile1(String sourcePath1) {
        List<User> users1 = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(sourcePath1))) {
            String line;
            int age;
            while ((line = br.readLine()) != null) {
                String[] res = line.split(" ");
                try{
                    age = Integer.parseInt(res[1]);
                }
                catch (NumberFormatException ex){
                    continue;
                }
                users1.add(new User(res[0], age));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("We filled List with type User from .txt source file: ");
        for (User elem: users1) {
            System.out.println(elem);
        }

        return users1;

    }

    public void createFileJson(List<User> users1) {
        ObjectMapper mapper = new ObjectMapper();
        String json1 = null;
        try {
            json1 = mapper.writeValueAsString(users1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("This is our Json format: ");
        System.out.println(json1);
        System.out.println("Let us create file now");
        File jsonFileFinish = new File("C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\jsonFileFinish.txt");
        try {
            if (jsonFileFinish.createNewFile()){
                System.out.println("File jsonFileFinish is created!");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            For_Stack_Trace.printStackTrace(Thread.currentThread().getStackTrace());
            throw new RuntimeException(e);
        }
        FileWriter writer;
        try {
            writer = new FileWriter(jsonFileFinish);
        } catch (IOException e) {
            For_Stack_Trace.printStackTrace(Thread.currentThread().getStackTrace());
            throw new RuntimeException(e);
        }
        try {
            writer.write(json1);
        } catch (IOException e) {
            For_Stack_Trace.printStackTrace(Thread.currentThread().getStackTrace());
            throw new RuntimeException(e);
        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

