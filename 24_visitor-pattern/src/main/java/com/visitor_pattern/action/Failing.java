package com.visitor_pattern.action;

/**
 * 对于失败
 * @author sobann
 */
public class Failing extends Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + "时，眼泪汪汪，谁也劝不了。");
    }
}
