package com.mylearn;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome to the OOP Calculator Project!");
        DecimalCalculator dc = new DecimalCalculator();
        DecimalNumber firstValue = new DecimalNumber(5.0);
        DecimalNumber secondValue = new DecimalNumber(10.0);
        DecimalNumber result = dc.Add(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Substract(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Multiply(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Divide(firstValue, secondValue);
        System.out.println(result.getValue());
    }
}
