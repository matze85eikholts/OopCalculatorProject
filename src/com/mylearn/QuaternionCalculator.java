package com.mylearn;

public class QuaternionCalculator implements ICalculator<QuaternionNumber>{
    public QuaternionNumber Add(QuaternionNumber first, QuaternionNumber second) {
        double[] resultValue = first.plus(first, second);
        return new QuaternionNumber(resultValue[0], resultValue[1],resultValue[2], resultValue[3]);
    }
    public QuaternionNumber Subtract(QuaternionNumber first, QuaternionNumber second) {
        double[] resultValue = first.minus(first, second);
        return new QuaternionNumber(resultValue[0], resultValue[1],resultValue[2], resultValue[3]);
    }
    public QuaternionNumber Divide(QuaternionNumber first, QuaternionNumber second) {
        double[] resultValue = first.slash(first, second);
        System.out.println("Test" + resultValue[3]);
        return new QuaternionNumber(resultValue[0], resultValue[1],resultValue[2], resultValue[3]);
    }
    public QuaternionNumber Multiply(QuaternionNumber first, QuaternionNumber second) {
        double[] resultValue = first.asterisk(first, second);
        return new QuaternionNumber(resultValue[0], resultValue[1],resultValue[2], resultValue[3]);
    }
}
