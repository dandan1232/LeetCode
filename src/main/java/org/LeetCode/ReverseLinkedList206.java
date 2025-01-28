package org.LeetCode;

import java.util.List;

/**
 * @author: 念安
 * @date: 2025-01-28 14:01
 * @description:
 *
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 示例 2：
 *
 *
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *
 *
 * 提示：
 *
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        /*方法一：迭代
假设链表为 1→2→3→∅，我们想要把它改成 ∅←1←2←3。
在遍历链表时，将当前节点的 next 指针改为指向前一个节点。
由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
在更改引用之前，还需要存储后一个节点。最后返回新的头引用。*/
//        ListNode prev=null;
//        ListNode current=head;
//        ListNode  tmp;
//        while (current != null) {
//            tmp=current.next;
//            current.next=prev;
//            prev=current;
//            current=tmp;
//        }
//        return prev;

        /*方法二：递归
        递归是尾递归，因此编译器可以优化它，将其转换为迭代。
        递归的解法是：
        1.如果链表为空，则返回 null。
        2.如果链表只有一个节点，则返回该节点。
        3.如果链表有多个节点，则递归反转除最后一个节点以外的部分链表，并得到反转后的链表的头节点。
        4.将反转后的链表的尾节点的 next 指针指向原始链表的头节点。
        5.将头节点的 next 指针指向 null。**/
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode reverse = reverseLinkedList206.reverseList(listNode);
        while (reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }
}