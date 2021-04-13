package com.allen0818;

public class OperationFactory {
    public static Operation createOperation(String operate) throws Exception {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationDel();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationSub();
                break;
            default:
                throw new Exception("請輸入正確的操作字元。");
        }
        return oper;
    }
}
