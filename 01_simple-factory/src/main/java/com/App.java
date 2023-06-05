package com;

import com.simple_factory.Operation;
import com.simple_factory.OperationFactory;

/**
 * 模拟上层模块
 * 简单工厂
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        // 一个运算处理的简单工厂实现
        Operation operation = OperationFactory.createOperation("/");
        double result = operation.getResult(1, 2);
        System.out.println("result = " + result);
    }
}
