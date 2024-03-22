package org.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * @author: 蛋宝
 * @date: 2024-03-20 21:51
 * @description: 关于数组
 * 数组创建、添加元素、访问元素、修改元素、删除元素、遍历数组、查找元素、数组的长度、数组排序（内置的排序方法）
 */
public class ArraysExc {
    public static void main(String[] args) {
        //    1.创建数组
        int[] a = {1, 2, 3};
        System.out.println("数组a:" + Arrays.toString(a));

        int[] b = new int[]{2, 5, 7};
        System.out.println("数组b:" + Arrays.toString(b));

        int[] c = new int[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }
        System.out.println("数组c:" + Arrays.toString(c));

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            arr.add(i + 2);
        }
        System.out.println("数组arr:" + arr.toString());


//        2.添加元素
//        时间复杂度O(1)
        arr.add(99);
        System.out.println("数组arr:" + arr.toString());

//        时间复杂度O(N)
        arr.add(2, 67);
        System.out.println("数组arr:" + arr.toString());

//        3.访问元素
        int num1 = c[1];
        int num2 = arr.get(1);
        System.out.println("c1:" + num1);
        System.out.println("arr[1]:" + num2);

//        4.更新元素
        c[1]=99;
        arr.set(1,78);
        System.out.println(c[1]);
        System.out.println(arr.get(1));

//        5.删除元素
        arr.remove(1);
        System.out.println(arr.toString());
        System.out.println(arr.get(1));

//        6.数组长度
        int cSize = c.length;
        System.out.println(cSize);
        int arrSize = arr.size();
        System.out.println(arrSize);

//        7.遍历数组{
        for (int i = 0; i < c.length; i++){
            int current = c[i];
            System.out.println("c at index:" + current);
    }

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            System.out.println("arr at index:" + current);
        }

//        8.查找元素
        for (int i=0;i<c.length;i++){
            if (c[i] == 99) {
                System.out.println("99在数组里");
            }
        }

        boolean is99 = arr.contains(99);
        System.out.println(is99);

//        数组排序
        c = new int[]{1, 5, 7};
        arr = new ArrayList<>();
        arr.add(2);
        arr.add(6);
        arr.add(5);
        System.out.println("c:"+Arrays.toString(c));
        System.out.println("arr:"+arr.toString());

        Arrays.sort(c);
        System.out.println("c:"+Arrays.toString(c));
        Collections.sort(arr);
        System.out.println("arr:"+arr.toString());

//        时间复杂度O(NlogN)
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("arr:"+arr);



    }
}