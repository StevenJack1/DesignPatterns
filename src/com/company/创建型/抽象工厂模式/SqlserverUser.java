package com.company.������.���󹤳�ģʽ;

public class SqlserverUser implements IUser{

    @Override
    public void insert(User user){
        System.out.println("��Sql Server�в���һ������");
    }
    @Override
    public User get(int id){
        System.out.println("��sql server�л�ȡuser��Ϣ");
        return null;
    }

}
