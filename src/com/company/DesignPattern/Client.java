package com.company.DesignPattern;

import com.company.DesignPattern.concreteCommand.Close;
import com.company.DesignPattern.concreteCommand.Open;
import com.company.DesignPattern.concreteCommand.Save;

/**
 * Created by lee on 2017. 1. 13..
 */
public class Client {

    public static Receiver receiver() {
        return new Receiver() {
            @Override
            public void save() {
                System.out.println("save");
            }

            @Override
            public void open() {
                System.out.println("open");
            }

            @Override
            public void close() {
                System.out.println("close");
            }
        };
    }


    public static void main(String[] args) {


        System.out.println("-------------------------- OOP호출 코드 --------------------------");

        Invoker invoker = new Invoker();
        invoker.record(new Open(receiver()));
        invoker.record(new Save(receiver()));
        invoker.record(new Close(receiver()));
        invoker.run();

        System.out.println("------------------------------------------------------------------");



        System.out.println("-------------------------- lamda호출 코드 --------------------------");

        Invoker lamda = new Invoker();
        lamda.record(() -> receiver().open());
        lamda.record(() -> receiver().save());
        lamda.record(() -> receiver().close());
        lamda.run();

        System.out.println("------------------------------------------------------------------");




        System.out.println("-------------------------- MethodReference 코드 --------------------------");

        Invoker MethodReference = new Invoker();
        MethodReference.record(receiver()::open);
        MethodReference.record(receiver()::save);
        MethodReference.record(receiver()::close);
        MethodReference.run();

        System.out.println("-------------------------------------------");

    }



}
