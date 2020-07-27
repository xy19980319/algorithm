package com.xiaoxiao.dp.no354俄罗斯套娃信封问题;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/14 - 8:21
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] envelopes = {{1,2},{2,3},{3,4},{4,5},{5,6},{5,5},{6,7},{7,8}};
        Solution s = new Solution();
        int i = s.maxEnvelopes1(envelopes);
        System.out.println(i);
    }
}
