package com.shethap.tech.fi;

import java.util.function.Consumer;

/**
 * This is an example on how to use consumer functional interface.
 */

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> print = x -> System.out.println(x);
        print.accept("This is consumer functional interface example");

    }

}
