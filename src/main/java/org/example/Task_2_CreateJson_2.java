package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Task_2_CreateJson_2 {
    String sourcePath = "C:\\Users\\Vitaliy\\Module_10_HomeTask_IO\\fileSourceForJson.txt";

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

    public void createFileJson(List<User> users) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);
        System.out.println("This is our Json format: ");
        System.out.println(json);
        System.out.println("Let us create file now");
        File jsonFileFinish = new File("C:\\Users\\Vitaliy\\Module_10_HomeTask_IO\\jsonFileFinish.txt");
        try {
            if (jsonFileFinish.createNewFile()){
                System.out.println("File jsonFileFinish is created!");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(jsonFileFinish);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public class User implements Serializable {

        //@Serial
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
