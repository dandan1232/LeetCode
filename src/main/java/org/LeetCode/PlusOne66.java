/*
 * @Author: 念安
 * @Date: 2025-02-12 13:40:30
 * @FilePath: \LeetCode\src\main\java\org\LeetCode\PlusOne66.java
 * @Description: 66. 加一 https://leetcode.cn/problems/plus-one/description/
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。


示例 1：
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。
示例 2：
输入：digits = [4,3,2,1]
输出：[4,3,2,2]
解释：输入数组表示数字 4321。
示例 3：
输入：digits = [9]
输出：[1,0]
解释：输入数组表示数字 9。
加 1 得到了 9 + 1 = 10。
因此，结果应该是 [1,0]。
 
提示：

1 <= digits.length <= 100
0 <= digits[i] <= 9
 */
package org.LeetCode;

public class PlusOne66 {
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9 ) {
                digits[i]+=1;
                break;
            }else {
            digits[i]=0;
            if (digits[0]==0) {
                int[] newDigits=new int[digits.length+1];
                newDigits[0]=1;
                for(int j=1;j<digits.length;j++){
                    newDigits[j]=0;
                }
                return  newDigits;
            }
            }
        }
        return digits;
    }


    public static void main(String args[]){
        PlusOne66 plusOne66=new PlusOne66();
        int[] digites={9,9,9};
        int[] result=plusOne66.plusOne(digites);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
