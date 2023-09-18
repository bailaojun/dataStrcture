package com.hashtable;

/**
 * Fiber
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/21 17:56
 */
public class Fiber {
    public static int fun(int n){
        if (n <=1){
            return n;
        }
        return fun(n-1)+fun(n-2);
    }

    public static void main(String[] args) {
        System.out.println( fun(5));
    }
}
