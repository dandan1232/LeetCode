package org.Exercise;

import java.util.LinkedList;

/**
 * @author: 蛋宝
 * @date: 2024-03-23 11:01
 * @description: 关于链表的操作
 */
public class LinkedListExc {
    public static void main(String[] args) {


//    1.创建链表
        LinkedList<Integer> list = new LinkedList<>();

//  2.添加元素
//  时间复杂度O(1)
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list.toString());

//  时间复杂度O(N)
        list.add(1, 7);
        System.out.println(list.toString());


//  3.访问元素
        int element = list.get(2);
        System.out.println(element);

//  4.搜索元素
//  时间复杂度O(N)
        int index = list.indexOf(3);
        System.out.println(index);

//  5.更新元素
//  时间复杂度O(N)
        list.set(2, 10);
        System.out.println(list.toString());

//  6.删除元素
//   时间复杂度O(N)
        list.remove(3);
        System.out.println(list.toString());

//  7.获取链表长度
        int length = list.size();
        System.out.println(length);
    }
}