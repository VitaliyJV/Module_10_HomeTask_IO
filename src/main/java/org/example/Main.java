package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my IO homework, please use my unit tests.");
        Task_1_PhoneNumber ph1 = new Task_1_PhoneNumber();
        System.out.println("This is valid phone numbers: ");
        ph1.printValidPoneNumbers();

        Task_2_CreateJson file2 = new Task_2_CreateJson();
        file2.printListOfContent();

        Task_3_Words_Frequency words = new Task_3_Words_Frequency();
        System.out.println("Frequency of words in file is: ");
        words.wordsFrequency();
    }
}