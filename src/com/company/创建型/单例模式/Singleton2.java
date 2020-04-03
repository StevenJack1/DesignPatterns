package com.company.创建型.单例模式;

//多线程环境单利模式
public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 instance = null;
    private final static Object syncLock = new Object();

    public static Singleton2 getInstance(){
        if (instance == null){
            synchronized (syncLock){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }

}
