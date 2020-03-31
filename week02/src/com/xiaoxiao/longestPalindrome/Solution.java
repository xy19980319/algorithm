package com.xiaoxiao.longestPalindrome;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * 示例 1:
 * 输入:
 * "abccccdd"
 * 输出:
 * 7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 * @author Xiaoyu
 * @date 2020/3/19 - 19:32
 */
public class Solution {
    Map<Character, Integer> hashTable = new HashMap<>();

    public int longestPalindrome(String s) {
        if (s.isEmpty()) return 0;
        int len = 0;
        boolean isRemain = false;
        for (int i = 0; i < s.length(); i++) {
            if (!hashTable.containsKey(s.charAt(i))) {
                hashTable.put(s.charAt(i), 1);
            } else {
                hashTable.put(s.charAt(i), hashTable.get(s.charAt(i)) + 1);
            }
        }
        Collection<Integer> values = hashTable.values();
        for (Integer value : values) {
            if(!isRemain&&value%2==1) {
                isRemain = true;
            }
            len += (value / 2) * 2;
        }
        return isRemain?len+1:len;
    }
}
