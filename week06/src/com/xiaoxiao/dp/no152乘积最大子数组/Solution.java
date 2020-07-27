package com.xiaoxiao.dp.no152乘积最大子数组;

/**给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字）。

 示例 1:
 输入: [2,3,-2,4]
 输出: 6
 解释: 子数组 [2,3] 有最大乘积 6。
 示例 2:
 输入: [-2,0,-1]
 输出: 0
 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。

 * @author Xiaoyu
 * @date 2020/4/13 - 21:45
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        if(nums.length ==1) return nums[0];
        int len = nums.length;
        int[] dpMax = new int[len+1];
        int[] dpMin = new int[len+1];
        int maxMul = Integer.MIN_VALUE;
        dpMax[0] = 1;//初始状态
        dpMin[0] = 1;//初始状态
        for (int i = 1; i <= len; i++) {
            //转移方程 dpMax[i] = max(curr * dpMax[i-1], curr);
            //        dpMin[i] = min(curr * dpMin[i-1], curr);
            int curr = nums[i-1];//当前的数
            //如果这个数是正数,那么他乘上最大值还是最大值,最小值还是最小值(0也可以加入辨别,性质相似)
            if(curr>=0) {
                dpMax[i]=Math.max(curr*dpMax[i-1],curr);
                dpMin[i]=Math.min(curr*dpMin[i-1],curr);
            }else {
                //如果这个数是负数,那么与上面正好是相反的
                dpMax[i]=Math.max(curr*dpMin[i-1],curr);
                dpMin[i]=Math.min(curr*dpMax[i-1],curr);
            }
            maxMul = Math.max(maxMul,dpMax[i]);
        }
        return maxMul;
    }
}
