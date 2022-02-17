package com.shethap.tech.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This is an example on how to use predicate functional interface.
 */

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> evenNumberPredicate = x -> x % 2 == 0 ? true : false;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(evenNumberPredicate)
                .collect(Collectors.toList());

        System.out.println(collect); // [2, 4, 6, 8, 10]

    }
}

