package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Task_2_CreateJsonByGson {
    String sourcePath = "C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\fileSourceForJson.txt";

    public List<User> readFile(String sourcePath) {
        List<User> users = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
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
                users.add(new User(res[0], age));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("We filled List with type User from .txt source file: ");
        for (User elem: users) {
            System.out.println(elem);
        }

        return users;

    }

    public void createFileGson(List<User> users) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);
        System.out.println("This is our Json format: ");
        System.out.println(json);
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
        FileWriter writer = null;
        try {
            writer = new FileWriter(jsonFileFinish);
        } catch (IOException e) {
            For_Stack_Trace.printStackTrace(Thread.currentThread().getStackTrace());
            throw new RuntimeException(e);
        }
        try {
            writer.write(json);
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
