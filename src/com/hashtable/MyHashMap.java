package com.hashtable;

import sun.security.provider.MD5;

import java.util.HashMap;

/**
 * MyHashMap
 * 理清楚结构 HashMap 本质是数组，数组里面是单链表或红黑书
 * 单链表里面有节点。三层结构。
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/21 11:54
 */
public class MyHashMap {

    public static class Node {
        String key;
        String value;
        Node next;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;

        }
    }

    public class LinkNode {
        Node head;
        int size;
        public void addNode(Node node) {
            if (size == 0){
                head = node;
            }
            if (head == null) {
                return;
            }
            Node temp = head;
            // 尾插法 指针指向最后一个节点。
            while (true) {
                if (node.key.equals(temp.key)) {
                    temp.value = node.value;
                }
                // 这行代码非常的厉害，没他就出不来了。
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }
            temp.next = node;
        }

        public String getValue(String key) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return head.value;
            }
            Node temp = head;
            // 遍历单链表 寻找
            while (temp != null) {
                if (key.equals(temp.key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
    }
    LinkNode[] map = new LinkNode[8];
    int length;
    public void put (Node node){
        if (length >= map.length*0.75){
            System.out.println("map需要扩容");
            return;
        }
        int index = Math.abs(node.key.hashCode())%map.length;
        LinkNode ln = map[index];

        if (ln == null){
            LinkNode lnNew = new LinkNode();
            Node head = node;
            lnNew.head = head;
            map[index] = lnNew;
            length++;
        }
        else{
            ln.addNode(node);
        }
    }
    public String get(String key){
        int index = Math.abs(key.hashCode())%map.length;
        LinkNode ln = map[index];
        if (ln==null){
            return null;
        }
        return ln.getValue(key);
    }

    public static void main(String[] args) {
        MyHashMap mh = new MyHashMap();
        Node node1 = new Node("m3","ccccc");
        Node node2 = new Node("m4","ccbbccc");
        Node node3 = new Node("m5","ccddccc");

        mh.put(node1);
        mh.put(node2);
        mh.put(node3);

        System.out.println("mh.get(\"m5\") = " + mh.get("m5"));

    }



}




