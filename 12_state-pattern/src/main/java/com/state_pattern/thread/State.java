package com.state_pattern.thread;

/**
 * 线程状态的上下文抽象
 * 简化：可运行->运行->死亡
 *
 * @author sobann
 */
public abstract class State {

    /**
     * 线程状态的切换
     *
     * @param thread
     */
    public abstract void handle(Thread thread);
}
