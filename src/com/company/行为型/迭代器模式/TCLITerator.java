package com.company.行为型.迭代器模式;

public class TCLITerator implements ITerator {
    private Object[] obj = {"CCTV1","CCTV2","CCTV3","CCTV4","CCTV5","CCTV6","CCTV7","CCTV8","CCTV9","CCTV10","CCTV11","CCTV12","CCTV13","CCTVnews"};

    //当前频道
    private int currentIndex = 0;

    @Override
    public void setChannel(int i) {
        this.currentIndex = i;
    }

    @Override
    public Object currentChannel() {
        return obj[currentIndex];
    }

    @Override
    public void next() {
        if(currentIndex<obj.length){
            currentIndex++;
        }
    }

    @Override
    public void prevoius() {
        if(currentIndex>-1){
            currentIndex--;
        }
    }

    @Override
    public boolean isLast() {
        if(currentIndex<14){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isFirst() {
        if(currentIndex>-1){
            return false;
        } else {
            return true;
        }
    }
}

