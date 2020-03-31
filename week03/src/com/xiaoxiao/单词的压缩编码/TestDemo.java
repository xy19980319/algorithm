package com.xiaoxiao.单词的压缩编码;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/28 - 11:05
 */
public class TestDemo {
    @Test
    public void test() {
        String[] words = {"mean", "me", "bell"};
        Solution s= new Solution();
        int i = s.minimumLengthEncoding(words);
        System.out.println(i);

    }
}
