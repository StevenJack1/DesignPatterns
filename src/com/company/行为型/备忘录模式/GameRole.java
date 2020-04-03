package com.company.��Ϊ��.����¼ģʽ;

public class GameRole {

    private int shengming;
    private int fangyu;
    private int gongji;

    public void show(){
        System.out.println("��ɫ��ǰ״̬��");
        System.out.println("������"+this.shengming);
        System.out.println("������"+this.fangyu);
        System.out.println("������"+this.gongji);
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
    // ������Ϸ״̬
    public RoleStateMemento saveState(){
        return (new RoleStateMemento(shengming,fangyu,gongji));
    }

    // �ظ���Ϸ״̬
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
