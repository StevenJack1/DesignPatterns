package com.company.������.���󹤳�ģʽ;

public class AcessUser implements IUser{
    @Override
    public void insert(User user){
        System.out.println("��Acess�в���һ������");
    }
    @Override
    public User get(int id){
        System.out.println("��Acess�л�ȡuser��Ϣ");
        return null;
    }
}
