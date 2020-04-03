package com.company.创建型.工厂方法模式;

public class SubFactory implements IFactory {
    @Override
    public Super createSuper(){
        return new Sub();
    }
}
