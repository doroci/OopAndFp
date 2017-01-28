package com.company.designPattern.command.concreteCommand;

import com.company.designPattern.command.Command;
import com.company.designPattern.command.Receiver;

/**
 * Created by lee on 2017. 1. 13..
 */

// Receiver 생성자를 통해 주입을 하고, Command 상속하여 구처적인 Receiver 일을 수행한다.
public class Open implements Command {

    private final Receiver receiver;

    public Open(Receiver receiver){
        this.receiver = receiver;
    }


    @Override
    public void perform() {
        receiver.open();
    }
}
