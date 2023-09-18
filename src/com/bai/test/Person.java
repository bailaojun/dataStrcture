package com.bai.test;

/**
 * Personj
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/14 11:57
 */
public class Person {
    private int age;
    private String name;


    public Person (String name){
        this("liwei",23);
        System.out.println("this.toString() = " + this.toString());

    }
    public Person (String name,int age){
    }

    public static void main(String[] args) {

    }
}
