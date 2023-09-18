package com.reference.datastructure;

/**
 * LinkList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/20 15:06
 */
public class LinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = new Node(0);
    int size;

    /**
     * Add by id order.
     * 按值的大小有序添加
     *
     * @param node the node
     */
    public void addByIdOrder(Node node) {
        //从头插入
        Node cur = head;
        boolean flag = false;
        // 这个while 非常的重要 目的就是要走到链表的最后。
        while (true) {
            //到尾节点
            if (cur.next == null) {
                break;
            }
            //节点存在
            if (cur.next.data == node.data) {
                // 定义标志位这个要学会哦 很常用也很重要。
                flag = true;
                break;

            }
            // 从大到小排列 如果node.data 指向cur，next.data
            if (cur.next.data < node.data) {
                break;
            }
            // 这行代码非常重要啊!!! 目的是什么？就是如果上面的if结果是flase时，执行这句代码，代表出现了排序错误，
            // 谁大 把谁变成领头羊。
            // 如果tmp.next.data>node.data那么说明二者需要互换位置。因为cur.next
             cur = cur.next;
        }
            if(flag){
                System.out.println("节点已存在");
            }
            //交换位置 这里对temp的while循环就是对node的一个一个的连接。
            // 很巧妙的 第一步要把tmp.next给出去。
            // 学到了没有 debug 的技巧 选中-> 点击 -> 点加号 记住哦！！
            node.next = cur.next;
            // head 挂载上了第一个节点node。头插法 后来的元素在头节点上。其实是先执行这句
            cur.next = node;
            size++;

        }

    public void showList(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            System.out.println("temp.data = " + temp.data);
        }
    }

    public static void main(String[] args) {
        LinkList ls = new LinkList();

        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(8);
        Node node4 = new Node(2);
        Node node5 = new Node(8);
        ls.addByIdOrder(node1);
        ls.addByIdOrder(node2);
        ls.addByIdOrder(node3);
        ls.addByIdOrder(node4);
        ls.addByIdOrder(node5);
        ls.showList();

    }
}

