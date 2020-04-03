package com.company.创建型.建造者模式_生成器模式;

public class Director {

    public void construct(Builder builder){

        builder.BuildPartA();
        builder.BuildPartB();

    }

}
