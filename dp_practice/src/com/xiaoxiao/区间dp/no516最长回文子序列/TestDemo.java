package com.xiaoxiao.区间dp.no516最长回文子序列;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/27 - 0:14
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "aabaaba";
        Solution s= new Solution();
        int i = s.longestPalindromeSubseq(str);
        System.out.println(i);
    }
}
