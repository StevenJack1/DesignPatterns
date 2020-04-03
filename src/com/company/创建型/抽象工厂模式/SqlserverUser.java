package com.company.创建型.抽象工厂模式;

public class SqlserverUser implements IUser{

    @Override
    public void insert(User user){
        System.out.println("向Sql Server中插入一条数据");
    }
    @Override
    public User get(int id){
        System.out.println("在sql server中获取user信息");
        return null;
    }

}
