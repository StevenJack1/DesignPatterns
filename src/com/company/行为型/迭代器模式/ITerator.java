package com.company.行为型.迭代器模式;

public interface ITerator {
    public void setChannel(int i); // 设置初始频道
    public Object currentChannel();   // 返回当前频道
    public void next();                 //下一个频道
    public void prevoius();             //上一个频道
    public boolean isLast();            //是否为最后一个频道
    public boolean isFirst();           //是否为第一个频道
}
