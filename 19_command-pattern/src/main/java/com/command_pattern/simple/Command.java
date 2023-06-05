package com.command_pattern.simple;

/**
 * 抽象命令
 * 声明执行操作的接口
 *
 * @author sobann
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
