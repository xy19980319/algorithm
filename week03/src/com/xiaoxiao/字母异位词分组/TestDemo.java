package com.xiaoxiao.字母异位词分组;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 10:15
 */
public class TestDemo {
    @Test
    public void test() {
        String[] strs = {};
        Solution s = new Solution();
        List<List<String>> lists = s.groupAnagrams(strs);
        System.out.println(lists);
    }
}
