package com.baibai.array;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Node;

import java.security.acl.LastOwnerException;

/**
 * LinkList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/14 21:04
 */
public class LinkList {

    /**
     * 节点：包括数据和指针
     * The type Node.
     */
    private static class Node{
        int data;
        Node next;

        /**
         * Instantiates a new Node.
         * 构造方法实例化对象
         */
        public Node(int data) {
            this.data = data;
        }

        /**
         * Instantiates a new Node.
         *
         * @param data the data
         * @param next the next
         */
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    // 这里有三个成员变量 都非常重要，size 是节点的个数，也就是数据的个数。
    private int size;
    private Node tail;
    private Node head;


    public LinkList() {
    }

    /**
     * Get element node.
     * 单链表的查找性能非常差，原因就是必须要从头查起，JDK有改进根据index判断二分查找。
     *
     * @param index the index
     * @return the node
     */
    // 重点 index 是节点编号
    public Node getNode(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        // 从头结点开始以次找起。
        Node current = head;
        // 这里有个边界点的问题，debug 的时候要验证下。
        // == 和 = 我都搞混了，我去！
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    /**
     * Insert.
     * 功能是通过下标插入一个节点。
     * 重点是理解指针，以及无参及有参构造
     *
     * @param index the index
     * @param data  the data
     */
    public void insert(int index, int data) {

        // 忘记写了最重要的一行代码
        Node insertedNode = new Node(data);

        if (size == 0) {
            head = insertedNode;
            tail = insertedNode;
        } else if (index == 0) {
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            tail.next = insertedNode;
            tail = insertedNode;
        } else if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界");
        } else {
            // 单链表首先得保存 precurrent节点。然后取出current，再把逻辑搞清楚
            Node precurrent = getNode(index - 1);
            insertedNode.next = precurrent.next;
            precurrent.next = insertedNode;
        }
        size++;
    }

    /**
     * Add.
     * 原理就是首先先把 temp 指针指到最后一个节点，然后 tail，next 指向新加入的节点。
     *
     * @param node the node
     */
    public void add(Node node) {
        // 头结点不能动
        // 找 precurrent节点。
        if (head==null){
            head = new Node(0,null);
            size++;
        }
            Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        size++;
        temp.next = node;
    }

    /**
     * Add by order.
     * 工作中能遇到此类问题  我不在数据库进行排序 而是在数据传送中就可以实现顺序排序。
     * 从小到大排列添加 此类问题需要定义先定义下头结点。head = new Node(0)。
     *
     * @param node the node
     */
    public void addByOrder(Node node) {
        Node temp = head;
        boolean flag = false;
        // 这个 while 循环非常重要，只要跳出循环就代表排序的位置就已经找到。
        // 就是这个方法要定义头结点。不然空指针异常。
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.data > node.data) {
                break;
            } else if (temp.next.data == node.data) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("已存在此数据");
        } else {
            // 技巧 必须先写node.next 不然的话就会无限递归，互相调用。
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }


    /**
     * Deleted node.
     *
     * @param index the index
     * @return the node
     */
    public Node deleted(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node precurret = getNode(index - 1);
        Node current = getNode(index);
        precurret.next = current.next;
        // 容易犯的错，就是return后面不能reach了。
        size--;
        return current;
    }


    /**
     * Modify.
     *
     * @param index the index
     * @param data  the data
     */
    public void modify(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node current = getNode(index);
        current.data = data;
    }

    /**
     * Find int.
     *
     * @param index the index
     * @return the int
     */
    public int find(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node current = getNode(index);
        return current.data;
    }

    /**
     * Find index int.
     * 根据节点中的数据寻找节点编号
     *
     * @param data the data
     * @return the int
     */
    public int findIndex(int data) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == data) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * Length int.
     *
     * @return the int
     */
    public int length() {
        return size;
    }

    /**
     * Output.
     * 遍历整个单链表。
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println("temp.data = " + temp.data);
            temp = temp.next;
        }
    }


//    public Node reverseLinklist(Node head) {
//        Node precur = null;
//        Node cur = head;
//        Node reverseHead = null;
//        while (cur != null) {
//            Node temp = cur.next;
//            reverseHead = cur;
//            cur.next = precur;
//            precur = cur;
//            cur = temp;
//        }
//        return precur;
//
//    }

    public static void main(String[] args) {
        LinkList reverselinkList = new LinkList();
//        linkList.insert(0, 0);
//        linkList.insert(1, 1);
//        linkList.insert(2, 2);
//        linkList.insert(3, 3);
//        linkList.insert(0, 5);
        Node node1 = new Node(9);
        Node node2 = new Node(1);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
//        reverselinkList.addByOrder(node1);
//        reverselinkList.addByOrder(node2);
//        reverselinkList.addByOrder(node3);
//        reverselinkList.addByOrder(node4);
//        linkList.output();
        reverselinkList.add(node4);
        reverselinkList.add(node3);
        reverselinkList.add(node1);
        reverselinkList.add(node2);
//        linkList.insert(0, 5);
        reverselinkList.output();
        System.out.println("length = " + reverselinkList.length());
//        System.out.println("length = " + linkList.length());
//        System.out.println("linkList.getNode(0) = " + linkList.getNode(0).data);
//        System.out.println("linkList.getNode(1) = " + linkList.getNode(1).data);
//        System.out.println("linkList.find(3) = " + linkList.find(3));
//       System.out.println("linkList.deleted(2) = " + linkList.deleted(2).data);
//       System.out.println("linkList.length() = " + linkList.length());
//        linkList.output();
    }
}


