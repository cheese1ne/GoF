package com.state_pattern.simple.impl;

import com.state_pattern.simple.Context;
import com.state_pattern.simple.State;

/**
 * 具体的状态B
 * 状态B的下一个状态是状态A
 * @author sobann
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
