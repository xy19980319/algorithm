package com.xiaoxiao.no207课程表;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/7 - 14:20
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[][] arr = {{0,1},{1,2},{4,5},{5,6},{10,11}};
        boolean b = s.canFinish(12, arr);
        System.out.println(b);
    }
}
