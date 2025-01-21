package org.LeetCode;

import java.util.Arrays;

/**
 * @author: 念安
 * @date: 2025-01-21 22:37
 * @description:给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 * 示例 1：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例 2：
 * 输入：height = [1,1]
 * 输出：1
 * 提示：
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 * https://leetcode.cn/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater11 {
    public int ContainerWithMostWater11(int[] height) {
        int areas = 0;
        int j = height.length - 1;
        int i = 0;
//        while (i < j) {
//            int current = (j - i) * Math.min(height[i], height[j]);
//            areas = Math.max(areas, current);
//            if (height[i] < height[j]) {
//                i++;
//            } else {
//                j--;
//            }
//        }

        while (i < j && j > 0) {
            if (height[i] <= height[j]) {
                int current = (j - i) * Math.min(height[i], height[j]);
                i++;
                areas = Math.max(areas, current);
            } else {
                int current = (j - i) * Math.min(height[i], height[j]);
                j--;
                areas = Math.max(areas, current);
            }
        }
        return areas;

    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater11 containerWithMostWater11 = new ContainerWithMostWater11();
        int result = containerWithMostWater11.ContainerWithMostWater11(height);
        System.out.println(result);
    }

}
