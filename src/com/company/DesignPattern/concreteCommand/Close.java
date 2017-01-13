package com.company.DesignPattern.concreteCommand;

import com.company.DesignPattern.Command;
import com.company.DesignPattern.Receiver;

/**
 * Created by lee on 2017. 1. 13..
 */
// Receiver 생성자를 통해 주입을 하고, Command 상속하여 구처적인 Receiver 일을 수행한다.
public class Close implements Command{

    private final Receiver receiver;

    public Close(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void perform() {
        receiver.close();
    }
}