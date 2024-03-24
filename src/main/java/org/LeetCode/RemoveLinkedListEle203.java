package org.LeetCode;

/**
 * @author: 蛋宝
 * @date: 2024-03-23 17:02
 * @description: 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * 示例 1：
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 示例 2：
 * 输入：head = [], val = 1
 * 输出：[]
 * 示例 3：
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 */
public class RemoveLinkedListEle203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
                head = head.next;
            } else {
                prev = head;
                head = head.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);
//        LinkedList<Integer> list=new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(6);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
        RemoveLinkedListEle203 removeLinkedListEle203 = new RemoveLinkedListEle203();
//        System.out.println(removeLinkedListEle203.removeElements(listNode,6));
        ListNode nowhead = removeLinkedListEle203.removeElements(listNode, 6);
        while (nowhead != null) {
            System.out.print(nowhead.val + " ");
            nowhead = nowhead.next;
        }
    }


}