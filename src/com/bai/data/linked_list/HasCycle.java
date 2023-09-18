package com.bai.data.linked_list;

import com.reference.datastructure.LinkList;

import java.util.LinkedList;

/**
 * HasCycle
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/13 9:01
 */
public class HasCycle {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    // 快慢指针判断是否有环
    public boolean hasCycle(Node head){

        while(head.next != null){
            Node fast = head;
            Node slow = head;
            if(fast.next.next == slow.next){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<Integer>();

        ints.add(3);
        ints.add(5);
        ints.add(9);




    }



}
