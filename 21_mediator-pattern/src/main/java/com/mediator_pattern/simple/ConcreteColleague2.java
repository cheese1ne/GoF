package com.mediator_pattern.simple;

/**
 * 具体同事2
 *
 * @author sobann
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
