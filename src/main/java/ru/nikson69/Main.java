package ru.nikson69;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] аrgs) throws Throwable {
        Calculator calculator = new Calculator();
        System.out.println("15/3="+ calculator.getDivide(15,3));
        System.out.println("7+8="+calculator.getSum(7,8));
        System.out.println("7*8="+calculator.getMultiple(7,8));
    }
}
