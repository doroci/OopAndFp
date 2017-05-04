package com.company.solid;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lee on 2017. 2. 25..
 */
public class Repl {

    private static boolean process(Integer i){
        System.out.println("i is" +i);
        return i % 3 == 0 || i == 5;
    }

    public static void main(String[] args) {

        final List<Integer> ns = Arrays.asList(1,2,3,4,5);

        boolean isSuccess = false;

        for (final int i: ns) {

            // legacy code
//            final boolean result = process(i);
//            if (result){
//                isSuccess = true;
//            }

            // legacy code
            //            isSuccess = isSuccess | process(i);

            // best practice
            //            isSuccess |= process(i);

        }


        isSuccess = ns.stream()
                .reduce(
                        false,
                        (r,x) -> process(x),
                        (r,x) -> r || x
                );


        System.out.println(isSuccess);








    }
}
