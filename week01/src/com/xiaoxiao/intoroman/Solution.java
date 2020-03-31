package com.xiaoxiao.intoroman;

/**
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * @author Xiaoyu
 * @date 2020/3/14 - 23:31
 */
public class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int count = 0;
        if (num >= 1000) {
            count = num / 1000;
            while (count > 0) {

                sb.append("M");
                count--;
            }
            num %= 1000;
        }
        if (num >= 100) {
            count = num / 100;
            while (count > 0) {
                if (count == 9) {
                    sb.append("CM");
                    count = 0;
                } else if (count >= 5) {
                    sb.append("D");
                    count -= 5;
                } else if (count == 4) {
                    sb.append("CD");
                    count -= 4;
                } else {
                    sb.append("C");
                    count--;
                }
            }
            num %= 100;
        }
        if (num >= 10) {
            count = num / 10;
            while (count > 0) {
                if (count == 9) {
                    sb.append("XC");
                    count = 0;
                } else if (count >= 5) {
                    sb.append("L");
                    count -= 5;
                } else if (count == 4) {
                    sb.append("XL");
                    count -= 4;

                } else {
                    sb.append("X");
                    count--;

                }
            }
            num %= 10;
        }
        if (num >= 1) {
            count = num;
            while (count > 0) {
                if (count == 9) {
                    sb.append("IX");
                    count = 0;
                } else if (count >= 5) {
                    sb.append("V");
                    count -= 5;
                } else if (count == 4) {
                    sb.append("IV");
                    count -= 4;

                } else {
                    sb.append("I");
                    count--;

                }
            }
        }

        return sb.toString();
    }
}
