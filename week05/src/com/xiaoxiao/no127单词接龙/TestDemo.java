package com.xiaoxiao.no127单词接龙;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/10 - 8:51
 */
public class TestDemo {
    @Test
    public void test() {
        String beginWord = "hit";
        String endWord = "cog";
        String[] strs = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(strs);
        Solution s  = new Solution();
        int j1 = s.ladderLength(beginWord, endWord, wordList);
        System.out.println(j1);
    }
}
