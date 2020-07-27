package com.xiaoxiao.dp.no516最长回文子序列;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/18 - 9:00
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "bbbab";
        Solution s= new Solution();
        int j = s.longestPalindromeSubseq(str);
        System.out.println(j);
    }
}
