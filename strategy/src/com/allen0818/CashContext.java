package com.allen0818;

import com.allen0818.factory.CashNormal;
import com.allen0818.factory.CashRebate;
import com.allen0818.factory.CashReturn;
import com.allen0818.factory.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(String type) {
        switch (type) {
            case "正常收費":
                cs = new CashNormal();
                break;
            case "滿300送100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
