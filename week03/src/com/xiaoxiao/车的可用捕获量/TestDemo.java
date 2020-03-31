package com.xiaoxiao.车的可用捕获量;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 11:59
 */
public class TestDemo {
    @Test
    public void test() {
        char[][] board = {{'.', '.', '.', '.', '.', '.', '.', '.'},{'.', '.', '.', 'p', '.', '.', '.', '.'},{
        '.', '.', '.', 'p', '.', '.', '.', '.'},{'p', 'p', '.', 'R', '.', 'p', 'B', '.'},{
        '.', '.', '.', '.', '.', '.', '.', '.'},{'.', '.', '.', 'B', '.', '.', '.', '.'},{
        '.', '.', '.', 'p', '.', '.', '.', '.'},{'.', '.', '.', '.', '.', '.', '.', '.'}};


        Solution s = new Solution();
        int i = s.numRookCaptures(board);
        System.out.println(i);

    }
}
