package com.state_pattern.thread;

/**
 * 线程
 * 线程的行为取决于线程的状态
 * 可运行、运行中、等待、休眠、阻塞、死亡
 * 一般根据生命周期具有不同行为
 *
 * @author sobann
 */
public class Thread {

    private State state;

    public Thread(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("current state is: " + this.state.getClass().getName());
    }

    public void run() {
        this.state.handle(this);
    }
}
