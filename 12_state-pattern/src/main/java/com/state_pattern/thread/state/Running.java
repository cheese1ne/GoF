package com.state_pattern.thread.state;

import com.state_pattern.thread.State;
import com.state_pattern.thread.Thread;

/**
 * 运行状态
 *
 * @author sobann
 */
public class Running extends State {
    @Override
    public void handle(Thread thread) {
        // do some work
        System.out.println("do some work");
        thread.setState(new Death());
    }
}
