package com.xiaoxiao.compressstring;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 示例1:
 * <p>
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 * 示例2:
 * <p>
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 *
 * @author Xiaoyu
 * @date 2020/3/16 - 16:00
 */
public class Solution {
    public String compressString(String S) {
        if (S.isEmpty()) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int current = 1;
        int count = 1;
        sb.append(S.charAt(0));
        while (current < S.length()) {
            //如果字符第一次出现
            if (S.charAt(current) != S.charAt(current - 1)) {
                sb.append(count);
                sb.append(S.charAt(current));
                count = 1;
            } else {
                count++;
            }
            current++;
        }
        sb.append(count);
        return sb.toString().length() >= S.length() ? S : sb.toString();
    }
}
