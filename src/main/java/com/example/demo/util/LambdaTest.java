package com.example.demo.util;

/**
 * TODO .
 *
 * @author lihua.wang
 * @date 2022/7/13
 */
public class LambdaTest {

    public static void print(String name, Print print) {
        print.print(name);
    }

    public static void main(String[] args) {
        String name = "Chen Longfei";
        String prefix = "hello, ";

        print(name, (t) -> System.out.println(t));

        // 与上一行不同的是，Lambda表达式的函数体中引用了外部变量‘prefix’
        print(name, (t) -> System.out.println(prefix + t));
    }

}

@FunctionalInterface
interface Print {

    void print(String name);
}