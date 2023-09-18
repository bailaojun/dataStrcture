package day2023829.inout;

import java.util.Scanner;

/**
 * AB3
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/1 20:17
 */
public class AB3 {
    public static void main(String[] args) {
        System.out.println("斐波那契数列：");
        //方法一：变量
        int a = 1, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 20; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}