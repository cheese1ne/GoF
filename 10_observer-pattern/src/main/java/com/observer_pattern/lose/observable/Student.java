package com.observer_pattern.lose.observable;

import com.observer_pattern.lose.Event;
import com.observer_pattern.lose.Observer;

/**
 * 学生类
 * 观察者
 *
 * @author sobann
 */
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        System.out.println("学生" + this.name + "收到广播通知的消息" + event.toString());
    }
}
