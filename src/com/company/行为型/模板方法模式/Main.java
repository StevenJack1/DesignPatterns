package com.company.行为型.模板方法模式;

public class Main {

    public static void main(String[] args) {
        TestPaper testPaper1 = new Person1();
        testPaper1.paper1();
        testPaper1.paper2();
        testPaper1.paper3();

        TestPaper testPaper2 = new Person2();
        testPaper2.paper1();
        testPaper2.paper2();
        testPaper2.paper3();

    }
}
