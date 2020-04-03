package com.company.������.ԭ��ģʽ;

public class ConcretePrototype extends Prototype{
    private String name;
    private int age;
    private String sex;

    public ConcretePrototype(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public Prototype myClone() {
        return new ConcretePrototype(name,age,sex);
    }

    @Override
    public String toString() {
        System.out.println("������"+ name);
        System.out.println("���䣺"+ age);
        System.out.println("�Ա�"+ sex);
        return null;
    }
}
