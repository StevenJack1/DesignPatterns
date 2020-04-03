package com.company.结构型.桥接模式.原始;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体B方法的执行");
    }
}
