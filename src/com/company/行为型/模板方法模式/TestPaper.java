package com.company.ģ�巽��ģʽ;

public abstract class TestPaper {

    public void paper1(){
        System.out.println("����1��");
        System.out.println("�𰸣�" + answer1());
    }

    public void paper2(){
        System.out.println("����2��");
        System.out.println("�𰸣�"+answer2());
    }

    public void paper3(){
        System.out.println("����3��");
        System.out.println("�𰸣�"+answer3());
    }

    abstract String answer1();
    abstract String answer2();
    abstract String answer3();

}
