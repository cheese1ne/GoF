package com;

import com.factory_method.operation.Operation;
import com.factory_method.operation.OperationFactory;
import com.factory_method.sale.CashContext;

/**
 * 工厂方法
 * IFactory -> Product ----------------  ProductBuildFactory
 * FactoryA  FactoryB
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        // 单纯的工厂方法
        operation();
        // 简单工厂(具体IFactory的实现) + 策略(ISale的具体实现) + 装饰(CashSuper实现的装饰者) + 工厂方法(CashContext构建工厂隐藏具体策略实例创建过程)
        sale();
    }

    /**
     * 一个简单的工厂方法demo
     */
    public static void operation() {
        // 一个运算处理的简单工厂实现
        Operation operation = OperationFactory.createOperation("log");
        double result = operation.getResult(2, 2);
        System.out.println("result = " + result);
    }

    /**
     * 简单工厂 + 策略模式 + 装饰模式 + 工厂方法
     */
    public static void sale() {
        // 基础的运算
        CashContext context = new CashContext(1);
        double result = context.getResult(300, 3);
        System.out.println("sale = " + result);
        // 只打8折
        context = new CashContext(2);
        result = context.getResult(300, 3);
        System.out.println("sale = " + result);
        // 七折
        context = new CashContext(3);
        result = context.getResult(300, 3);
        System.out.println("sale = " + result);
        // 满300 减100
        context = new CashContext(4);
        result = context.getResult(300, 3);
        System.out.println("sale = " + result);
        // 先打8折 再满300 减100
        context = new CashContext(5);
        result = context.getResult(300, 3);
        System.out.println("sale = " + result);
        // 先满300 减100 再打8折
        context = new CashContext(6);
        result = context.getResult(300, 3);
        System.out.println("sale = " + result);

    }
}
