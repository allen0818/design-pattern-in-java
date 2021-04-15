package com.allen0818.factory;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
