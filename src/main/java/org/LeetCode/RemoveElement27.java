package org.LeetCode;

import org.Exercise.ArraysExc;

import java.util.Arrays;

/**
 * @author: 蛋宝
 * @date: 2024-03-22 21:01
 * @description: 移除元素
 */
public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
//        int count=0;
//        int index=0;
//        for (int i = 0;i < nums.length;i++) {
//            if (nums[i] != val) {
//                nums[index++]=nums[i];
//            }else {
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return nums.length-count;
//
//    }

        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >= 0; j--) {
                if (i<=j) {
                    if (nums[i] == val && nums[j] != val) {
                        temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
            if (nums[i] == val) {
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums.length-count++;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        RemoveElement27 removeElement27 = new RemoveElement27();
        System.out.println(removeElement27.removeElement(nums, 2));
    }

}