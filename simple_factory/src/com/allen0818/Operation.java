package com.allen0818;

public abstract class Operation {
    protected double numberA = 0;
    protected double numberB = 0;

    public void setNumber(double a, double b) {
        this.numberA = a;
        this.numberB = b;
    }

    /**
     * abstract method
     * @return
     */
    public abstract double GetResult() throws Exception;


//    public static double GetResult(double numberA, double numberB, String operate) {
//        double result = 0d;
//        switch (operate) {
//            case "+":
//                result = numberA + numberB;
//                break;
//            case "-":
//                result = numberA - numberB;
//                break;
//            case "*":
//                result = numberA * numberB;
//                break;
//            case "/":
//                result = numberA / numberB;
//                break;
//        }
//        return result;
//    }
}
