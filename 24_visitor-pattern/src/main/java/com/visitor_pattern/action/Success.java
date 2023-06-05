package com.visitor_pattern.action;

/**
 * 关于成功
 *
 * @author sobann
 */
public class Success extends Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + "时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + "时，背后大多有个不成功的男人。");
    }
}
