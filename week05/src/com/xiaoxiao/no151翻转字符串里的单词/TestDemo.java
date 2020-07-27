package com.xiaoxiao.no151翻转字符串里的单词;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/10 - 11:26
 */
public class TestDemo {
    @Test
    public void test() {
        String str="a good   example";
        Solution s= new Solution();
        String s1 = s.reverseWords(str);
        System.out.println(s1);
    }
}
