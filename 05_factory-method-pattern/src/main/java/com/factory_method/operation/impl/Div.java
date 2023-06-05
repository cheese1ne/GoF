package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 除法
 *
 * @author sobann
 */
public class Div extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为0!");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
