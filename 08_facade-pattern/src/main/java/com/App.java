package com;

import com.facade_pattern.fund.Fund;
import com.facade_pattern.simple.Facade;

/**
 * 外观模式
 * Client ----->    Facade (sys1,sys2,sys3,sys4 ....)
 * 例如mybatis中的SqlSession就是一个典型的外观模式
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        // 模拟通过外观类Facade内部封装四个复杂的子系统实现特定功能A和B
        simple();
        // 通过基金操作完成股票、国债、房地产模块的买入卖出操作
        fund();
    }

    /**
     * 模拟通过外观类Facade内部封装四个复杂的子系统实现特定功能A和B
     */
    public static void simple() {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("..........");
        facade.methodB();
    }

    /**
     * 模拟用户通过基金操作来完成股票、国债、房地产模块的买入卖出操作
     */
    public static void fund() {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
