package com.company.������.������ģʽ_������ģʽ;


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
