package com.company.������.���󹤳�ģʽ;

public class SqlserverDepartment implements IDepartment{

    @Override
    public void insert(Department department){
        System.out.println("��SQl server�в���һ������");
    }
    @Override
    public Department get(int id){
        System.out.println("��SQl server�л�ȡ��Ϣ");
        return null;
    }
}
