package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 加法
 *
 * @author sobann
 */
public class Add extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
