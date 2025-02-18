package org.LeetCode.ArrayList;

import java.util.Arrays;

/**
 * @author: 蛋宝
 * @date: 2024-03-22 19:30
 * @description: 移动零283
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 */
public class MoveZeros283 {
    int count = 0;

    public void moveZeroes(int[] nums) {
        //法一：双指针，交换0和其他的位置
        int index=0; //0的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++]=nums[i];
            }

        }
        for (int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        //法二：遇到0删除，并且在数组后面加0
//        List<String> nums = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                nums.remove(0);
//                nums.add(0);
//            }
//        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros283 moveZeros283 = new MoveZeros283();
        moveZeros283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 实现
     * **/
//    public static void main(String[] args) {
//        int count = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(0);
//        arr.add(1);
//        arr.add(0);
//        arr.add(3);
//        arr.add(12);
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) == 0) {
//                count++;
//                arr.remove(i);
//                arr.add(0);
//            }
//        }
//        System.out.println(arr);
//    }
}