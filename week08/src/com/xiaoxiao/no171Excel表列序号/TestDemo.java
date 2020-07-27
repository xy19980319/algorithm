package com.xiaoxiao.no171Excel表列序号;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 12:13
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "ABCDE";
        Solution s= new Solution();
        int j = s.titleToNumber(str);
        System.out.println(j);
    }
}
