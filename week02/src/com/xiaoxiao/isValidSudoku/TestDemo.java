package com.xiaoxiao.isValidSudoku;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 10:57
 */
public class TestDemo {
    @Test
    public void test() {
        char[][] board = {
                {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
                {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
        Solution s = new Solution();
        boolean v = s.isValidSudoku(board);
        System.out.println(v);
    }
}

