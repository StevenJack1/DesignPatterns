package com.company.行为型.职责链模式.原始;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request > 10 && request < 20){
            System.out.println("处理请求10-20："+request);
        } else {
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
