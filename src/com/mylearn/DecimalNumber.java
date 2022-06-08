package com.mylearn;

public class DecimalNumber extends Number{
    public DecimalNumber(double value){
        this.value  = value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return this.value;
    }
    private double value;

    /*public static DecimalNumber plus(DecimalNumber first, DecimalNumber second) {
        return new DecimalNumber(first.getValue() + second.getValue());
    }*/
    public static double plus(DecimalNumber first, DecimalNumber second){
        return first.getValue() + second.getValue();
    }
}
