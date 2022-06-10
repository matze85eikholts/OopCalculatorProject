package com.mylearn;

public class QuaternionNumber extends Number{
    //  представление кватерниона q = a + b*i + c*j + d*k
    public QuaternionNumber(double a, double b, double c, double d){
        this.a  = a;
        this.b  = b;
        this.c  = c;
        this.d  = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }
    public static double[] plus(QuaternionNumber first, QuaternionNumber second){
        double[] result = new double[4];
        result[0] = first.getA() + second.getA();
        result[1] = first.getB() + second.getB();
        result[2] = first.getC() + second.getC();
        result[3] = first.getD() + second.getD();
        return result;
    }

    public static double[] minus(QuaternionNumber first, QuaternionNumber second){
        double[] result = new double[4];
        result[0] = first.getA() - second.getA();
        result[1] = first.getB() - second.getB();
        result[2] = first.getC() - second.getC();
        result[3] = first.getD() - second.getD();
        return result;
    }
    public static double[] asterisk(QuaternionNumber first, QuaternionNumber second){
        double[] result = new double[4];
        result[0] = first.getA() * second.getA() - first.getB() * second.getB()
                - first.getC() * second.getC() - first.getD() * second.getD();
        result[1] = first.getA() * second.getB() + first.getB() * second.getA()
                + first.getC() * second.getD() - first.getD() * second.getC();

        result[2] = first.getA() * second.getC() - first.getB() * second.getD()
                + first.getC() * second.getA() + first.getD() * second.getB();

        result[3] = first.getA() * second.getD() + first.getB() * second.getC()
                - first.getC() * second.getB() + first.getD() * second.getA();
        return result;
    }
    public static double[] slash(QuaternionNumber first, QuaternionNumber second){
        QuaternionNumber minusOnePowerQ = second.conjugateAndNormalizeQuaternion();
        return first.asterisk(first,minusOnePowerQ);
    }
    public QuaternionNumber conjugateAndNormalizeQuaternion() {
        double normInSquare = this.a*this.a + this.b*this.b + this.c*this.c + this.d*this.d;
        return new QuaternionNumber(a/normInSquare,-b/normInSquare,-c/normInSquare,-d/normInSquare);
    }
    private final double a, b, c, d;
}
