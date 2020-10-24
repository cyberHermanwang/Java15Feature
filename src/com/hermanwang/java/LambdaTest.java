package com.hermanwang.java;

/**
 * @author hermanwang
 * @create 2020-10-24
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("hello");
        };
    }
}
