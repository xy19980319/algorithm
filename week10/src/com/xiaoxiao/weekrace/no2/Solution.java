package com.xiaoxiao.weekrace.no2;

import java.util.Arrays;
import java.util.Comparator;

/**5413. 重新排列句子中的单词  显示英文描述
 「句子」是一个用空格分隔单词的字符串。给你一个满足下述格式的句子 text :

 句子的首字母大写
 text 中的每个单词都用单个空格分隔。
 请你重新排列 text 中的单词，使所有单词按其长度的升序排列。如果两个单词的长度相同，则保留其在原句子中的相对顺序。

 请同样按上述格式返回新的句子。
 示例 1：

 输入：text = "Leetcode is cool"
 输出："Is cool leetcode"
 解释：句子中共有 3 个单词，长度为 8 的 "Leetcode" ，长度为 2 的 "is" 以及长度为 4 的 "cool" 。
 输出需要按单词的长度升序排列，新句子中的第一个单词首字母需要大写。
 * @author Xiaoyu
 * @date 2020/5/17 - 10:31
 */
public class Solution {
    public String arrangeWords(String text) {
        String[] strs = text.split(" ");
        strs[0] = strs[0].toLowerCase();
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        char c = (char)(strs[0].charAt(0)-32);
        StringBuilder temp = new StringBuilder(strs[0]);
        temp.setCharAt(0,c);
        strs[0] = temp.toString();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            res.append(strs[i]);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
