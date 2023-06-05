package com.facade_pattern.fund;

/**
 * 基金类
 * 用户通过基金完成股票、国债、房地产的买入卖出操作
 *
 * @author sobann
 */
public class Fund {
    /**
     * 股票
     */
    private Stock stock;
    /**
     * 国债
     */
    private NationDebt nationDebt;
    /**
     * 房地产
     */
    private Realty realty;

    public Fund() {
        this.stock = new Stock();
        this.nationDebt = new NationDebt();
        this.realty = new Realty();
    }

    /**
     * 购买基金
     */
    public void buyFund() {
        this.stock.buy();
        this.nationDebt.buy();
        this.realty.buy();
    }

    /**
     * 卖出基金
     */
    public void sellFund() {
        this.stock.sell();
        this.nationDebt.sell();
        this.realty.sell();
    }
}
