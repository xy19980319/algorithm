package com.xiaoxiao.Zconvert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/11 - 21:18
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s == null) {
            return null;
        }

        if (numRows < 2) {
            return s;
        }
        //存放新的数组
        List<String> stringList = new ArrayList<>();
        //设置间隔
        int interval = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            int count = i;
            if (i == 0 || i == numRows - 1) {
                while (count < s.length()) {
                    stringList.add(String.valueOf(s.charAt(count)));
                    count += interval;
                }

            } else {
                while (count  < s.length() ) {
                    stringList.add(String.valueOf(s.charAt(count)));
                    if (count + interval - 2 * i < s.length()) {
                        stringList.add(String.valueOf(s.charAt(count + interval - 2 * i)));
                    }
                    count += interval;
                }
            }

        }
        return String.join("", stringList);
    }
}
