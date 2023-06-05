package com.observer_pattern.simple;

/**
 *
 *
 * @author sobann
 */
public class SimpleObserver implements Observer{

    private String name;

    public SimpleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        System.out.println("观察者"+ this.name + "接收到通知者的通知，准备更新自身的状态");
    }
}
