package com.company.结构型.适配器模式;

public class Main {
    public static void main(String[] args) {
        Player qianFeng = new QianFeng("yzf");
        qianFeng.attack();
        Player houWei = new HouWei("zzw");
        houWei.attack();

        Player fanYi = new FanYi("ym");
        fanYi.attack();

    }
}
