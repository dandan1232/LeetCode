package org.LeetCode;

import org.apache.xalan.processor.WhitespaceInfoPaths;

import java.util.List;

/**
 * @author: 蛋宝
 * @date: 2024-03-24 13:06
 * @description: 206.反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * <p>
 * 示例 2：
 * 输入：head = [1,2]
 * 输出：[2,1]
 * <p>
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 */
public class ReverseList206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while (curr != null) {
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        ReverseList206 reverseList206 = new ReverseList206();
        ListNode newList = reverseList206.reverseList(list);

        while (newList != null) {
            System.out.print(newList.val + " ");
            newList = newList.next;
        }


    }
}