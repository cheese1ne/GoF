package com.state_pattern.thread.state;

import com.state_pattern.thread.State;
import com.state_pattern.thread.Thread;

/**
 * 死亡状态
 *
 * @author sobann
 */
public class Death extends State {
    @Override
    public void handle(Thread thread) {
        // free memory
        System.out.println("free memory");
        System.out.println("it cannot run because the thread is dead. ");
    }
}
