package com.mediator_pattern.simple;

/**
 * 抽象中介者
 *
 * @author sobann
 */
public abstract class Mediator {

    /**
     * 向同事发送消息
     *
     * @param message
     * @param colleague
     */
    public abstract void send(String message, Colleague colleague);
}
