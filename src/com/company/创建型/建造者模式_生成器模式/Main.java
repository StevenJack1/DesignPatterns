package com.company.������.������ģʽ_������ģʽ;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreateBuilder();

        director.construct(builder);
        Product product = builder.get();
        product.show();

    }
}
