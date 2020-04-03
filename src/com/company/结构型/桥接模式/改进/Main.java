package com.company.结构型.桥接模式.改进;

public class Main {
    public static void main(String[] args) {
        Brand brandn = new BrandN();
        brandn.setSoft(new Game());
        brandn.run();
        brandn.setSoft(new Address());
        brandn.run();

        Brand brandm = new BrandM();
        brandm.setSoft(new Game());
        brandm.run();
        brandm.setSoft(new Address());
        brandm.run();
    }
}
