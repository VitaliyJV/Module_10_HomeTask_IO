package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;

public class Task_2_CreateJson {
    Path pathOfFile2 = Path.of("C:\\Users\\Vitaliy\\Module_10_HomeTask_IO\\fileSourceForJson.txt");
    List<String> content;
    {
        try {
            content = Files.readAllLines(pathOfFile2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void printListOfContent() {
        for(String elem : content) {
                System.out.println(elem);
        }
    }


}




/*
name age
alice 21
ryan 30
 */
