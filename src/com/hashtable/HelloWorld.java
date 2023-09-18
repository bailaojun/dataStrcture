package com.hashtable;

/**
 * HelloWorld
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/21 17:39
 */
public class HelloWorld {
    public static void print (String s){
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
        }
    }

    /**
     * Print.
     * 递归 关键是如何归。
     * @param s the s
     * @param n the n
     */
    public static void print(String s,int n){
        // 1.递归条件  递：调用 归：返回
        if (n>0){
            // 2.函数的功能
            System.out.println(s);
            // 3.函数的等价关系式
            // 每次执行之间的逻辑关系  与个数之间的逻辑关系
            // 调用本身函数时 要趋于递归调用条件，不然无限递归。
            print(s,n-1);
        }
    }

    public static void main(String[] args) {
        print("hello world",7);
    }

}
