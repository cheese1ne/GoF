package com.simple_factory.impl;

import com.simple_factory.Operation;

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
