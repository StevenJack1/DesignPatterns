package com.company.结构型.适配器模式;

public class WaiJi {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack1(){
        System.out.println(this.name+"外籍人员进攻");
    }

    public void defense1(){
        System.out.println(this.name+"外籍人员防守");
    }
}
