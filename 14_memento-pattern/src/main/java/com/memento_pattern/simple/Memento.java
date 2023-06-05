package com.memento_pattern.simple;

/**
 * 备忘录
 *
 * @author sobann
 */
public class Memento {

    /**
     * 要保存的备忘录属性内容，n+
     */
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
