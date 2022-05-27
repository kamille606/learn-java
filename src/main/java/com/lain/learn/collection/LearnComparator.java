package com.lain.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {{
            add("tom");
            add("nike");
            add("john");
            add("jack");
        }};
        list.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });
        list.sort(Comparator.comparing(String::length, Comparator.naturalOrder())
                .thenComparing(String::length, Comparator.reverseOrder()));
        list.forEach(System.out::println);
    }
}
