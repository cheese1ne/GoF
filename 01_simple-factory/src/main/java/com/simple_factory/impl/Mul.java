package com.simple_factory.impl;

import com.simple_factory.Operation;

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
