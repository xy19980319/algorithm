package com.xiaoxiao.dp.no354俄罗斯套娃信封问题;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * 说明:
 * 不允许旋转信封。
 * 示例:
 * <p>
 * 输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出: 3
 * 解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 *
 * @author Xiaoyu
 * @date 2020/4/14 - 8:21
 */
public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) return 0;
        int nums = envelopes.length;//记录信封总数
        int[] dp = new int[nums + 1];//动态规划
        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[1]));
        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[0]));
        //boolean[] used = new boolean[nums + 1];
        dp[0] = 1;
        int[] maxEnve = {Integer.MIN_VALUE, Integer.MIN_VALUE}; //记录最大信封
        int[] minEnve = {Integer.MAX_VALUE, Integer.MAX_VALUE}; //记录最小信封
        int maxNums = 1; //记录最大信封数量
        for (int i = 1; i < nums; i++) {
            //当前位置的长宽的比最小最大还要,广泛定义当前位置的子序列的最大值
            int maxVal = 0;
            int[] curr = envelopes[i];
            /*//如果超出边界,直接将最大信封+1,然后更改最大最小值
            if ((curr[0] > maxEnve[0] && curr[1] > maxEnve[1]) || (curr[0] < minEnve[0] && curr[1] < minEnve[1])) {
                if (curr[0] > maxEnve[0] && curr[1] > maxEnve[1]) {
                    maxEnve = curr;
                }
                if (curr[0] < minEnve[0] && curr[1] < minEnve[1]) {
                    minEnve = curr;
                }
                dp[i] = dp[i - 1] + 1;//直接加入到前面的套娃里面
            } else {*/
            //更新最大值
            for (int j = 0; j < i; j++) {
                int[] innerCurr = envelopes[j];
                //如果该位置能够进行套娃,那么将这个位置换成子序列的最大数
                if ((curr[0] > innerCurr[0] && curr[1] > innerCurr[1])/*||(curr[0]<innerCurr[0]&&curr[1]<innerCurr[1])*/) {
                    maxVal = Math.max(maxVal, dp[j]);
                }
            }
            dp[i] = maxVal + 1;
            maxNums = Math.max(dp[i], maxNums);
        }
        //maxNums = Math.max(dp[i], maxNums);
        /*}*/
        return maxNums;
    }

    public int maxEnvelopes1(int[][] envelopes) {
        if (envelopes.length == 0) return 0;
        int nums = envelopes.length;//记录信封总数
        int[] dp = new int[nums + 1];//动态规划
        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[1]));
        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[0]));
        //boolean[] used = new boolean[nums + 1];
        dp[0] = 0;
        int[] maxEnve = {Integer.MIN_VALUE, Integer.MIN_VALUE}; //记录最大信封
        int[] minEnve = {Integer.MAX_VALUE, Integer.MAX_VALUE}; //记录最小信封
        int maxNums = 0; //记录最大信封数量
        for (int i = 1; i <= nums; i++) {
            //当前位置的长宽的比最小最大还要,广泛定义当前位置的子序列的最大值
            int maxVal = 0;
            int[] curr = envelopes[i - 1];
            //如果超出边界,直接将最大信封+1,然后更改最大最小值
            if ((curr[0] > maxEnve[0] && curr[1] > maxEnve[1]) || (curr[0] < minEnve[0] && curr[1] < minEnve[1])) {
                if (curr[0] > maxEnve[0] && curr[1] > maxEnve[1]) {
                    maxEnve = curr;
                }
                if (curr[0] < minEnve[0] && curr[1] < minEnve[1]) {
                    minEnve = curr;
                }
                dp[i] = dp[i - 1] + 1;//直接加入到前面的套娃里面
            } else {
                //更新最大值
                for (int j = 0; j < i; j++) {
                    int[] innerCurr = envelopes[j];
                    //如果该位置能够进行套娃,那么将这个位置换成子序列的最大数
                    if ((curr[0] > innerCurr[0] && curr[1] > innerCurr[1])) {
                        maxVal = Math.max(maxVal, dp[j]);
                    }
                }
                dp[i] = maxVal + 1;
            }
            maxNums = Math.max(dp[i], maxNums);
        }
        return maxNums;
    }
}
