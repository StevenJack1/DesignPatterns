package com.company.结构型.桥接模式.原始;

public class Main {
    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();

        refinedAbstraction.setImplementor(new ConcreteImplementorA());
        refinedAbstraction.operation();

        refinedAbstraction.setImplementor(new ConcreteImplementorB());
        refinedAbstraction.operation();
    }
}
