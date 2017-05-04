package com.company.designPattern.st;

/**
 * Created by lee on 2017. 4. 4..
 */
public class Client {

    public static void main(String[] args) {

        Context add = new Context(new OperationAdd());
        System.out.println(add.executeSt(10,20));

        Context multiply = new Context(new OperationMultiply());

        System.out.println(multiply.executeSt(10,20));




    }
}

