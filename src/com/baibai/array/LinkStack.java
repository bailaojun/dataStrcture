package com.baibai.array;

/**
 * LinkStack
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/20 14:19
 */
public class LinkStack {

    /**
     * The type Node.
     */
    public static class Node {
       int data;
       Node next;

       public Node(int data){
            this.data = data;
       }
   }
   Node head = null;
   int size;

   public LinkStack(){
   }
   public void push(Node node){
       // 这里有个技巧，如果没有这句那么下面的就会出错。
       // 所以以后有时候自己必须也要用if来搞鲁棒性。
       if (size == 0){
           head = node;
       }
       else{
           // 栈 是头插法。
       node.next = head;
       head = node;
       }
       size ++;
   }
   public Node pop(){
       if (size > 0){
           Node stackTop = head;
           head = head.next;
           size--;
           return stackTop;
       }else{
           return null;
       }
   }

   //这里有个坑啊，静态方法无法调用非静态方法，为什么呢？记住这个问题，内存有关、
   public static void main(String[] args) {
        LinkStack ls = new LinkStack();
        Node node1 = new Node(1);
        ls.push(node1);
    }
}
