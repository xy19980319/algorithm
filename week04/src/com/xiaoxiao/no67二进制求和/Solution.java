package com.xiaoxiao.no67二进制求和;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 16:17
 */
public class Solution {
    public String addBinary(String a, String b) {
        //健壮性
        int shortLen = Math.min(a.length(), b.length()); //首先将短的作为遍历长度
        int curr = shortLen - 1;
        String longer ;
        String shorter;
        if (a.length() > b.length()) {
            longer = a.substring(a.length() - b.length());
            shorter = b;
        } else {
            longer = b.substring(b.length() - a.length());
            shorter = a;
        }
        boolean isAdd = false;//标记是否需要进位
        StringBuilder res = new StringBuilder();//存放最终结果
        while (curr >= 0) {
            //如果不相等,那说明两个加起来等于1
            if (longer.charAt(curr) != shorter.charAt(curr)) {
                if (isAdd) res.append(0);
                else res.append(1);
                curr--;
                continue;
            }
            //两个都为0,如果有进位则加一,否则不加
            if (longer.charAt(curr) == '0') {
                if (isAdd) {
                    res.append(1);
                    isAdd = false;
                } else res.append(0);
            } else {
                //两个都是1,肯定要进位
                if (isAdd) res.append(1);
                else {
                    res.append(0);
                    isAdd = true;
                }
            }
            curr--;
        }
        //看看还有没有剩余,有剩余就还需要进行遍历
        if (a.length() == b.length()) {
            if (isAdd) res.append(1);//如果还有进位就要加一
        } else {
            //找到长的那个字符串
            String longstr = a.length()>b.length()?a:b;
            String str = longstr.substring(0,longstr.length()-shortLen);//长的剩余部分
            //如果没有进位
            if (!isAdd) return res.reverse().insert(0, str).toString();
                //如果有进位
            else {
                for (int i = str.length() - 1; i >= 0; i--) {
                    if (str.charAt(i) == '0') {
                        if(isAdd) {
                            res.append(1);
                            isAdd = false;
                        }
                        else res.append(0);
                    } else {
                        //有一个进位,那么加入0,否则加入1
                        if(isAdd) res.append(0);
                        else res.append(1);
                    }
                }
                //如果还留进位
                if (isAdd) return res.reverse().insert(0, 1).toString();
            }

        }
        return res.reverse().toString();
    }
}
