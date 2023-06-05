package com.observer_pattern.simple;

/**
 * 观察者抽象接口
 *
 * @author sobann
 */
public interface Observer {

    /**
     * 观察者更新自身的状态以保证与事件相协调
     *
     * @param event
     */
    void update(Event event);
}
