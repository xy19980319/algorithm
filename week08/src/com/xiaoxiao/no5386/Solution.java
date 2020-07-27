package com.xiaoxiao.no5386;

import java.util.Arrays;

/**给你两个字符串 s1 和 s2 ，它们长度相等，请你检查是否存在一个 s1  的排列可以打破 s2 的一个排列，或者是否存在一个 s2 的排列可以打破 s1 的一个排列。
 字符串 x 可以打破字符串 y （两者长度都为 n ）需满足对于所有 i（在 0 到 n - 1 之间）都有 x[i] >= y[i]（字典序意义下的顺序）。
 * @author Xiaoyu
 * @date 2020/5/2 - 23:42
 */
public class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int len = s1.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean isBig =false;
        boolean isSmall =false;
        for (int i = 0; i < len; i++) {
            if(chars1[i]-chars2[i]>0) {
                isBig = true;
                break;
            }else if(chars1[i]-chars2[i]<0){
                isSmall = true;
                break;
            }
        }
        if(isBig) {
            for (int i = 0; i < len; i++) {
                if(chars1[i]-chars2[i]<0) {
                    return false;
                }
            }
        }
        if(isSmall) {
            for (int i = 0; i < len; i++) {
                if(chars1[i]-chars2[i]>0) {
                    return false;
                }
            }
        }
        return true;
    }
}
