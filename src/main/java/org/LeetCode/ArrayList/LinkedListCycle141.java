package org.LeetCode.ArrayList;

import org.LeetCode.ArrayList.ListNode;

/**
 * @author: 念安
 * @date: 2025-01-30 12:47
 * @description: 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为
 * 了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。
 * 仅仅是为了标识链表的实际情况。
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 * <p>
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 * <p>
 * 提示：
 * 链表中节点的数目范围是 [0, 104]
 * -105 <= Node.val <= 105
 * pos 为 -1 或者链表中的一个 有效索引 。
 * <p>
 * 进阶：你能用 O(1)（即，常量）内存解决此问题吗？
 */
public class LinkedListCycle141 {
    public Boolean hasCycle(ListNode head) {
        int count = 0;
        if (head == null || head.next == null) {
            return false;
        }

        /*哈希表，遍历所有节点，每次遍历到一个节点时，判断该节点此前是否被访问过*/
/*        Set<ListNode> seen=new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head=head.next;
        }*/
        /*暴力，算是不是直接过0000*/
/*        while (head.next != null) {
            count++;
            head = head.next;
            if (count > 10000) {
                return true;
            }
        }*/

        /*龟兔 Floyd判圈算法*/
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListCycle141 linkedListCycle141 = new LinkedListCycle141();
        ListNode listnode = new ListNode(3);
        listnode.next = new ListNode(2);
        listnode.next.next = new ListNode(0);
        listnode.next.next.next = new ListNode(-4);
        listnode.next.next.next.next = listnode.next;
        boolean cycle = linkedListCycle141.hasCycle(listnode);
        System.out.println(cycle);
    }

}