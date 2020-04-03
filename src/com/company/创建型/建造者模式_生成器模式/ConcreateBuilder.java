package com.company.创建型.建造者模式_生成器模式;


public class ConcreateBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("A");
    }

    @Override
    public void BuildPartB() {
        product.Add("B");
    }

    @Override
    public Product get() {
        return product;
    }
}
