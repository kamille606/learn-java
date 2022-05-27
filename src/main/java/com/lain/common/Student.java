package com.lain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Integer score;

    @Override
    public int compareTo(@NotNull Student o) {
        if (Objects.equals(o.score, this.score)) {
            return this.age - o.age;
        } else {
            return this.score - o.score;
        }
    }
}
