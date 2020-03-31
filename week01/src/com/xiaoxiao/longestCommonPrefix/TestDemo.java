package com.xiaoxiao.longestCommonPrefix;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/15 - 0:10
 */
public class TestDemo {
    @Test
    public void test() {
        String[] strs = new String[]{"aac","acab","aa","abba","aa"};
        Solution s= new Solution();
        String s1 = s.longestCommonPrefix(strs);
        System.out.println(s1);
    }
}
