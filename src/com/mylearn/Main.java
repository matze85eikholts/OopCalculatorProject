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
    }
}
