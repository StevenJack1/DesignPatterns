package com.company.��Ϊ��.ְ����ģʽ.ԭʼ;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 20 && request < 30){
            System.out.println("��������20-30��"+request);
        } else {
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
