package com.company.行为型.职责链模式.原始;

public class Main {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);

        int[] requests = {2,4,15,19,21};

        for (int request : requests){
            concreteHandler1.handleRequest(request);
        }
    }
}
