package com.lain.learn.collection;

import com.lain.common.Student;

import java.util.ArrayList;
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


        List<Student> list2 = new ArrayList<>() {{
            add(new Student("刘", 18, 90));
            add(new Student("王", 20, 77));
            add(new Student("李", 19, 77));
        }};
        list2.sort(Comparator.comparing(Student::getAge)
                .thenComparing(Student::getScore));
        list2.forEach(System.out::println);
    }

}
