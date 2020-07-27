package com.xiaoxiao.区间dp.no730统计不同回文子序列;

/**
 * 给定一个字符串 S，找出 S 中不同的非空回文子序列个数，并返回该数字与 10^9 + 7 的模。
 * 通过从 S 中删除 0 个或多个字符来获得子序列。
 * 如果一个字符序列与它反转后的字符序列一致，那么它是回文字符序列。
 * 如果对于某个  i，A_i != B_i，那么 A_1, A_2, ... 和 B_1, B_2, ... 这两个字符序列是不同的。
 *
 * @author Xiaoyu
 * @date 2020/5/31 - 9:23
 */
class Solution {
    public int countPalindromicSubsequences(String S) {
        /*
         * 最后的状态是dp[i][j],代表含义是s[i...j]之间的全部子序列字符的回文字符的个数
         * 很明显有两种状态
         * 1.s[i]!=s[j],这时候dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1]
         * 2.s[i]==s[j],这个时候有好几种情况 首先一种就是中间字符没有s[i]的,那么这个dp[i][j]=dp[i-1][j-1]*2+2
         *      因为这个i,j的位置字符串就是中间的回文数*2,*2的原因是他本身和包裹s[i]和s[j]的字符串,+2是+本身这个s[i]和s[i]s[j]
         *      第二种情况是中间含有一个s[i],那么同上,但是不用加他本身这个s[i],所以
         *      dp[i][j]=dp[i+1][j-1]*2+1
         *      最后一种情况就是两个及以上的s[i],从左右开始找,找到第一对s[i]中间的字符,他们会被重复一次,所以减去,也没必要再加本身了
         *      dp[i][j]=dp[i+1][j-1]*2-dp[l+1][r-1]
         *
         * 转移方程i与i+1相关,j与j-1相关,考虑i使用逆序,j使用正序
         */
        int len = S.length();
        final int MOD = 1000000007;
        long[][] dp = new long[len][len];
        //提前输入
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        //一开始从后面长度为2的字符串开始,长度为1已经初始化了.
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (S.charAt(i) != S.charAt(j)) {
                    dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                    dp[i][j] %= MOD;
                } else {
                    char currC = S.charAt(i);//获取当前字符
                    //定义左右,开始找里面和currC相等字符个数
                    int l = i + 1;
                    int r = j - 1;
                    while (l <= r && S.charAt(l) != currC) l++;
                    while (l <= r && S.charAt(r) != currC) r--;
                    //如果里面都没有,比如"aba"
                    if (l == r) dp[i][j] = dp[i + 1][j - 1] * 2 + 1;
                    else if (l > r) dp[i][j] = dp[i + 1][j - 1] * 2 + 2;
                    else dp[i][j] = dp[i + 1][j - 1] * 2 - dp[l + 1][r - 1];
                    dp[i][j] %= MOD;
                }
                //Because (a - b) % M = (a % M - b % M) + M when a % M - b % M < 0
                dp[i][j] = dp[i][j] < 0 ? dp[i][j] + MOD : dp[i][j];
            }
        }
        return (int) (dp[0][len - 1]);
    }
}
