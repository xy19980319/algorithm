package com.xiaoxiao.weekrace.no2;

import java.util.Arrays;

/**
 * 可获得的最大点数
 * 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
 * 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 * 你的点数就是你拿到手中的所有卡牌的点数之和。
 * 给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
 * 输入：cardPoints = [1,2,3,4,5,6,1], k = 3
 * 输出：12
 * 解释：第一次行动，不管拿哪张牌，你的点数总是 1 。但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。
 *
 * @author Xiaoyu
 * @date 2020/4/26 - 10:29
 */
public class Solution {
    int max = 0;
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        if (k == len) {
            int sumNum = 0;
            for (int i = 0; i < len; i++) {
                sumNum += cardPoints[i];
            }
            return sumNum;
        }
        //前缀和,假设全部都是取前面,然后在去掉后面一个,加上最后一个的比大小
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=cardPoints[i];
        }
        int max = sum;
        for (int j = 1; j <=k ; j++) {
            sum = sum-cardPoints[k-j]+cardPoints[len -j];
            max = Math.max(max,sum);
        }
        return max;
    }
    public int maxScore2(int[] cardPoints, int k) {
        int len = cardPoints.length;
        if (k == len) {
            int sumNum = 0;
            for (int i = 0; i < len; i++) {
                sumNum += cardPoints[i];
            }
            return sumNum;
        }
        int sum = 0;
        int start =0;
        int end = len-1;
        dfs(cardPoints,start,end,sum,k);
        return max;
    }

    private void dfs(int[] cardPoints,int start,int end,int sum, int k) {
        if(k==0) {
            max = Math.max(max,sum);
            return;
        }
        //选择第一个
        sum+=cardPoints[start];
        dfs(cardPoints,start+1,end,sum,k-1);
        //剪枝
        sum-=cardPoints[start];
        sum+=cardPoints[end];
        dfs(cardPoints,start,end-1,sum,k-1);
        sum-=cardPoints[end];
    }

    public int maxScore1(int[] cardPoints, int k) {
        int len = cardPoints.length;
        if (k == len) {
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += cardPoints[i];
            }
            return sum;
        }
        int start = 0;
        int end = len-1;
        return findMax(cardPoints,start,end,k);
        //return Math.max(cardPoints[0] + maxScore(Arrays.copyOfRange(cardPoints, 1, len),k-1), cardPoints[len - 1] + maxScore(Arrays.copyOfRange(cardPoints, 0, len - 1),k-1));
    }

    public int findMax(int[] cardPoints, int start, int end, int k) {
        if(k==1) return Math.max(cardPoints[start],cardPoints[end]);
        return Math.max(cardPoints[start]+findMax(cardPoints,start+1,end,k-1),cardPoints[end]+findMax(cardPoints,start,end-1,k-1 ));
    }
}
