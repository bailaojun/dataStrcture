package com.baibai.array;

/**
 * ReverseLinkList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/17 20:26
 */
public class ReverseLinkList {
    static class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);
        Node res = reverse(head);
        Node next = res.next;
        System.out.print(res.data + "->");
        while (next != null) {
            System.out.print(next.data + "->");
            next = next.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    public static Node reverse(Node  head) {
        Node pre = null;
        while (head != null) {
            Node current = head;
            head = head.next;
            current.next = pre;
            pre = current;
        }
        return pre;
    }

}


