package com.factory_method.operation.factory;

import com.factory_method.operation.IFactory;
import com.factory_method.operation.Operation;
import com.factory_method.operation.impl.Add;
import com.factory_method.operation.impl.Div;
import com.factory_method.operation.impl.Mul;
import com.factory_method.operation.impl.Sub;

/**
 * 基础运算工厂
 *
 * @author sobann
 */
public class BasicFactory implements IFactory {

    @Override
    public Operation createOperation(String operate) {
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
        }
        return operation;
    }
}
