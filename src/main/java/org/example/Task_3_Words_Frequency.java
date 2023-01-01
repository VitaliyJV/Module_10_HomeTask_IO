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

    public String formatSomeMap(){
        StringBuilder out= new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            out.append(key);
            out.append(" ");
            out.append(value);
            out.append("\n");
        }
        return out.toString();
    }

}





