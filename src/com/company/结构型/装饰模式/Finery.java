package com.company.结构型.装饰模式;

/**
 * Decorator装饰抽象类，继承了Component类的功能，也就是Person，
 */
public class Finery extends Person{
    protected Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null){
            person.show();
        }
    }
}
