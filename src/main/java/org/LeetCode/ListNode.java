package org.LeetCode;

import org.apache.batik.dom.util.ListNodeList;

/**
 * @author: 蛋宝
 * @date: 2024-03-24 10:28
 * @description:
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){ //利用构造器来赋值
        this.val=val;
    }

    ListNode(int val, ListNode next) {
        this.val=val;
        this.next=next;
    }
}