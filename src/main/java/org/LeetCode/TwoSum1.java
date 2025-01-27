package org.LeetCode;

import java.util.HashMap;

/**
 * @author: 念安
 * @date: 2025-01-27 21:58
 * @description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 *
 * 提示：
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                }
//            }
//        }
//        return null;
        int[] indexs=new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int rest=target-nums[i];
            if (hash.containsKey(rest)) {
                indexs[0]=hash.get(rest);
                indexs[1]=i;
                return indexs;
            }
            hash.put(nums[i], i);
        }
        return indexs;
    }

    public static void main(String args[]) {
        TwoSum1 twoSum1 = new TwoSum1();
        int[] nums = {2, 7, 11, 15};
        twoSum1.twoSum(nums, 9);
        int[] result= twoSum1.twoSum(nums, 9);
        System.out.println(result[0]+" "+result[1]);
    }

}