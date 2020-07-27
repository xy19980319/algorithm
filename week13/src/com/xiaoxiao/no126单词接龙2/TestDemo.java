package com.xiaoxiao.no126单词接龙2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/6/7 - 21:24
 */
public class TestDemo {
    @Test
    public void test() {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> strings = Arrays.asList(wordList);
        Solution s = new Solution();
        List<List<String>> ladders = s.findLadders(beginWord, endWord, strings);
        System.out.println(ladders);

    }
}
