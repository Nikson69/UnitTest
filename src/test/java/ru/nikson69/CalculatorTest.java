package ru.nikson69;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass //начало использования класса
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass //конец использования класса
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before //метот используется в начале
    public void initTest() {
        calculator = new Calculator();
    }

    @After //метод используется в конце
    public void afterTest() {
        calculator = null;
    }

    @Test // метод которые тестируем
    public void testGetSum() throws Exception {
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(35,calculator.getMultiple(6,6));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
}