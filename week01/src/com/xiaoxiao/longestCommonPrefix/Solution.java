package com.xiaoxiao.longestCommonPrefix;

/**
 * @author Xiaoyu
 * @date 2020/3/15 - 0:10
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length ==1) {
            return strs[0];
        }
        int leastLength = strs[0].length();
        for (int v = 0; v < strs.length; v++) {
            if (strs[v] == null || strs[v].length() == 0) {
                return "";
            }
            leastLength = leastLength > strs[v].length() ? strs[v].length() : leastLength;
        }
        int first = 0;
        int last = strs.length - 1;
        char common;

        int count = 1;
        StringBuilder sb = new StringBuilder();
        if (strs[first].charAt(0) == strs[last].charAt(0)) {
            common = strs[0].charAt(0);
            while (first <= last) {
                if (strs[first].charAt(0) == strs[last].charAt(0)) {
                    if (common == strs[first].charAt(0)) {
                        first++;
                        last--;
                    } else {
                        return "";
                    }
                } else {
                    return "";
                }
            }
            sb.append(common);
        } else {
            return "";
        }

        while (count < leastLength) {
            first = 0;
            last = strs.length - 1;
            if (strs[first].charAt(count) == strs[last].charAt(count)) {
                common = strs[0].charAt(count);
                while (first <= last) {
                    if (strs[first].charAt(count) == strs[last].charAt(count)) {
                        if (common == strs[first].charAt(count)) {
                            first++;
                            last--;
                        } else {
                            common = 0;
                            break;
                        }
                    } else {
                        common = 0;
                        break;
                    }
                }
                if (common != 0)
                sb.append(common);

            }
            count++;

        }
        return sb.toString();

    }
}
