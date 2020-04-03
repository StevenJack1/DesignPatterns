package com.company.结构型.装饰模式;

/**
 * Component类，定义一个对象的接口，可以给这些对象动态的添加职责
 */
public class Person {
    public Person() {
    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
}
