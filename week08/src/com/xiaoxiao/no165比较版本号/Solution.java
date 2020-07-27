package com.xiaoxiao.no165比较版本号;

import java.util.ArrayList;

import java.util.List;

/**
 * 比较两个版本号 version1 和 version2。
 * 如果 version1 > version2 返回 1，如果 version1 < version2 返回 -1， 除此之外返回 0。
 * 你可以假设版本字符串非空，并且只包含数字和 . 字符。
 *  . 字符不代表小数点，而是用于分隔数字序列。
 * 例如，2.5 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。
 * 你可以假设版本号的每一级的默认修订版号为 0。例如，版本号 3.4 的第一级（大版本）和第二级（小版本）修订号分别为 3 和 4。其第三级和第四级修订号均为 0。
 * 示例 1:
 * 输入: version1 = "0.1", version2 = "1.1"
 * 输出: -1
 *
 * @author Xiaoyu
 * @date 2020/4/29 - 11:04
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        //根据.来记录有几个子版本
        version1 = version1 + ".";
        version2 = version2 + ".";
        List<Character> chars1 = new ArrayList<>();//记录数字
        List<Character> chars2 = new ArrayList<>();
        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) == '.')
                chars1.add(version1.charAt(i - 1));
        }
        for (int i = 0; i < version2.length(); i++) {
            if (version2.charAt(i) == '.')
                chars2.add(version2.charAt(i - 1));
        }
        int len = Math.max(chars1.size(), chars2.size());
        char comp1;
        char comp2;
        for (int j = 0; j < len; j++) {
            comp1 = j+1<=chars1.size()?chars1.get(j):0;
            comp2 = j+1<=chars2.size()?chars2.get(j):0;
            if (comp1 - comp2 != 0) return comp1 - comp2 > 0 ? 1 : -1;
        }
        return 0;
    }
}
