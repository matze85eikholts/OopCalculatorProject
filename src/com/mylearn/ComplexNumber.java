package com.mylearn;

public class ComplexNumber extends Number {

    public ComplexNumber(double realValue, double imaginaryValue){
        this.realPart  = realValue;
        this.imaginaryPart = imaginaryValue;
    }
    public void setRealPart(double realValue){
        this.realPart = realValue;
    }
    public double getRealPart(){
        return this.realPart;
    }
    public void setImaginaryPart(double imaginaryValue){
        this.imaginaryPart = imaginaryValue;
    }
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    private double realPart;
    private double imaginaryPart;


    public static double[] plus(ComplexNumber first, ComplexNumber second){
        double[] result = new double[2];
        result[0] = first.getRealPart() + second.getRealPart();
        result[1] = first.getImaginaryPart() + second.getImaginaryPart();
        //double realResultValue = first.getRealPart() + second.getRealPart();
        //double imaginaryResultValue = first.getImaginaryPart() + second.getImaginaryPart();
        //return new ComplexNumber(realResultValue, imaginaryResultValue);
        return result;
    }

    public static double[] minus(ComplexNumber first, ComplexNumber second){
        double[] result = new double[2];
        result[0] = first.getRealPart() - second.getRealPart();
        result[1] = first.getImaginaryPart() - second.getImaginaryPart();
        return result;
    }

    // (a1,a2)*(b1,b2)=(a1*b1-a2*b2)+i*(a1*b2+a2*b1)
    public static double[] asterisk(ComplexNumber first, ComplexNumber second){
        double[] result = new double[2];
        result[0] = (first.getRealPart()*second.getRealPart())-
                (first.getImaginaryPart()*second.getImaginaryPart());
        result[1] = ( first.getRealPart() * second.getImaginaryPart()) +
                (first.getImaginaryPart() * second.getRealPart());
        return result;
    }

    public static double[] slash(ComplexNumber first, ComplexNumber second){
        double[] result = new double[2];
        double denominator;
        if (second.getRealPart()==0.0&&second.getImaginaryPart()==0.0) {
            result[0]=0.0;
            result[1]=0.0;
        }
        else {
            denominator = (second.getRealPart() *second.getRealPart()) +
                    (second.getImaginaryPart() * second.getImaginaryPart());
            result[0] = ((first.getRealPart() * second.getRealPart()) +
                    (first.getImaginaryPart() * second.getImaginaryPart())) / denominator;
            result[1] = ((second.getRealPart() * first.getImaginaryPart()) -
                    (second.getImaginaryPart() * first.getRealPart()))/denominator;
        }
        return result;
    }
}
