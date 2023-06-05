package com.visitor_pattern.simple;

/**
 * 具体元素B
 *
 * @author sobann
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
    }
}
