package com.company.行为型.策略模式;

public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(double money){
        return money;
    }


}
