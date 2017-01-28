package com.company.designPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lee on 2017. 1. 13..
 */
//  하나 또는 그 이상의 Command의 실행과 시퀀스를 제어한다.
public class Invoker {

    private final List<Command> commands;

    public Invoker(){
        commands = new ArrayList<>();
    }

    public void record(Command command){
        commands.add(command);
    }

    public void run() {
        commands.forEach(Command::perform);
    }
}
