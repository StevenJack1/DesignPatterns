package com.company.������.��������ģʽ;

public class AddFactory implements IFactory{

    @Override
    public Super createSuper(){
        return new Add();
    }
}
