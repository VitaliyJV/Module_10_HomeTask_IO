package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class Task_4_Deserialization_From_JsonTest {

    @Test
    void deserJsonFile() {
        Task_4_Deserialization_From_Json t4 = new Task_4_Deserialization_From_Json();
        System.out.println("Task 4");
        try {
            t4.deserJsonFile(t4.readJsonFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}