package com.company.�ṹ��.��Ԫģʽ.�Ľ�;

public class ConcreteFlyweight extends Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(User user) {
        System.out.println("����flyweight:"+name+" �û�����"+user.getName());
    }
}
