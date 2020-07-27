package com.xiaoxiao.twoweekrace.no1;

/**
 * 5396. 连续字符
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 * 请你返回字符串的能量。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 * 示例 2：
 * <p>
 * 输入：s = "abbcccddddeeeeedcba"
 * 输出：5
 * 解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 *
 * @author Xiaoyu
 * @date 2020/5/16 - 22:26
 */
public class Solution {
    public int maxPower(String s) {
        int[] table = new int[26];
        char[] chars = s.toCharArray();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i + 1 < chars.length && chars[i + 1] == c) {
                count++;
            } else {
                table[c - 'a'] = Math.max(count, table[c - 'a']);
                count = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < table.length; i++) {
            max = Math.max(max, table[i]);
        }
        return max;
    }
}
