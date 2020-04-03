package com.company.行为型.迭代器模式;

public class Main {
    public static void display(Aggreate tv){
        ITerator tvIterator = tv.createIterator();
        System.out.println("正向输出节目表：");
        while(!tvIterator.isLast()){
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.next();
        }
    }

    public static void reverseDisplay(Aggreate tv){
        ITerator tvIterator = tv.createIterator();
        tvIterator.setChannel(13);
        System.out.println("逆向输出节目表：");
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
