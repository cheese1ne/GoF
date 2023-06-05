package com.command_pattern.barbecuer;

/**
 * 抽象命令类
 *
 * @author sobann
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    /**
     * 命令执行
     */
    public abstract void executeCommand();
}
