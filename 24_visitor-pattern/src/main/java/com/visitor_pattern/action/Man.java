package com.visitor_pattern.action;

/**
 * 男人
 *
 * @author sobann
 */
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
