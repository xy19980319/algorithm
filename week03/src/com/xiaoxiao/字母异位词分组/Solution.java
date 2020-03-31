package com.xiaoxiao.字母异位词分组;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * 说明：
 * <p>
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 *
 * @author Xiaoyu
 * @date 2020/3/25 - 10:15
 */
public class Solution {
    List<List<String>> lists = new ArrayList<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return lists;
        boolean[] isUsed = new boolean[strs.length];//标记是否被使用
        for (int i = 0; i < strs.length; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;//如果没被使用,那么标记
                List<String> list = new ArrayList<>();
                list.add(strs[i]);//将这个用来验证的字符串先加入

                for (int j = i + 1; j < strs.length; j++) {
                    if (isUsed[j] || strs[i].length() != strs[j].length()) continue;//只找相等字符串长度的位置
                    int[] hash = new int[26];//标记26个单词
                    //遍历要验证的字符串,放入哈希表
                    for (int index = 0; index < strs[i].length(); index++) {
                        hash[strs[i].charAt(index) - 'a'] += 1;
                    }
                    if (isAnagram(hash, strs[j])) {
                        isUsed[j] = true;
                        list.add(strs[j]);
                    }
                }
                if (list.size() != 0) lists.add(list);
            }
        }
        return lists;
    }

    private boolean isAnagram(int[] hashC, String str) {
        for (int i = 0; i < str.length(); i++) {
            int curr = str.charAt(i) - 'a';
            if (hashC[curr] > 0) hashC[curr] -= 1;
            else return false;
        }
        return true;
    }

/*    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return lists;
        List<String> list = new ArrayList<>();
        boolean[] isUsed = new boolean[strs.length];//标记是否被使用
        for (int i = 0; i < strs.length; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;//如果没被使用,那么标记
                dfs(strs, isUsed,list, i);
            }
        }

    }

    private void dfs(String[] strs, boolean[] isUsed, List<String> list, int num) {
        if (num == strs.length) {
            lists.add(new ArrayList<>(list));//将字符串集合加入lists
            return;
        }
        //开始向下递归
        for (int i = num + 1; i < strs.length; i++) {
            //如果没有使用过
            if(!isUsed[i]&&strs[i].length()==strs[num].length()) {

            }
        }
    }*/
}
