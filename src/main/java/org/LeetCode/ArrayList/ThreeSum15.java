package org.LeetCode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: 念安
 * @date: 2025-01-26 19:54
 * @description:
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 示例 2：
 *
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * 示例 3：
 *
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 */
public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrays = new ArrayList();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left=i+1;
            int right=nums.length-1;
            if (nums[i]  > 0 || nums.length<3) {
                continue;
            } else if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left<right){
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }else {
                    arrays.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (nums[left] == nums[left + 1] && left + 1 < nums.length-1) {
                        left++;
                    }while (nums[right] == nums[right - 1] && right-1>0) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }

        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        ThreeSum15 threeSum15 = new ThreeSum15();
        System.out.println(threeSum15.threeSum(nums));
    }

}