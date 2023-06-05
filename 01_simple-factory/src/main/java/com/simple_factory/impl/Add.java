package com.simple_factory.impl;

import com.simple_factory.Operation;

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
