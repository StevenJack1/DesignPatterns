package com.company.�ṹ��.��Ԫģʽ.�Ľ�;

public class UnConcreteFlyweight extends Flyweight {
    private String name;

    public UnConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(User user) {
        System.out.println("������flyweight:"+name+ "�û�����"+user.getName());
    }
}
