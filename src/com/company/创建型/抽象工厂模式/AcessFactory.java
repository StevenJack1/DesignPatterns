package com.company.������.���󹤳�ģʽ;

public class AcessFactory implements IFactory{

    @Override
    public IUser createUser(){
        return new AcessUser();
    }

    @Override
    public IDepartment createDepartment(){
        return new AcessDepartment();
    }

}
