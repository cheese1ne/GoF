package com.command_pattern.barbecuer.command;

import com.command_pattern.barbecuer.Barbecuer;
import com.command_pattern.barbecuer.Command;

/**
 * 烤羊肉串命令类
 *
 * @author sobann
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
