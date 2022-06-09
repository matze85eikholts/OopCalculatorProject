package com.mylearn;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome to the OOP Calculator Project!");
        ComplexCalculator cc = new ComplexCalculator();
        ComplexNumber firstComplexValue = new ComplexNumber(5.0, 1000.0);
        ComplexNumber secondComplexValue = new ComplexNumber(5.0, 1.0);
        ComplexNumber complexResult = cc.Add(firstComplexValue, secondComplexValue);
        System.out.println(complexResult.getRealPart());
        System.out.println(complexResult.getImaginaryPart());
        System.out.println("------------------------------------------");

        complexResult = cc.Subtract(firstComplexValue, secondComplexValue);
        System.out.println(complexResult.getRealPart());
        System.out.println(complexResult.getImaginaryPart());
        System.out.println("------------------------------------------");

        complexResult = cc.Multiply(firstComplexValue, secondComplexValue);
        System.out.println(complexResult.getRealPart());
        System.out.println(complexResult.getImaginaryPart());
        System.out.println("------------------------------------------");

        complexResult = cc.Divide(firstComplexValue, secondComplexValue);
        System.out.println(complexResult.getRealPart());
        System.out.println(complexResult.getImaginaryPart());
        System.out.println("------------------------------------------");
        DecimalCalculator dc = new DecimalCalculator();
        DecimalNumber firstValue = new DecimalNumber(5.0);
        DecimalNumber secondValue = new DecimalNumber(10.0);
        DecimalNumber result = dc.Add(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Subtract(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Multiply(firstValue, secondValue);
        System.out.println(result.getValue());
        System.out.println("------------------------------------------");
        result = dc.Divide(firstValue, secondValue);
        System.out.println(result.getValue());

    }
}
