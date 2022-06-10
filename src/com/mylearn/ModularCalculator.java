package com.mylearn;

public class ModularCalculator implements ICalculator<ModularNumber>{
    public ModularNumber Add(ModularNumber first, ModularNumber second) {
        Integer[] resultValue = first.plus(first, second);
        return new ModularNumber(resultValue[0], resultValue[1]);
    }
    public ModularNumber Subtract(ModularNumber first, ModularNumber second) {
        Integer[] resultValue = first.minus(first, second);
        return new ModularNumber(resultValue[0], resultValue[1]);
    }
    public ModularNumber Multiply(ModularNumber first, ModularNumber second) {
        Integer[] resultValue = first.asterisk(first, second);
        return new ModularNumber(resultValue[0], resultValue[1]);
    }
    public ModularNumber Divide(ModularNumber first, ModularNumber second) {
        Integer[] resultValue = first.slash(first, second);
        return new ModularNumber(resultValue[0], resultValue[1]);
    }
}
