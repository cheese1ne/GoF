package com.observer_pattern.lose;

import java.util.ArrayList;
import java.util.List;

/**
 * 广播台
 * 通知者
 *
 * @author sobann
 */
public class Broadcast implements Notifier {

    private final List<Observer> observers;

    public Broadcast() {
        this.observers = new ArrayList<>();
    }

    @Override
    public <T extends Observer> void addObserver(T observer) {
        observers.add(observer);
    }

    @Override
    public <T extends Observer> void removeObserver(T observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Event event) {
        for (Observer observer : this.observers) {
            observer.update(event);
        }
    }
}
