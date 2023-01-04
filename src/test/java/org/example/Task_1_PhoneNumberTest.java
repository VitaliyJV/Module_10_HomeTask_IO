package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_1_PhoneNumberTest {

    @Test
    void printValidPoneNumbers() {
        System.out.println("Task 1");
        Task_1_PhoneNumber ph1 = new Task_1_PhoneNumber();
        System.out.println("This is valid phone numbers: ");
        ph1.printValidPoneNumbers();
        System.out.println();
    }
}