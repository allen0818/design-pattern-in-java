package com.allen0818.factory;

public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
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
        return cs;
    }
}
