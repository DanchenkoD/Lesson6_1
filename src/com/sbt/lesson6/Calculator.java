package com.sbt.lesson6;

public class Calculator implements CalculatorInt {
    public Integer calc(Integer x)
    {
        System.out.println("Расчета калькулятором " + x);
        return x*x;
    }
}
