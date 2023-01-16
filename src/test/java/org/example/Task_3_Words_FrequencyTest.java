package org.example;

import org.junit.jupiter.api.Test;

class Task_3_Words_FrequencyTest {

    @Test
    void wordsFrequency() {
        System.out.println("Task 3");
        Task_3_Words_Frequency words = new Task_3_Words_Frequency();
        System.out.println("Map of frequency(without required format) of words in file is: ");
        words.wordsFrequency();
    }

    @Test
    void formatSomeMap() {
        System.out.println("Task 3");
        Task_3_Words_Frequency words = new Task_3_Words_Frequency();
        System.out.println("Map of frequency(without required format) of words in file is: ");
        words.wordsFrequency();
        System.out.println("Formatted output: ");
        System.out.println(words.formatSomeMap());
    }
}