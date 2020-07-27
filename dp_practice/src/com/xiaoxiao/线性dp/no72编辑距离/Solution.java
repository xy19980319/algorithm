package com.xiaoxiao.线性dp.no72编辑距离;

/**
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 你可以对一个单词进行如下三种操作：
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *  
 * <p>
 * 示例 1：
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 *
 * @author Xiaoyu
 * @date 2020/5/14 - 11:00
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        /*  1.word1可以转变为word2
            2.word2可以转变为word1
            操作为:
                插入一个字符
                删除一个字符
                替换一个字符
            可以综合以上三种行为
                1.word1插入一个字符=word2删除一个字符
                2.word1删除一个字符=word2插入一个字符
                3.word1修改=word2修改
        * */
        int len1 = word1.length();
        int len2 = word2.length();
        if (len1 == 0 && len2 == 0) return 0;
        if (len1 == 0 || len2 == 0) return len1 == 0 ? len2 : len1;

        int[][] dp = new int[len1 + 1][len2 + 1];
        //提前输入初始化
        for (int i = 1; i <= len2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + 1);
            }
        }

        return dp[len1][len2];
    }

    public int minDistance1(String word1, String word2) {
        if (word1.length() == 0 && word2.length() == 0) return 0;
        if (word1.length() == 0 || word2.length() == 0) return word1.length() == 0 ? word2.length() : word1.length();

        /*
         * 这道题可以理解为6中操作方法,分别是word1,word2的插入,删除,修改
         * 总得来说可以转换成word1插入,word2插入,word1修改
         * 第一种情况可以转化为子问题是编辑距离word1(0,...,i-1),word2(0,...,j)这时只要在word1插入
         * 第二种情况可以转化为子问题是编辑距离word1(0,...,i),word2(0,...,j-1)这时只要在word2插入
         * 第三种情况可以转化为子问题是编辑距离word1(0,...,i-1),word2(0,...,j-1)这时只要在word1修改,这里有个特殊情况就是如果word1(i)和word2(j)相等,那就不用进行操作
         * i,j的编辑距离就是三种情况的最小情况
         * */

        int[][] dp = new int[word1.length()][word2.length()]; //开一个二维数组对应word1,word2的每个字母位置
        dp[0][0] = word1.charAt(0) == word2.charAt(0) ? 0 : 1;  //初始条件
        /*先进行边界初始化
         *上顶边和左顶边只需要看前一个+1,只能插入操作
         * 注意边界处理时也有特殊情况,相等时没必要+1,保持上一个的操作数即可,但是如果重复出现,就需要+1了.*/
        boolean isRowRepeat = false;  //word1与word2的第一个字母是否相等
        boolean isColRepeat = false;  //word2与word1的第一个字母是否相等
        if (word1.charAt(0) == word2.charAt(0)) {
            isRowRepeat = true;
            isColRepeat = true;
        }
        //初始化dp[i][0]
        for (int i = 1; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(0) && !isColRepeat) {
                isColRepeat = true;
                dp[i][0] = dp[i - 1][0];
                continue;
            }
            dp[i][0] = word1.charAt(i) == word2.charAt(0) && !isColRepeat ? dp[i - 1][0] : dp[i - 1][0] + 1;
        }
        //初始化dp[i][0]
        for (int i = 1; i < word2.length(); i++) {
            if (word1.charAt(0) == word2.charAt(i) && !isRowRepeat) {
                isRowRepeat = true;
                dp[0][i] = dp[0][i - 1];
                continue;
            }
            dp[0][i] = word1.charAt(0) == word2.charAt(i) && !isRowRepeat ? dp[0][i - 1] : dp[0][i - 1] + 1;
        }

        for (int i = 1; i < word1.length(); i++) {
            for (int j = 1; j < word2.length(); j++) {
                //如果对应位置字母相同,那么修改可以省去
                if (word1.charAt(i) == word2.charAt(j))
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]) + 1); //转移方程
                else dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])); //转移方程
            }
        }

        return dp[word1.length() - 1][word2.length() - 1];
    }
}
