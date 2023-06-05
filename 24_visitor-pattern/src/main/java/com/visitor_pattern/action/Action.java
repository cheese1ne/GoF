package com.visitor_pattern.action;

/**
 * 行为结论抽象
 *
 * @author sobann
 */
public abstract class Action {

    /**
     * 得到男人结论或反应
     * @param concreteElementA
     */
    public abstract void getManConclusion(Man concreteElementA);

    /**
     * 得到女人结论或反应
     * @param concreteElementA
     */
    public abstract void getWomanConclusion(Woman concreteElementA);


}
