package com.company.结构型.桥接模式.原始;

/**
 * 具体实现类
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法");
    }
}
