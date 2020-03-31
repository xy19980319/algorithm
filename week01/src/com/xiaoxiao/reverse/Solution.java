package com.xiaoxiao.reverse;

import java.util.Objects;

/**
 * @author Xiaoyu
 * @date 2020/3/11 - 23:34
 */
public class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        int first = 0;
        int last = s.length() - 1;
        char[] chars = s.toCharArray();
        if (Objects.equals(chars[0], '-')) {
            first = 1;
            last = s.length() - 1;
        }
        char temp;
        while (first < last) {
            temp = chars[first];
            chars[first] = chars[last];
            chars[last] = temp;
            first++;
            last--;
        }
        int result = 0;
        try {
            result = Integer.parseInt(new String(chars));
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }

    public int reverse1(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];
        int count = 0;
        if (Objects.equals(chars[0], '-')) {
            newChars[count++] = '-';
            for (int i = chars.length - 1; i > 0; i--) {
                newChars[count++] = chars[i];
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                newChars[count++] = chars[i];
            }
        }
        int result = 0;
        try {
            result = Integer.parseInt(new String(newChars));
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }
}
