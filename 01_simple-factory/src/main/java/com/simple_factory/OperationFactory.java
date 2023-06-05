package com.simple_factory;

import com.simple_factory.impl.Add;
import com.simple_factory.impl.Div;
import com.simple_factory.impl.Mul;
import com.simple_factory.impl.Sub;

/**
 * 运算工厂类
 *
 * @author sobann
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
            default:
                operation = null;
        }
        return operation;

    }
}
