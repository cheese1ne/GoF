package com.visitor_pattern.simple;

/**
 * 具体访问者2
 *
 * @author sobann
 */
public class ConcreteVisitor2 extends Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }
}
