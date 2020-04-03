package com.company.模板方法模式;

public class Person1 extends TestPaper{

    @Override
    String answer1() {
        return "a";
    }

    @Override
    String answer2() {
        return "b";
    }

    @Override
    String answer3() {
        return "c";
    }
}
