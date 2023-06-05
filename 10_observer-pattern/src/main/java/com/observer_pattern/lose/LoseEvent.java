package com.observer_pattern.lose;

/**
 * 物品丢失的事件
 *
 * @author sobann
 */
public class LoseEvent extends Event {

    private String msg;

    public LoseEvent(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "失物: " + msg + "等待失主领取~";
    }
}
