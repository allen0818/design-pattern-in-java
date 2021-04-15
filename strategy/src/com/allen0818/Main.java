package com.allen0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try {
            CashContext context = new CashContext("滿300送100");
            double totalPrice = 0d;

            System.out.println("請輸入商品原價:");
            String priceStr = br.readLine();

            totalPrice = context.getResult(Double.parseDouble(priceStr));
            System.out.println("商品總價: " + totalPrice);

        } catch (Exception ex) {
	        System.out.println("發生錯誤: " + ex.getMessage());
        }


    }
}
