package com.visitor_pattern.simple;

/**
 * 为每一个元素声明一个visit操作
 *
 * @author sobann
 */
public abstract class Visitor {

    /**
     * 元素A访问
     *
     * @param concreteElementA
     */
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    /**
     * 元素B访问
     *
     * @param concreteElementB
     */
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
