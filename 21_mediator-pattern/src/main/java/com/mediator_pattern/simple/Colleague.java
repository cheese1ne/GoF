package com.mediator_pattern.simple;

/**
 * 抽象同事类
 *
 * @author sobann
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
