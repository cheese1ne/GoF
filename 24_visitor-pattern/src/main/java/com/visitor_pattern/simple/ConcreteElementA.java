package com.visitor_pattern.simple;

/**
 * 具体元素A
 *
 * @author sobann
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
    }
}
