package com.mylearn;

public class DecimalCalculator implements ICalculator<DecimalNumber>{
    public DecimalNumber Add(DecimalNumber first, DecimalNumber second) {
        double resultValue = first.plus(first, second);
        return new DecimalNumber(resultValue);
    };
    public DecimalNumber Subtract(DecimalNumber first, DecimalNumber second) {
        double resultValue = first.minus(first, second);
        return new DecimalNumber(resultValue);
    };
    public DecimalNumber Multiply(DecimalNumber first, DecimalNumber second) {
        double resultValue = first.asterisc(first, second);
        return new DecimalNumber(resultValue);
    };
    public DecimalNumber Divide(DecimalNumber first, DecimalNumber second) {
        double resultValue = first.slash(first, second);
        return new DecimalNumber(resultValue);
    };
}
