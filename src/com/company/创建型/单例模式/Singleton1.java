package com.company.创建型.单例模式;

//只适用于单线程环境
public class Singleton1 {

    // 单例模式,要求只生成一个实例，因此我们必须把构造函数设为私有函数以禁止他人创建实例。
    private Singleton1(){}

    private static Singleton1 instance = null;

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }


}
