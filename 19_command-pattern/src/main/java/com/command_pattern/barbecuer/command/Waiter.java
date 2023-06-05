package com.command_pattern.barbecuer.command;

import com.command_pattern.barbecuer.Command;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 * 对应着invoker
 *
 * @author sobann
 */
public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public void setOrder(Command command) {
        if ("BakeChickenWingCommand".equals(command.getClass().getSimpleName())) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        }else {
            this.commandList.add(command);
            System.out.println("增加订单：" + command.getClass().getSimpleName() + " 时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }

    /**
     * 通知执行
     */
    public void notifyCommand() {
        for (Command command : commandList) {
            command.executeCommand();
        }
    }

    /**
     * 取消订单
     */
    public void cancelOrder(Command command){
        this.commandList.remove(command);
        System.out.println("取消订单：" + command.getClass().getSimpleName() + " 时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
