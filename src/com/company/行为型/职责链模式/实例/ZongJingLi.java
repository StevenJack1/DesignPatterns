package com.company.��Ϊ��.ְ����ģʽ.ʵ��;

public class ZongJingLi extends Manager {
    public ZongJingLi(String name) {
        super(name);
    }


    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == "���"){
            System.out.println("�ܾ�����Դ����κ�ʱ������");
        } else if (request.getType().equals("��н") && request.getNumber() <= 500){
            System.out.println(request.getNumber()+"Ԫ�ļ�н���Խ���");
        } else if (request.getType().equals("��н") && request.getNumber() > 500){
            System.out.println(request.getNumber()+"��������");
        }
    }
}
