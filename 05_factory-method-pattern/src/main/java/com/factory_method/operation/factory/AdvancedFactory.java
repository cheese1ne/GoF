package com.factory_method.operation.factory;

import com.factory_method.operation.IFactory;
import com.factory_method.operation.Operation;
import com.factory_method.operation.impl.Log;
import com.factory_method.operation.impl.Pow;

/**
 * 高级运算工厂
 *
 * @author sobann
 */
public class AdvancedFactory implements IFactory {

    @Override
    public Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "pow":
                operation = new Pow();
                break;
            case "log":
                operation = new Log();
                break;
            default:
        }
        return operation;
    }
}
