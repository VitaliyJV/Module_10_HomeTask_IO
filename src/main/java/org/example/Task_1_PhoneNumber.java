package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1_PhoneNumber {
    Path pathOfFile = Path.of("C:\\Users\\Vitaliy\\module_10_HomeTask_IO\\fileSourceOfPhoneNumbers.txt");
    List<String> listBegin;
    {
        try {
            listBegin = Files.readAllLines(pathOfFile);
        } catch (IOException e) {
            For_Stack_Trace.printStackTrace(Thread.currentThread().getStackTrace());
            throw new RuntimeException(e);
        }
    }
    Pattern patternCorrectPhoneNumber = Pattern.compile("[(]*[0-9]{3}[-]*[)]*[ ]*[0-9]{3}[-]{1}[0-9]{4}");

    public void printValidPoneNumbers() {
        for(String elem : listBegin) {
            Matcher matcher = patternCorrectPhoneNumber.matcher(elem);
            while (matcher.find()) {
                System.out.println(elem);
            }
        }
    }

}
