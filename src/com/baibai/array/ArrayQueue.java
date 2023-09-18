package com.baibai.array;

/**
 * ArrayQueue
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/20 22:29
 */
public class ArrayQueue {
    int[] nums;
    int head = 0;
    int tail = 0;

    public ArrayQueue(int capacity){
        // 此处不能加int[] 为什么呢？思考变成二个对象了为什么这个样子？
         nums = new int[capacity];
    }
    public boolean enqueue(int element){
        if (tail== nums.length) {
            return false;
        }
        nums[tail] = element;
        // 元素从1开始计数，比较符合习惯。
        ++tail;
        return true;
    }

    public int dequeue(){

        if (head == tail){
            return 0;
        }
        int ret = nums[head];
        ++head;
        return ret;
    }
    public void showQueue(){
        for (int i = 0; i < tail; i++) {
            System.out.println("element=" +nums[i]);
        }
    }
    public int getLength(){
        return tail-head;
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(10);

        aq.enqueue(1);


        aq.showQueue();
        System.out.println("aq.getLength() = " + aq.getLength());

        System.out.println("aq.dequeue() = " + aq.dequeue());


    }
}
