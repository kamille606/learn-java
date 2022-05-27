package com.lain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Integer score;

    @Override
    public int compareTo(@NotNull Student o) {
        return this.score - o.score;
    }
}
