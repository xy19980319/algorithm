package com.xiaoxiao.regexismatch;

import java.util.Objects;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * 说明:
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 示例 1:
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3:
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4:
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5:
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 *
 * @author Xiaoyu
 * @date 2020/3/13 - 16:46
 */
//此方案想法错误 应该正序回溯
public class Solution {
    public boolean isMatch(String s, String p) {
        //考虑到字符可能出现空串现象,s,p都为空的时候能够输出true,其他情况都是false
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        //如果只有.和正常字符的话,那么正常的匹配规则如下
        boolean headMatched = !s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        //现在p肯定不为空,那么如果p的首字母存在并且他还有后续,为*开头
        if (p.length()>=2&&p.charAt(1)=='*') {
            //s的字符可以出现0次或者多次,出现0次则吧p的指针后移2位,出现一次或者多次则吧s的指针后移一位
            //当出现类似ppppp,*pppp,只要定位到了pp,*ppp就能输出0次的结果,这样为true
            return isMatch(s,p.substring(2))||(headMatched&&isMatch(s.substring(1),p));

        }else if(headMatched) {
            return isMatch(s.substring(1),p.substring(1));
        }else {
            return false;
        }

    }


    public boolean isMatch1(String s, String p) {
        if ((s.length() == 0 && p.length() != 0) || (s.length() != 0 && p.length() == 0)) {
            return false;
        }
        int slast = s.length() - 1;
        int plast = p.length() - 1;
        return matchTwo(s, p, slast, plast);
    }

    private boolean matchTwo(String s, String p, int slast, int plast) {
        if (plast == -1) {
            if (slast == -1) {

                return true;
            } else {
                return false;
            }
        }
        if (slast == -1) {
            return checkP(p,plast);
        }

        if (p.charAt(plast) == '*') {
            if (slast == -1) {
                return true;
            }
            plast--;
            if (p.charAt(plast) == '*') {
                return false;
            } else if (p.charAt(plast) == '.') {
                plast--;
                if (plast == -1) {
                    return true;
                }
                while (p.charAt(plast) != s.charAt(slast)&&p.charAt(plast)!='.') {
                    slast--;
                    if (slast == -1) {
                        return checkP(p,plast);
                    }
                }

                while (slast > plast) {
                    if (s.charAt(slast) == p.charAt(plast))
                        slast--;
                }
                return matchTwo(s, p, slast, plast);
            } else {
                plast--;

                while (p.charAt(plast) != s.charAt(slast)&&p.charAt(plast)!='.') {
                    slast--;
                    plast--;
                    if (slast == -1) {
                            return checkP(p,plast);
                    }
                }

                while (slast > plast) {
                    if (s.charAt(slast) == p.charAt(plast))
                        slast--;
                }

                return matchTwo(s, p, slast, plast);

            }
        } else if (p.charAt(plast) == '.') {
            plast--;
            slast--;
            if (slast <= -1 && plast != -1) {
                return checkP(p,plast);
            }
            return matchTwo(s, p, slast, plast);
        } else {
            if (p.charAt(plast) == s.charAt(slast)) {
                --slast;
                --plast;
                if (slast == -1 && plast != -1) {
                    return checkP(p, plast);
                }
                return matchTwo(s, p, slast, plast);
            } else {
                return false;
            }
        }
    }

    private boolean checkP(String p, int plast) {
        if (p.charAt(plast) != '*' || plast % 2 != 1) {
            return false;
        }
        int pre = plast - 1;
        int curr = plast;
        while (pre >= 0) {
            if (p.charAt(pre) != '*' && p.charAt(curr) == '*'){
                pre -= 2;
                curr -= 2;
            }
        }
        return true;
    }
}
