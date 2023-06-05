package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 减法
 *
 * @author sobann
 */
public class Sub extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
