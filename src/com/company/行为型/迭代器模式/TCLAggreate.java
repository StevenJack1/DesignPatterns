package com.company.行为型.迭代器模式;

public class TCLAggreate implements Aggreate {
    @Override
    public ITerator createIterator() {
        return new TCLITerator();
    }
}
