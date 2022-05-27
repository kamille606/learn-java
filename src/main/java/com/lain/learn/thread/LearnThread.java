package com.lain.learn.thread;

public class LearnThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("hello, runnable");
        };
        runnable.run();
    }
}
