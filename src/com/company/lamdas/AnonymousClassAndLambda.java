package com.company.lamdas;

import java.util.Comparator;
import java.util.List;

/**
 * Created by lee on 2017. 4. 25..
 */
public class AnonymousClassAndLambda {

    public void sort(List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

// 여기서 this는 객체 자신이 아니라 클래스를 가르킨다.
//                this.count();
                AnonymousClassAndLambda.this.count();
                return o1.compareTo(o2);
            }
        });

    }

    public void sort2(List<Integer> list) {

        list.sort(this::lambda$0);
    }

    private int lambda$0(Integer i1, Integer i2) {
        this.count(); //여기서 this는 AnonymousClassAndLambda
        return i1.compareTo(i2);
    }

    private void count() {};



}
