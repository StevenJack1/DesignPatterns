package com.company.��Ϊ��.������ģʽ;

public class TCLAggreate implements Aggreate {
    @Override
    public ITerator createIterator() {
        return new TCLITerator();
    }
}
