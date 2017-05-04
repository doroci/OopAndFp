package com.company.lamdas;

/**
 * Created by lee on 2017. 4. 25..
 *
 *
 * 참조: https://www.slideshare.net/gyumee/8-37599530
 */

interface DefaultMethod {
    //    void newMethod();

    //default 메서드
    default void newMethod() {}
}

// 기본메서드는 클래스에서 구현하지 않아도 사용 가능
class DMImpl implements DefaultMethod {}


interface Bar1 extends DefaultMethod {
    @Override default void newMethod() {
        System.out.println("interface Bar1");
    }
}


interface Bar2 extends DefaultMethod {
    @Override default void newMethod() {
        System.out.println("interface Bar2");
    }
}

// 기본멤서드 사용은 다중상속(다이아몬드 문제)가 발생할 수 있다.
//class Test implements Bar1, Bar2 { }


// 다이아 몬드 문제 해결
// 1. 출돌 기본 메서드 재정의(Override)
class BarImpl1 implements Bar1, Bar2 {
    @Override public void newMethod() {}
}


// 2. 상속 방향 선택
class BarImpl2 implements Bar1, Bar2 {
    @Override public void newMethod() {
        Bar1.super.newMethod();
    }
}

// 3. 상속 순서 선택
class BarImpl3 implements Bar1, Bar2 {
    @Override public void newMethod() {

        // Bar1을 먼저 상속
        Bar1.super.newMethod();
        Bar2.super.newMethod();

        // Bar2을 먼저 상속
//        Bar2.super.newMethod();
//        Bar1.super.newMethod();

    }
}

public class DefaultMethodInfo {

    public static void main(String[] args) {
        BarImpl1 bar1 = new BarImpl1();
        BarImpl2 bar2 = new BarImpl2();
        BarImpl3 bar3 = new BarImpl3();

        bar1.newMethod();
        bar2.newMethod();
        bar3.newMethod();
    }

}

