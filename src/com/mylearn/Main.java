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

        QuaternionCalculator qc = new QuaternionCalculator();
        QuaternionNumber firstQuoternian = new QuaternionNumber(1.0, 1.0, 1.0, 1.0);
        QuaternionNumber secondQuoternian = new QuaternionNumber(1.0, 1.0, 1.0, 2.0);
        System.out.println("------------------------------------------");
        QuaternionNumber QResult = qc.Divide(firstQuoternian, secondQuoternian);
        System.out.println(QResult.getA());
        System.out.println(QResult.getB());
        System.out.println(QResult.getC());
        System.out.println(QResult.getD());
        System.out.println("------------------------------------------");

        QuaternionNumber f = new QuaternionNumber(1.0, 2.0, 3.0, 4.0);
        QuaternionNumber s = new QuaternionNumber(0.03333, -0.06666, -0.1, -0.13);
        System.out.println("------------------------------------------");
        QResult = qc.Multiply(f, s);
        System.out.println("MultiplyTesting"+QResult.getA());
        System.out.println("MultiplyTesting"+QResult.getB());
        System.out.println("MultiplyTesting"+QResult.getC());
        System.out.println("MultiplyTesting"+QResult.getD());
        System.out.println("------------------------------------------");

        ModularCalculator mc = new ModularCalculator();
        ModularNumber firstModularValue = new ModularNumber(5, 1);
        ModularNumber secondModularValue = new ModularNumber(5, 1);

        ModularNumber modularResult = mc.Divide(firstModularValue, secondModularValue);
        System.out.println(modularResult.getValue());
        System.out.println(modularResult.getModule());
        System.out.println("------------------------------------------");

    }
}
