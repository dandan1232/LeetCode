package org.LeetCode;

import java.util.List;

/* 21. 合并两个有序链表:https://leetcode.cn/problems/merge-two-sorted-lists/description/ */

public class MergeTwoSortedLists21 {

    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dump=new ListNode(0);
        ListNode cur=dump;
        while(list1!=null&&list2!=null){
            if (list1.val<list2.val) {
                cur.next=list1;
                list1=list1.next;
                
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }

        cur.next=list1!=null?list1:list2;


        return dump.next;
    }



    public static class ListNode {
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

    public static void main(String args[]){
        MergeTwoSortedLists21 mergeTwoSortedLists21=new MergeTwoSortedLists21();
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        ListNode list3=mergeTwoSortedLists21.mergeTwoLists(list1,list2);
        while (list3!=null) {
            System.out.println(list3.val);
            list3=list3.next;
            
        }
    }
}