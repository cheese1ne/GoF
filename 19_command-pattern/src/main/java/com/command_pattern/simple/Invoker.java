package com.command_pattern.simple;

/**
 * 命令执行者
 * 要求该命令执行这个请求
 *
 * @author sobann
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.executeCommand();
    }
}
