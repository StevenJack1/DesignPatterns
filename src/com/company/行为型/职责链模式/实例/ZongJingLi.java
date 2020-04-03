package com.company.行为型.职责链模式.实例;

public class ZongJingLi extends Manager {
    public ZongJingLi(String name) {
        super(name);
    }


    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == "请假"){
            System.out.println("总经理可以处理任何时间的请假");
        } else if (request.getType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(request.getNumber()+"元的加薪可以接收");
        } else if (request.getType().equals("加薪") && request.getNumber() > 500){
            System.out.println(request.getNumber()+"不被接受");
        }
    }
}
