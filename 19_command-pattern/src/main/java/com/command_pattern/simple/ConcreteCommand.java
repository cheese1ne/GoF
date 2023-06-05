package com.command_pattern.simple;

/**
 * 具体命令类
 * 将一个接受者对象绑定与一个动作，调用接受者相应的操作以实现executeCommand
 *
 * @author sobann
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.action();
    }
}
