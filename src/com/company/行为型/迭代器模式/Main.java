package com.company.��Ϊ��.������ģʽ;

public class Main {
    public static void display(Aggreate tv){
        ITerator tvIterator = tv.createIterator();
        System.out.println("���������Ŀ��");
        while(!tvIterator.isLast()){
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.next();
        }
    }

    public static void reverseDisplay(Aggreate tv){
        ITerator tvIterator = tv.createIterator();
        tvIterator.setChannel(13);
        System.out.println("���������Ŀ��");
        while(!tvIterator.isFirst()){
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.prevoius();
        }
    }

    public static void main(String[] args){
        Aggreate tv;
        tv = new TCLAggreate();
        display(tv);
        System.out.println("-----------------------------");
        reverseDisplay(tv);
    }

}
