package com.company.创建型.建造者模式_生成器模式;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreateBuilder();

        director.construct(builder);
        Product product = builder.get();
        product.show();

    }
}
