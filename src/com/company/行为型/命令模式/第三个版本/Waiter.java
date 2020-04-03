package com.company.行为型.命令模式.第三个版本;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    // 一次存放所有请求再通知
   private List<Command> commandList = new ArrayList<>();
   private int jichi = 100;

   // 设置订单,如果没货则告知没货了
   public void setOrder(Command command){
       if (jichi <= 0){
           System.out.println("没有东西了");
       } else {
           commandList.add(command);
           // 记录日志
           System.out.println("增加订单:");
       }
   }

   public void cancelOrder(Command command){
       commandList.remove(command);
       System.out.println("取消订单");
   }


    public void notify1(){
        for (Command command : commandList){
            command.executeComm();
        }
    }
}
