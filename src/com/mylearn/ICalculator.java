package com.mylearn;

public interface ICalculator<N extends Number>{
    N Add(N first, N second);
    N Subtract(N first, N second);
    N Multiply(N first, N second);
    N Divide(N first, N second);

}
