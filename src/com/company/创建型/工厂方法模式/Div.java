package com.company.������.��������ģʽ;

public class Div extends Super {
    @Override
    public double getResult() throws Exception{
        if (numberB == 0){
            throw new Exception("��������Ϊ0");
        }
        return numberA / numberB;
    }
}
