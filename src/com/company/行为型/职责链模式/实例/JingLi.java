package com.company.��Ϊ��.ְ����ģʽ.ʵ��;

public class JingLi extends Manager {

    public JingLi(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == "���" && request.getNumber() < 2){
            System.out.println("������Դ�����������");
        } else{
            if (superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
