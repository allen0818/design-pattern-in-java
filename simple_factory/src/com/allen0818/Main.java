package com.allen0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("請輸入數字A:");
            String strNumberA = br.readLine();

            System.out.println("請輸入運算符號(+、-、*、/):");
            String strOperate = br.readLine();

            System.out.println("請輸入數字B:");
            String strNumberB = br.readLine();

            Operation oper = OperationFactory.createOperation(strOperate);
            oper.setNumber(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB));


//            String strResult;
//            strResult = String.valueOf(Operation.GetResult(
//                    Double.parseDouble(strNumberA),
//                    Double.parseDouble(strNumberB),
//                    strOperate
//            ));

            String strResult = String.valueOf(oper.GetResult());
            System.out.println("結果是: " + strResult);

        } catch (Exception ex) {
            System.out.println("您的輸入有誤: " + ex.getMessage());
        }
    }
}
