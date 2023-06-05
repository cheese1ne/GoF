package com;

import com.observer_pattern.lose.Broadcast;
import com.observer_pattern.lose.LoseEvent;
import com.observer_pattern.lose.observable.Student;
import com.observer_pattern.lose.observable.Teacher;
import com.observer_pattern.simple.Event;
import com.observer_pattern.simple.SimpleNotifier;
import com.observer_pattern.simple.SimpleObserver;

/**
 * 观察者模式
 * 一对多的模型
 * jdk内置的观察者模式: Observer(观察者接口)、Observable(通知者)
 * Spring的事件广播和监听使用观察者模式
 * tip: jdk中内置的观察者模式的通知者Observable是一个已过时的实体类(不建议使用内置的观察者)
 * <p>
 * event-------> Notifier(通知者)
 * ObserverA,ObserverB,ObserverC,...(具体的观察者)
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        // 一个简单的通知观察模型
        simple();
        // 下面是一则失物招领的广播，请失主迅速到广播室领取失物~
        lose();
    }

    /**
     * 一个简单的通知观察模型
     */
    public static void simple() {
        // 通知者
        com.observer_pattern.simple.Notifier notifier = new SimpleNotifier();
        // 观察者A
        com.observer_pattern.simple.Observer observerA = new SimpleObserver("A");
        com.observer_pattern.simple.Observer observerB = new SimpleObserver("B");
        com.observer_pattern.simple.Observer observerC = new SimpleObserver("C");
        // 观察者注册到通知者列表中
        notifier.addObserver(observerA);
        notifier.addObserver(observerB);
        notifier.addObserver(observerC);

        // 出现了一个事件，给所有注册的观察者推送事件，让观察者修改自身的状态
        notifier.notifyObserver(new Event());

        // observerB取消注册
        notifier.removeObserver(observerB);
        // 又发生了一个事件，给所有注册的观察者推送事件
        notifier.notifyObserver(new Event());
    }

    /**
     * 下面是一则失物招领的广播，请失主迅速到广播室领取失物~
     */
    public static void lose() {
        // 学校广播台
        com.observer_pattern.lose.Notifier notifier = new Broadcast();
        // 学生
        com.observer_pattern.lose.Observer studentA = new Student("A");
        com.observer_pattern.lose.Observer studentB = new Student("B");
        // 老师
        com.observer_pattern.lose.Observer teacherC = new Teacher("C");
        com.observer_pattern.lose.Observer teacherD = new Teacher("D");
        // 学生和老师都在学校里收听广播
        notifier.addObserver(studentA);
        notifier.addObserver(studentB);
        notifier.addObserver(teacherC);
        notifier.addObserver(teacherD);

        // 下面是一则失物招领的广播
        notifier.notifyObserver(new LoseEvent("钥匙"));

    }
}
