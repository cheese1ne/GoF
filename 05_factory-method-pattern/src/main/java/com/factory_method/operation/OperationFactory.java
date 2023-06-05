package com.factory_method.operation;


import com.factory_method.operation.factory.AdvancedFactory;
import com.factory_method.operation.factory.BasicFactory;

/**
 * 运算工厂类
 *
 * @author sobann
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        IFactory factory = null;
        switch (operate) {
            case "+":
            case "-":
            case "*":
            case "/":
                // 基础运算工厂类
                factory = new BasicFactory();
                break;
            case "pow":
            case "log":
                factory = new AdvancedFactory();
                break;
            default:
                throw new RuntimeException("error operate: " + operate);
        }
        // 工厂隐藏建造细节
        operation = factory.createOperation(operate);
        return operation;

    }
}
