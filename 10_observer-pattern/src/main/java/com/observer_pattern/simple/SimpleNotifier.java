package com.observer_pattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者
 *
 * @author sobann
 */
public class SimpleNotifier implements Notifier{

    private final List<Observer> observers;

    public SimpleNotifier() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(Event event) {
        for (Observer observer : this.observers) {
            observer.update(event);
        }
    }
}
