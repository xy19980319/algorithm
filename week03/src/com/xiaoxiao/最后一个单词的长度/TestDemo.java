package com.xiaoxiao.最后一个单词的长度;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 14:14
 */
public class TestDemo {
    @Test
    public void test() {
        String str = " aa   ";
        Solution s = new Solution();
        int i = s.lengthOfLastWord(str);
        System.out.println(i);
    }
}
