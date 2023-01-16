package org.example;

import org.junit.jupiter.api.Test;

class Task_2_CreateJsonByGsonTest {

    @Test
    void readFile() {
        System.out.println("Task 2");
        Task_2_CreateJsonByGson f2 = new Task_2_CreateJsonByGson();
        f2.createFileGson(f2.readFile("C:\\\\Users\\\\Vitaliy\\\\Module_10_HomeTask_IO\\\\fileSourceForJson.txt"));
        System.out.println();
    }

    @Test
    void createFileJson() {
        System.out.println("Task 2");
        Task_2_CreateJsonByGson f2 = new Task_2_CreateJsonByGson();
        f2.createFileGson(f2.readFile("C:\\\\Users\\\\Vitaliy\\\\Module_10_HomeTask_IO\\\\fileSourceForJson.txt"));
        System.out.println();
    }
}