package com.company.��Ϊ��.ְ����ģʽ.ʵ��;

public class ZongJian extends Manager {

    public ZongJian(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals("���") && request.getNumber() < 5){
            System.out.println("�ܼ���Դ���5������");
        } else{
            if (superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
