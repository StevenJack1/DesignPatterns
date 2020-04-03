package com.company.行为型.职责链模式.原始;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 0 && request < 10){
            System.out.println("处理请求0-10："+request);
        } else {
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
