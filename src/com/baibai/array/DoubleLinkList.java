package com.baibai.array;

/**
 * DoubleLinkList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/17 23:53
 */
public class DoubleLinkList {
    private class Node {
        private Node pre;
        private Node next;
        private int data;


        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public Node getNode(int index) {
        if (index < 0 || index > size-1) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void add(Node node) {
        if (head == null) {
            Node head = new Node(0, null);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void addData(int data) {
        if (head == null) {
            Node head = new Node(data, null);
        }
        Node newNode = new Node(data, null);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void modify(int index, int data) {
        if (index < 0 || index > size-1) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node modified = getNode(index);
        modified.data = data;
    }

    /**
     * Inserted.
     * 头结点：不存放任何数据
     * 链表分为：带头节点和不带头节点的
     * 这是插入方法是建立在 链表已经完成的基础上的 不是add方法。
     * @param index the index
     * @param data  the data
     */
    public void inserted(int index, int data) {
        Node inserted = new Node(data);
        // 此时是没有算头结点的长度
        if (index == 0) {
            // 头插法
            inserted.next = head;
            head = inserted;
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        if (index > 0 && index < size) {
            Node preinserted = getNode(index - 1);
            inserted.next = preinserted.next;
            preinserted.next = inserted;
        }
        size++;
    }



    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.inserted(1, 0);
        doubleLinkList.inserted(2, 1);
        System.out.println("doubleLinkList.getSize() = " + doubleLinkList.getSize());
        System.out.println("doubleLinkList.getNode(0) = " + doubleLinkList.getNode(2).data);
    }

}
