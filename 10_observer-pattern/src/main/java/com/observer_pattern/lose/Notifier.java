package com.observer_pattern.lose;

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
    <T extends Observer> void addObserver(T observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    <T extends Observer> void removeObserver(T observer);

    /**
     * 通知观察者
     *
     * @param event 事件
     */
    void notifyObserver(Event event);
}
