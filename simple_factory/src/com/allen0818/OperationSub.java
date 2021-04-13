package com.allen0818;

public class OperationSub extends Operation {
    @Override
    public double GetResult() throws Exception {
        if (numberB == 0) {
            throw new Exception("除數不得為0!");
        }
        return numberA / numberB;
    }
}
