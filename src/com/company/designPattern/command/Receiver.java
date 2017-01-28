package com.company.designPattern.command;

/**
 * Created by lee on 2017. 1. 13..
 */

// 실제 일을 수행한다.
public interface Receiver {
    void save();
    void open();
    void close();
}
