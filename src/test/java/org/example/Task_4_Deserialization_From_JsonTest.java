package org.example;

import org.junit.jupiter.api.Test;

class Task_4_Deserialization_From_JsonTest {

    @Test
    void deserJsonFile() {
        Task_4_Deserialization_From_Json t4 = new Task_4_Deserialization_From_Json();
        System.out.println("Task 4");
        System.out.println("Source json to string: " + t4.jSonAsString);
        t4.deserJsonFile(t4.jSonAsString);
    }

}