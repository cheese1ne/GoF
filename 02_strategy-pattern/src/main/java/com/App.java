package com;

import com.strategy_pattern.CashContext;

/**
 * 模拟上层模块
 * 策略模式
 *      strategy       ---------        context(strategy)
 *  strategyA strategyB ...
 *
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        // 策略+简单工厂实现 业务计算
        CashContext context = new CashContext(4);
        double result = context.getResult(100, 5);
        System.out.println("result = " + result);
    }
}
