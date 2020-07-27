package com.xiaoxiao.区间dp.no1039多边形三角剖分的最低得分;

/**给定 N，想象一个凸 N 边多边形，其顶点按顺时针顺序依次标记为 A[0], A[i], ..., A[N-1]。
 假设您将多边形剖分为 N-2 个三角形。对于每个三角形，该三角形的值是顶点标记的乘积，三角剖分的分数是进行三角剖分后所有 N-2 个三角形的值之和。
 返回多边形进行三角剖分后可以得到的最低分。
 区间DP套路，枚举所有的区间和区间内的点，区间内的点和区间左右端点将整个区间又划分为两个已知的子区间，典型的区间dp
 * @author Xiaoyu
 * @date 2020/5/31 - 18:08
 */
public class Solution {
    public int minScoreTriangulation(int[] A) {
        /**
         * 第i条边的时候,有两种可能,一种是含有i这条边,一种是i作为分割点
         * 1.含这条边就是f(i) = f(i-1) +A[0]*A[i-2]*A[i-1]
         * 2.不含这条边,就是作为顶点f(i) =A[i-1]*A[0]*A[1]+...+A[i-1]*A[i-2]*A[i-3]
         * 区间dp就是要枚举区间长度,区间内的点
         */
        int length = A.length;
        int[][] dp = new int[length+1][length+1];
        //枚举区间长度,从3开始
        for (int len = 3; len <= length; len++) {
            //枚举左端点
            for (int left = 1; left <=length-len+1 ; left++) {
                //右端点
                int right=left+len-1;
                dp[left][right]=Integer.MAX_VALUE;   //init区间初始值
                for (int i=left+1;i<right;i++) { //枚举区间内的所有的点(不包括端点)),将环分割成左右两部分
                    dp[left][right]=Math.min(dp[left][right],dp[left][i]+dp[i][right]+A[i-1]*A[left-1]*A[right-1]);
                }
            }
        }

        return dp[0][length];
    }

    private int newTran(int[] a, int i) {
        int sum = 0;
        for (int j = 0; j <= i-3; j++) {
            sum+=a[i-1]*a[j]*a[j+1];
        }
        return sum;
    }
}
