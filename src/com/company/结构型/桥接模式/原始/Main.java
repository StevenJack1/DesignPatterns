package com.company.�ṹ��.�Ž�ģʽ.ԭʼ;

public class Main {
    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();

        refinedAbstraction.setImplementor(new ConcreteImplementorA());
        refinedAbstraction.operation();

        refinedAbstraction.setImplementor(new ConcreteImplementorB());
        refinedAbstraction.operation();
    }
}
