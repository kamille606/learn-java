package com.lain.learn.collection;

import com.lain.common.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparable {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() {{
            add(new Student("刘", 18, 90));
            add(new Student("王", 20, 77));
            add(new Student("李", 19, 77));
        }};
        Collections.sort(list);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

}
