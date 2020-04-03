package com.company.结构型.组合模式;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.create(new Leaf("leaf A"));
        root.create(new Leaf("leaf B"));

        Composite x = new Composite("X");
        x.create(new Leaf("leaf C"));
        x.create(new Leaf("leaf D"));

        root.create(x);

        root.show(1);

    }
}
