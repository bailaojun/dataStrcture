package com.baibai.array;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * LinkQueue
 * 头出 尾插 队列的特点：想象排队
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/20 23:02
 */
public class LinkQueue {
    public static class Node {
        public Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    public Node head;
    public Node tail;
    static int size;

    public void enqueue(Node node) {
        if (tail == null) {
            head = node;
            tail = node;
        }
        // 尾插法
        tail.next = node;
        tail = node;
        size++;
    }

    public Node dequeue() {

        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        // 凤求凰
        temp.next = null;
        return temp;
        // TODO: 2022/7/20  
    }

    public static void main(String[] args) {
        LinkQueue lq = new LinkQueue();

        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);

        lq.enqueue(node1);
        lq.enqueue(node2);
        lq.enqueue(node3);

        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println("size = " + size);
    }
}
