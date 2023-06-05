package com.observer_pattern.lose.observable;

import com.observer_pattern.lose.Event;
import com.observer_pattern.lose.Observer;

/**
 * 老师
 * 观察者
 *
 * @author sobann
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        System.out.println("老师" + this.name + "收到广播通知的消息" + event.toString());
    }
}
