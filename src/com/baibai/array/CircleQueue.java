package com.baibai.array;

/**
 * CircleQueue
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/21 9:16
 */
public class CircleQueue {
    int[] nums;
    int front;
    int rear;
    int capacity2;
    public CircleQueue(int capacity){
        nums = new int[capacity];
         capacity2 = capacity;
    }

    /**
     * En queue boolean.
     * 切记 满队列不能添加元素
     * @param element the element
     * @return the boolean
     */
    public boolean enQueue(int element){
        // 此处队列满的情况条件要记清楚。这个式子的来龙去脉记清楚。
        if ((rear+1)%nums.length==front){
            return false;
        }
        nums[rear] = element;
        // 循环队列所以rear 后移条件
        rear = (rear+1)%capacity2;
        return true;
    }

    /**
     * De queue int.
     * 切记空队列不能取元素
     * @return the int
     */
    public int deQueue(){
        if (rear==front){
            return 0;
        }
        int ret = nums[front];
        front = (front+1)%capacity2;
        return ret;
    }

    public int getLength(){
        return (rear+capacity2-front)%capacity2;
    }

    public void showQueue(){
        for (int i = front; i < front+getLength(); i++) {
            System.out.println("nums[i] = " + nums[i]);

        }
    }

    public static void main(String[] args) {
        CircleQueue cq = new CircleQueue(10);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);

//        System.out.println("cq.deQueue() = " + cq.deQueue());
//        System.out.println("cq.getLength() = " + cq.getLength());
        cq.showQueue();
    }
}
