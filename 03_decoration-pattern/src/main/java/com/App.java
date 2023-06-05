package com;

import com.decoration_pattern.CashContext;

/**
 * 模拟上层模块
 * 装饰模式
 *                          Component(顶层职责)
 *  ConcreteComponent(被装饰者)                     Decorator(装饰抽象)
 *                                      ConcreteDecoratorA(具体的装饰对象A) ConcreteDecoratorB(具体的装饰对象B)

 * @author sobann
 */
public class App {
    public static void main(String[] args) {
        // 装饰模式 + 简单工厂 (将多变的业务简单化)

        // 先打8折，再满300减100
        CashContext context = new CashContext(5);
        double result = context.getResult(100, 10);
        System.out.println("result = " + result);

        // 先满300减100，再打8折
        context = new CashContext(6);
        result = context.getResult(100, 10);
        System.out.println("result = " + result);
    }
}
