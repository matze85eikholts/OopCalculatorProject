package com.mylearn;

public class DecimalCalculator implements ICalculator<DecimalNumber>{
    public DecimalNumber Add(DecimalNumber first, DecimalNumber second) {
        double resultValue = first.plus(first, second);
        return new DecimalNumber(resultValue);
    };
    public DecimalNumber Substract(DecimalNumber first, DecimalNumber second) {
        return new DecimalNumber(5.0);
    };
    public DecimalNumber Multiply(DecimalNumber first, DecimalNumber second) {
        return new DecimalNumber(5.0);
    };
    public DecimalNumber Divide(DecimalNumber first, DecimalNumber second) {
        return new DecimalNumber(5.0);
    };
}
