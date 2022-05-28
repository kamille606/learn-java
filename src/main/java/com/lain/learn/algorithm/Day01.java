package com.lain.learn.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode:1507
 */
public class Day01 {
    public static String reformatDate(String date) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        Map<String, Integer> s2month = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            s2month.put(months[i - 1], i);
        }
        String[] array = date.split(" ");
        int year = Integer.parseInt(array[2]);
        int month = s2month.get(array[1]);
        int day = Integer.parseInt(array[0].substring(0, array[0].length() - 2));
        return String.format("%d-%02d-%02d", year, month, day);
    }

    public static void main(String[] args) {
        String date = "20th Oct 2052";
        String result = reformatDate(date);
        System.out.println(result);
    }
}
