package com.baibai.array;

import java.util.Stack;

/**
 * ArryStack
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 用数组模拟栈
 * @date 2022/7/19 21:58
 */
public class ArrayStack {
    private int[] nums;
    // size 代表元素个数
    private int size;

    /**
     * Instantiates a new Array stack.
     *
     * @param capacity the capacity
     * capacity 代表数组的容量。
     */
    public ArrayStack (int capacity){
        this.nums = new int[capacity];
        this.size = 0;

    }

    /**
     * Push boolean.
     * 入栈操作以及判断栈的空间是否足够使用。
     * @param element the element
     * @return the boolean
     */
    public boolean push(int element){
        if (size > nums.length){
            return false;
    }
       nums[size] = element;
        size ++;
        return true;
    }

    /**
     * Pop.
     * 遍历栈的操作。
     */
    public void  pop(){

        while (size>0) {
            int element = nums[size-1];
            System.out.println("element = " + element);
            // size-- 不写里面while怎么出来呢 傻逼！！！
            size--;
        }

    }
    public int singlepop(){
        if (size == 0){
            return 0;
        }
        int element = nums[size-1];
        size--;
        return element;
    }

    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(10);
        as.push(0);
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.push(6);
        as.push(7);
        as.push(8);
        as.push(9);

        as.pop();
    }
}
