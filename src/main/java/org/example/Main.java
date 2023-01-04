package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my IO homework, please use my unit tests. Or you can push 'Run' in class Main.");
        System.out.println();
        System.out.println("Task 1");
        Task_1_PhoneNumber ph1 = new Task_1_PhoneNumber();
        System.out.println("This is valid phone numbers: ");
        ph1.printValidPoneNumbers();
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