package ru.netology.calculator;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @BeforeAll
    static void start() {
        System.out.println("Starting Calculator tests");
    }

    @AfterAll
    static void end() {
        System.out.println("Тhe tests are finished");
    }

    @BeforeEach
    void startNewTest() {
        System.out.println("Starting method test");
    }

    @AfterEach
    void endNewTest() {
        System.out.println("End method Test");
    }

    @Test
    void plusTest() {
        Calculator plusTest = new Calculator();
        int expected = 5;
        int actual = plusTest.plus.apply(2, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        Calculator minusTest = new Calculator();
        int expected = 8;
        int actual = minusTest.minus.apply(24, 16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPositive() {
        Calculator isPositiveTest = new Calculator();
        boolean condition = isPositiveTest.isPositive.test(3);
        Assertions.assertTrue(condition);

    }

}