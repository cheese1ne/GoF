package com.memento_pattern.simple;

/**
 * 发起人
 *
 * @author sobann
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 显示数据
     */
    public void show() {
        System.out.println("state: " + state);
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento createMemento() {
        // 需要保存的信息导入并实例化一个备忘录对象
        return new Memento(this.state);
    }

    /**
     * 恢复备忘录
     *
     * @param memento
     */
    public void recoveryMemento(Memento memento) {
        // 从备忘录导入数据并恢复
        this.setState(memento.getState());
    }
}
