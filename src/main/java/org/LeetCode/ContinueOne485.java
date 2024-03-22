package org.LeetCode;

import java.util.ArrayList;

/**
 * @author: 蛋宝
 * @date: 2024-03-22 18:14
 * @description: 最大连续1的个数
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 * 示例 1：
 * 输入：nums = [1,1,0,1,1,1]
 * 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 * 示例 2:
 * <p>
 * 输入：nums = [1,0,1,1,0,1]
 * 输出：2
 */
public class ContinueOne485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int finalnum=0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                count ++;
                if (finalnum<=count) {
                    finalnum = count;
                }
            }else {
                count = 0;
            }
        }
//        System.out.println(count);
        return finalnum;
    }

    public static void main(String[] args) {
        ContinueOne485 continueOne485 = new ContinueOne485();
        //数组定义
        int[] nums={1,1,0,1,1,1};
//        int[] nums={1,0,1,1,0,1};
        System.out.println(continueOne485.findMaxConsecutiveOnes(nums));
    }

}
