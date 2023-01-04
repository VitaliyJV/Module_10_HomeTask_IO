package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my IO homework, please use my unit tests.");
        System.out.println();


        System.out.println("Task 2");
        Task_2_CreateJson_2 f2 = new Task_2_CreateJson_2();
        f2.createFileJson(f2.readFile("C:\\\\Users\\\\Vitaliy\\\\Module_10_HomeTask_IO\\\\fileSourceForJson.txt"));
        System.out.println();

        System.out.println("Task 3");
        Task_3_Words_Frequency words = new Task_3_Words_Frequency();
        System.out.println("Map of frequency(without required format) of words in file is: ");
        words.wordsFrequency();
        System.out.println("Formatted output: ");
        System.out.println(words.formatSomeMap());
    }
}