package com.state_pattern.simple;

/**
 * 上下文
 * 维护一个状态的实例，这个实例就是当前业务的状态，存储在上下文中
 *
 * @author sobann
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("current state is: " + this.state.getClass().getName());
    }

    /**
     * 模拟包含状态的上下文实例的行为，行为触发后改变状态
     */
    public void request() {
        this.state.handle(this);
    }
}
