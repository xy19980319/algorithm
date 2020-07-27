package com.xiaoxiao.no127单词接龙;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 * 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词。
 * 说明:
 * 如果不存在这样的转换序列，返回 0。
 * 所有单词具有相同的长度。
 * 所有单词只由小写字母组成。
 * 字典中不存在重复的单词。
 * 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 * 示例 1:
 * 输入:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出: 5
 * 解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * 返回它的长度 5。
 * 示例 2:
 * 输入:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * 输出: 0
 * <p>
 * 解释: endWord "cog" 不在字典中，所以无法进行转换。
 *
 * @author Xiaoyu
 * @date 2020/4/10 - 8:47
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.length() == 0 || endWord.length() == 0 || beginWord.equals(endWord)) return 0;
        if (wordList.indexOf(endWord) < 0) return 0;//看看集合中是否有结尾的单词
        int[] used = new int[wordList.size()];
        //考虑使用bfs
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int res = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            while (size > 0) {
                String out = queue.poll();
                for (int i = 0; i < wordList.size(); i++) {
                    if (used[i] == 1) continue;
                    String exch = wordList.get(i);
                    if (canChange(out, exch)) {
                        if (Objects.equals(exch, endWord)) return res;
                        queue.add(exch);
                        used[i] = 1;
                    }
                }
                size--;
            }
        }
        return 0;
    }

    private boolean canChange(String out, String exch) {
        //如果仅有一个字母不等,那么可以转换
        int diff = 0;
        for (int i = 0; i < exch.length(); i++) {
            if (out.charAt(i) != exch.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
