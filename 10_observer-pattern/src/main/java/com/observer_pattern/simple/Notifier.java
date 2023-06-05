package com.observer_pattern.simple;

/**
 * 通知者抽象接口
 *
 * @author sobann
 */
public interface Notifier {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     *
     * @param event 事件
     */
    void notifyObserver(Event event);
}
