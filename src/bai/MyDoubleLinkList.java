package bai;

/**
 * MyDoubleLinkList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/11/19 10:52
 */
public class MyDoubleLinkList {
    // 定义一个节点类
    private class Node{
        private Node pre;
        private Node next;
        private int date;
    }

    private Node head;
    private Node tail;
    private int size;

    public void addNode(Node insertNode,int index){

        // 只要有下标就要考虑下标问题
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("下标越界异常");
        }
        // 插入扩容问题 链表不存在

        // 空链表
        if(size == 0){
           head = insertNode;
           tail = insertNode;
        }
        // 头插
        if (index == 0){
          insertNode.next = head;
          insertNode.pre = null;
          head = insertNode;
        }
        // 尾插
        if(index == size){
            insertNode.next = null;
            insertNode.pre = tail;
            tail.next = insertNode;
        }

        // 中间插入 首先获得前一个节点
        Node preNode = get(index-1);
        insertNode.next = preNode.next;
        preNode.next = insertNode;
        insertNode.pre = preNode;

        size ++ ;
    }

    public Node get(int index) {
        // 只要有下标就要考虑下标问题
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("下标越界异常");
        }

        Node cur = head;
        for(int i = 0;i<index;i++){
            cur = cur.next;
        }
        return cur;
    }

    public Node delete(Node deletedNode,int index){
        // 只要有下标就要考虑下标问题
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("下标越界异常");
        }
        // 删除头节点
        if(index == 0){
            deletedNode = head;
            head = head.next;
        }
        // 删除尾节点
        if(index == size){
            deletedNode = tail;
            tail = tail.pre;
            tail.next = null;
        }
        // 删除中间节点
        Node preNode = get(index-1);
        deletedNode = preNode.next;
        preNode.next = deletedNode.next;
        preNode  = deletedNode.next.pre;

        return deletedNode;

    }

    public void output(){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.date);
            temp = temp.next;
        }

    }



}
