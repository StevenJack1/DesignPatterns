package com.company.创建型.原型模式;

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
        System.out.println("姓名："+ name);
        System.out.println("年龄："+ age);
        System.out.println("性别："+ sex);
        return null;
    }
}
