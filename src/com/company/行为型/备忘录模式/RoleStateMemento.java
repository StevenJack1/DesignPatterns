package com.company.行为型.备忘录模式;

public class RoleStateMemento {

    private int shengming;
    private int fangyu;
    private int gongji;

    public RoleStateMemento(int shengming, int fangyu, int gongji) {
        this.shengming = shengming;
        this.fangyu = fangyu;
        this.gongji = gongji;
    }

    public int getShengming() {
        return shengming;
    }

    public void setShengming(int shengming) {
        this.shengming = shengming;
    }

    public int getFangyu() {
        return fangyu;
    }

    public void setFangyu(int fangyu) {
        this.fangyu = fangyu;
    }

    public int getGongji() {
        return gongji;
    }

    public void setGongji(int gongji) {
        this.gongji = gongji;
    }
}
