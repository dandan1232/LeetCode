package org.LeetCode;

/**
 * @author: 念安
 * @date: 2025-01-21 23:57
 * @description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 示例 1：  输入：n = 2 输出：2 解释：有两种方法可以爬到楼顶。 1. 1 阶 + 1 阶 2. 2 阶
 * 示例 2：  输入：n = 3 输出：3 解释：有三种方法可以爬到楼顶。 1. 1 阶 + 1 阶 + 1 阶 2. 1 阶 + 2 阶 3. 2 阶 + 1 阶
 * 提示：  1 <= n <= 45
 *
 *
 * 解题思路懵逼的时候：
 * 暴力？ 基本情况？
 *
 * 找 最近 重复子问题
 *
 * if else，for while,recursion(程序递归)
 * n=1:1
 * n=2:1+1,2
 * n=3:1+1+1,1+2,2+1=======>找重复性：f(1)+f(2)
 * n=4？ f(2)+f(3)
 *
 * f(n)=f(n-1)+f(n-2):Fibonacci
 */
public class ClimbingStairs70 {
    int f1=1;
    int f2=2;
    static int f3;

    public int climbStairs(int n) {
        if (n < 3) {
            f3=n;
            }else {
            for (int i = 3; i <= n; i++) {
                 f3=f1+f2;
                 f1=f2;
                 f2=f3;
            }
            }
        return f3;
    }

    public static void main(String[] args) {
        ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();
        climbingStairs70.climbStairs(4);
        System.out.println(f3);
    }
}