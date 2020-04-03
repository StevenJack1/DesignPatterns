package com.company.行为型.备忘录模式;

public class GameRole {

    private int shengming;
    private int fangyu;
    private int gongji;

    public void show(){
        System.out.println("角色当前状态：");
        System.out.println("生命："+this.shengming);
        System.out.println("防御："+this.fangyu);
        System.out.println("攻击："+this.gongji);
    }

    public void init(){
        this.shengming = 100;
        this.fangyu = 100;
        this.gongji = 100;
    }

    public void fight(){
        this.shengming = 0;
        this.fangyu = 0;
        this.gongji = 0;
    }
    // 保存游戏状态
    public RoleStateMemento saveState(){
        return (new RoleStateMemento(shengming,fangyu,gongji));
    }

    // 回复游戏状态
    public void recovery(RoleStateMemento roleStateMemento){
        this.gongji = roleStateMemento.getGongji();
        this.fangyu = roleStateMemento.getFangyu();
        this.shengming = roleStateMemento.getShengming();
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
