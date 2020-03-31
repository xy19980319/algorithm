package com.xiaoxiao.countCharacters;

/**
 * @author Xiaoyu
 * @date 2020/3/17 - 23:48
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        int charsTable[] = new int[26];
        int wordsTable[] = new int[26];
        int len = 0;
        for (char c : chars.toCharArray()) {
            //统计每个字母出现的次数
            charsTable[c-'a'] +=1;
        }
        //统计每个单词的每个字母出现次数
        for (String word : words) {
            //记录单词是否是可以
            boolean isRem = false;
            for (char c : word.toCharArray()) {
                wordsTable[c-'a'] +=1;
                if (charsTable[c-'a']>wordsTable[c-'a']) isRem=true;
            }
            len += isRem?word.length() :0;
        }

        return len;
    }
}
