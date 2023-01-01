package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Task_3_Words_Frequency {

    Path pathOfFile3 = Path.of("C:\\Users\\Vitaliy\\Module_10_HomeTask_IO\\words.txt");
    String strSource;

    {
        try {
            strSource = Files.readString(pathOfFile3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    String strSource1 = strSource.replaceAll("\n|\r\n", " ");

    String[] arrSource = strSource1.split(" ");

    @Override
    public String toString() {
        return "Task_3_Words_Frequency" +
                "map " + map ;
    }

    Map<String, Integer> map = new HashMap<>();
    public void wordsFrequency() {
        for (String s : arrSource) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println(map);
    }

}





