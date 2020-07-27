package com.xiaoxiao.dp.no139单词拆分;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 *
 * @author Xiaoyu
 * @date 2020/4/13 - 11:16
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean wordBreak3(String s, List<String> wordDict) {
        //HashSet<String> wordDictSet = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0]=true;
        //将状态放入dp数组中
        for (int right = 1; right <= len; right++) {
                for (int j = 0; j < right; j++) {
                    if (dp[j]&&wordDict.contains(s.substring(j , right ))){
                        dp[right] = true;
                        break;
                    }
                }
        }
        return dp[len ];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        /*
         * 1.问题分解为s[0,n]&&s[n,n+k]&&s
         * */
        //将状态放入dp数组中
        for (int right = 0; right < len; right++) {
            for (int left = 0; left <= right; left++) {
                if (wordDict.contains(s.substring(left, right + 1))) {
                    dp[left][right] = true;
                } else {

                }
            }
        }
        return false;
    }

    public boolean find(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return true;
        int len = s.length();
        for (int i = 0; i < wordDict.size(); i++) {
            String str = wordDict.get(i);
            int index = s.indexOf(str);
            //找到了索引的位置
            if (index >= 0) {
                String substring1 = s.substring(0, index);
                if (wordBreak(substring1, wordDict) && wordBreak(s.substring(index + str.length()), wordDict))
                    return true;
            }
        }
        return false;
    }
}
