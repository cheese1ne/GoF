package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 乘法
 *
 * @author sobann
 */
public class Mul extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
