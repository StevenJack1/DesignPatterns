package com.company.������.��������ģʽ;

public class SubFactory implements IFactory {
    @Override
    public Super createSuper(){
        return new Sub();
    }
}
