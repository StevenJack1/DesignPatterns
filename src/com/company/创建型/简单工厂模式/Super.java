package com.company.创建型.简单工厂模式;

public class Super {
    double numberA = 0;
    double numberB = 0;

    public double getNumberA() {
        return numberA;
    }
    public double getNumberB() {
        return numberB;
    }
    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getResult() throws Exception{
        double result = 0;
        return result;
    }
}
