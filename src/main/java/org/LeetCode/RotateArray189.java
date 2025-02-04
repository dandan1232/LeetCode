package org.LeetCode;

import java.util.Stack;

/**
 * @author: 念安
 * @date: 2025-02-04 15:50
 * @description: https://leetcode-cn.com/problems/rotate-array/
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]

 * 提示：
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105

 * 进阶：
 *
 * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 */
public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        Stack<Integer> stack=new Stack<>();
        for (int i = n-k-1; i >=0; i--) {
            stack.push(nums[i]);
            System.out.println(stack);
        }
        for (int i = n-1; i >=n-k; i--) {
            stack.push(nums[i]);
        }
        System.out.println(stack);
        for (int i =0; i < n; i++) {
            nums[i] = stack.pop();
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        RotateArray189 rotateArray189 = new RotateArray189();
        rotateArray189.rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}