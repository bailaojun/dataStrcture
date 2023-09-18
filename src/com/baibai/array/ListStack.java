package com.baibai.array;

import java.util.Stack;

/**
 * ListStack
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 利用栈来将数据进行从尾到头的反向打印。
 * 栈的基本使用。
 * @date 2022/7/19 15:03
 */
public class ListStack {
    public void reversePrint(ReverseLinkList.Node head){
        Stack<Object> st = new Stack<>();

        while (head.next != null){
            st.push(head);
            head.next = head;
        }
        while (st.size()>0){
            System.out.println("st.pop() = " + st.pop());

        }
    }
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");

        while(stack.size()>0){
            System.out.println("stack.pop() = " + stack.pop());
        }
    }
}
