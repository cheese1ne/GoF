package com.state_pattern.simple;

/**
 * 抽象状态类
 *
 * @author sobann
 */
public abstract class State {

    /**
     * 处理状态
     * 可以参考hb-activiti中多流程设计中流程阶段状态的切换
     *
     * @param context 上下文
     */
    public abstract void handle(Context context);
}
