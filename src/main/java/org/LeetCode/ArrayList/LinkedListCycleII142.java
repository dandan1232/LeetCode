package org.LeetCode.ArrayList;

import org.LeetCode.ArrayList.ListNode;

/**
 * @author: 念安
 * @date: 2025-01-30 14:14
 * @description: 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 不允许修改 链表。
 * <p>
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：返回索引为 1 的链表节点
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：返回索引为 0 的链表节点
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：返回 null
 * 解释：链表中没有环。
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目范围在范围 [0, 104] 内
 * -105 <= Node.val <= 105
 * pos 的值为 -1 或者链表中的一个有效索引
 * <p>
 * 进阶：你是否可以使用 O(1) 空间解决此题？
 */
public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        // 边界条件：空链表或者只有一个节点
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        // 第一次快慢指针相遇，用于判断是否存在环
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {// 快慢指针相遇，存在环
                // 第二次确定环的入口
                ListNode entry = head;
                while (entry != slow) {
                    entry=entry.next;
                    slow=slow.next;
                }
                // 返回环的入口节点
                return entry;
            }
        }
        // 如果没有环，返回null
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycleII142 linkedListCycleII142 = new LinkedListCycleII142();
        ListNode listNode = new ListNode(-1);
        listNode.next = new ListNode(-7);
        listNode.next.next = new ListNode(7);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = new ListNode(19);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(-9);
        listNode.next.next.next.next.next.next.next = new ListNode(-5);
        listNode.next.next.next.next.next.next.next.next = new ListNode(-2);
        listNode.next.next.next.next.next.next.next.next.next = new ListNode(-5);
        // 设置环：让最后一个节点指向链表中的某个节点（例如，节点 -5）
        listNode.next.next.next.next.next.next.next.next.next.next = listNode.next.next.next.next.next.next; // 指向节点 -9
        // 调用 detectCycle 方法检测链表环并输出结果
        ListNode cycle = linkedListCycleII142.detectCycle(listNode);
        // 输出检测到的环的入口节点（如果存在）
        if (cycle != null) {
            System.out.println("Cycle detected at node with value: " + cycle.val);
        } else {
            System.out.println("No cycle detected.");
        }

        }
    }