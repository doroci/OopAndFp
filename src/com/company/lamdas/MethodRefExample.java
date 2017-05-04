package com.company.lamdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;
import static java.lang.System.setOut;

/**
 * Created by lee on 2017. 4. 25..
 */
public class MethodRefExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");
//        list.forEach((e) -> printWithTime(e));

        // method reference
        // 클래스(또는 객체)::메서드 이름
        list.forEach(MethodRefExample :: printWithTime);

        // 1. static method reference
        // 특정 클래스의 정적 메서드 참조
        // 클래스 이름 :: 메서드 이름
        List<String> list2 = Arrays.asList("110","123","442");
        int sum = list2.stream().mapToInt(Integer::parseInt).sum();


        // 2. object method reference
        //특정 객체의 맴버 메서드 참조
        // 객체 참조 :: 메서드 이름
        list.forEach(System.out::println);

        // 3. lambda parameter object method reference
        // 람다의 인자로 넘어오는 객체의 맴버 메서드 참조
        // 인자의 타입명 :: 메서드 이름

        // e -> e.someMethod();  == SomeObject::someMethod
        // (e1, e2) -> e1.someMethod(e2); == SomeObject::someMethod
        Integer[] values = {1,3,10,4,5};
        Arrays.sort(values, Integer::compare);

        // 4. constructor reference
        // 해당하는 인자를 받는 객체 생성자의 참조
        // 클래스 이름::

        // () -> == SomeObject::new
        // e -> == SomeObject::new
        // (e1, e2) -> new SomeObject(e1, e2) == SomeObject::new


        List<Integer> list3 = Arrays.asList(1,2,3);
        list3.stream().map(Integer::new)    // Integer::new
                .forEach(System.out::println);

        // 5. super class method reference
        // 상속 관계의 상위 클래스 메서드 참조
        // super :: 메서드 이름

        // 6. array constructor reference
        // 특정 타입의 배열 생성자 참조
        // 타입명[] :: new



    }

    public static void printWithTime(String str) {
        out.println( "[" +currentTimeMillis() +"]" + str );
    }

}
