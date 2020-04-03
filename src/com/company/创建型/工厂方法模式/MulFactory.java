package com.company.创建型.工厂方法模式;

public class MulFactory implements IFactory {
    @Override
    public Super createSuper(){
        return new Mul();
    }
}
