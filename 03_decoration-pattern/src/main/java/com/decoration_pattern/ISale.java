package com.decoration_pattern;

/**
 * 一个顶层的职责接口
 *
 * @author sobann
 */
public interface ISale {

    /**
     * 计算需要支付的金额
     *
     * @param price 单价
     * @param num   数量
     * @return 要支付的金额
     */
    double acceptCash(double price, int num);
}
