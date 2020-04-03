package com.company.模板方法模式;

public abstract class TestPaper {

    public void paper1(){
        System.out.println("测试1：");
        System.out.println("答案：" + answer1());
    }

    public void paper2(){
        System.out.println("测试2：");
        System.out.println("答案："+answer2());
    }

    public void paper3(){
        System.out.println("测试3：");
        System.out.println("答案："+answer3());
    }

    abstract String answer1();
    abstract String answer2();
    abstract String answer3();

}
