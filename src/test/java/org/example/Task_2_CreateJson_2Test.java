package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_2_CreateJson_2Test {

    @Test
    void readFile() {
        System.out.println("Task 2");
        Task_2_CreateJson_2 f2 = new Task_2_CreateJson_2();
        f2.createFileJson(f2.readFile("C:\\\\Users\\\\Vitaliy\\\\Module_10_HomeTask_IO\\\\fileSourceForJson.txt"));
        System.out.println();
    }

    @Test
    void createFileJson() {
        System.out.println("Task 2");
        Task_2_CreateJson_2 f2 = new Task_2_CreateJson_2();
        f2.createFileJson(f2.readFile("C:\\\\Users\\\\Vitaliy\\\\Module_10_HomeTask_IO\\\\fileSourceForJson.txt"));
        System.out.println();
    }
}