package com.company.��Ϊ��.ְ����ģʽ.ԭʼ;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 0 && request < 10){
            System.out.println("��������0-10��"+request);
        } else {
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
