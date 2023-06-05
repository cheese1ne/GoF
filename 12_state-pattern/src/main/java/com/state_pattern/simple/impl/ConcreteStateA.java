package com.state_pattern.simple.impl;

import com.state_pattern.simple.Context;
import com.state_pattern.simple.State;

/**
 * 具体的状态A
 * 状态A的下一个状态是状态B
 * @author sobann
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
