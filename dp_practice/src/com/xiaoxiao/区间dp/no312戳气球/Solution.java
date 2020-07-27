package com.xiaoxiao.区间dp.no312戳气球;

/**
 * 有 n 个气球，编号为0 到 n-1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 * 现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。 这里的 left 和 right 代表和 i 相邻的两个气球的序号。注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
 * 求所能获得硬币的最大数量。
 * 说明:
 * 你可以假设 nums[-1] = nums[n] = 1，但注意它们不是真实存在的所以并不能被戳破。
 * 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/burst-balloons
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/4 - 22:19
 */
public class Solution {
    public int maxCoins(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length + 2];
        for (int i = 0; i < newArr.length; i++) {
            if (i == 0 || i == newArr.length - 1)
                newArr[i] = 1;
            else
                newArr[i] = nums[i - 1];

        }
        //dp[i][j]表示不戳破i,j条件下的最大硬币数
        int[][] dp = new int[length + 2][length + 2];
        //定义区间长度
        for (int len = 3; len <= length+1; len++) {
            //定义左端点
            for (int left = 0; left <= length; left++) {
                int right = left + len - 1;//定义右端点
                if (right > length) break;
                //枚举中间点
                for (int k = left; k <= right; k++) {
                    dp[left][right] = Math.max(dp[left][right], newArr[left] * newArr[k] * newArr[right] + dp[left][k] + dp[k][right]);
                }
            }

        }
        return dp[0][length + 1];
    }
}
