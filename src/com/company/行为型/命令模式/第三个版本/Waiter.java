package com.company.��Ϊ��.����ģʽ.�������汾;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    // һ�δ������������֪ͨ
   private List<Command> commandList = new ArrayList<>();
   private int jichi = 100;

   // ���ö���,���û�����֪û����
   public void setOrder(Command command){
       if (jichi <= 0){
           System.out.println("û�ж�����");
       } else {
           commandList.add(command);
           // ��¼��־
           System.out.println("���Ӷ���:");
       }
   }

   public void cancelOrder(Command command){
       commandList.remove(command);
       System.out.println("ȡ������");
   }


    public void notify1(){
        for (Command command : commandList){
            command.executeComm();
        }
    }
}
