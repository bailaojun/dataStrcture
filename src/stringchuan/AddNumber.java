package stringchuan;

import com.reference.datastructure.LinkList;

import java.util.Collections;
import java.util.LinkedList;

/**
 * AddNumber
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/8/15 8:07
 */
public class AddNumber {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); // 哑节点
        ListNode current = dummy; // 当前节点，用于构建结果链表
        int carry = 0; // 进位值

        while (l1 != null || l2 != null) {
            int num1 = (l1 != null) ? l1.val : 0; // 获取链表1当前节点的值
            int num2 = (l2 != null) ? l2.val : 0; // 获取链表2当前节点的值
            int sum = num1 + num2 + carry; // 计算当前位置上的和

            carry = sum / 10; // 更新进位值
            current.next = new ListNode(sum % 10); // 创建新节点并添加到结果链表的末尾
            current = current.next; // 移动当前指针

            if (l1 != null) {
                l1 = l1.next; // 链表1指针后移
            }
            if (l2 != null) {
                l2 = l2.next; // 链表2指针后移
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // 如果还存在进位值，创建新节点并添加到结果链表的末尾
        }

        return dummy.next; // 返回结果链表头节点的下一个节点（去掉哑节点）
    }

    // 验证方法
    public static void validate() {
        // 示例一：342 + 465 = 807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("示例一验证结果：");
        printLinkedList(result); // 验证结果应为 7->0->8

        // 示例二：99999 + 1 = 100000
        ListNode l3 = new ListNode(9);
        l3.next = new ListNode(9);
        l3.next.next = new ListNode(9);
        l3.next.next.next = new ListNode(9);
        l3.next.next.next.next = new ListNode(9);

        ListNode l4 = new ListNode(1);

        ListNode result2 = addTwoNumbers(l3, l4);

        System.out.print("示例二验证结果：");
        printLinkedList(result2); // 验证结果应为 0->0->0->0->0->1
    }

    // 打印链表
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //validate();

        LinkedList<Integer> list  = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);

        for(Integer i : list){
            System.out.println("i = " + i);
        }




    }
}




