package com.mylearn;

public class ComplexCalculator implements ICalculator<ComplexNumber>{
    public ComplexNumber Add(ComplexNumber first, ComplexNumber second) {
        double[] resultValue = first.plus(first, second);
        return new ComplexNumber(resultValue[0], resultValue[1]);
    }
    public ComplexNumber Subtract(ComplexNumber first, ComplexNumber second) {
        double[] resultValue = first.minus(first, second);
        return new ComplexNumber(resultValue[0], resultValue[1]);
    }
    public ComplexNumber Multiply(ComplexNumber first, ComplexNumber second) {
        double[] resultValue = first.asterisk(first, second);
        return new ComplexNumber(resultValue[0], resultValue[1]);
    }
    public ComplexNumber Divide(ComplexNumber first, ComplexNumber second) {
        double[] resultValue = first.slash(first, second);
        return new ComplexNumber(resultValue[0], resultValue[1]);
    }
}
