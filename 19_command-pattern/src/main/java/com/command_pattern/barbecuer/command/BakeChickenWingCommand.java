package com.command_pattern.barbecuer.command;

import com.command_pattern.barbecuer.Barbecuer;
import com.command_pattern.barbecuer.Command;

/**
 * 烤鸡翅命令类
 *
 * @author sobann
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
