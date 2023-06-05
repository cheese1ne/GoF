package com.state_pattern.thread.state;

import com.state_pattern.thread.State;
import com.state_pattern.thread.Thread;

/**
 * 可运行状态
 *
 * @author sobann
 */
public class Ready extends State {

    @Override
    public void handle(Thread thread) {
        System.out.println("ready obtain some data");
        thread.setState(new Running());
    }
}
