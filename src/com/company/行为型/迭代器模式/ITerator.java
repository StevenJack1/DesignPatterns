package com.company.��Ϊ��.������ģʽ;

public interface ITerator {
    public void setChannel(int i); // ���ó�ʼƵ��
    public Object currentChannel();   // ���ص�ǰƵ��
    public void next();                 //��һ��Ƶ��
    public void prevoius();             //��һ��Ƶ��
    public boolean isLast();            //�Ƿ�Ϊ���һ��Ƶ��
    public boolean isFirst();           //�Ƿ�Ϊ��һ��Ƶ��
}
