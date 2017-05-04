package com.company.designPattern.st;

/**
 * Created by lee on 2017. 4. 4..
 */
public class Context {

    private St st;

    public Context(St st){
        this.st = st;
    }

    public int executeSt(int num1, int num2){
      return  st.operation(num1,num2);
    }
}
