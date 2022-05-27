package com.lain.learn.collection;

import java.util.Arrays;
import java.util.List;

public class learnArrays {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tom", "jack", "lain");
        list.forEach(System.out::println);
        int[] array = {1, 3, 5 ,7 ,9};
        Arrays.copyOf(array, 3);
    }

}
