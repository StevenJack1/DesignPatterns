package com.company.行为型.职责链模式.原始;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 20 && request < 30){
            System.out.println("处理请求20-30："+request);
        } else {
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
