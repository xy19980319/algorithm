package com.xiaoxiao.twoweekrace.no2;

import java.util.ArrayList;
import java.util.List;

/**
 * 5397. 最简分数  显示英文描述
 * 给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足分母小于等于  n 的 最简 分数 。分数可以以 任意 顺序返回。
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：["1/2"]
 * 解释："1/2" 是唯一一个分母小于等于 2 的最简分数。
 * 示例 2：
 * <p>
 * 输入：n = 3
 * 输出：["1/2","1/3","2/3"]
 * 示例 3：
 * <p>
 * 输入：n = 4
 * 输出：["1/2","1/3","1/4","2/3","3/4"]
 * 解释："2/4" 不是最简分数，因为它可以化简为 "1/2" 。
 *
 * @author Xiaoyu
 * @date 2020/5/16 - 22:26
 */
public class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        //分子除以分母不能必须有余数
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    res.add(j + "/" + i);
                    continue;
                }
                if (!hasDivisor(i, j)) {
                    res.add(j + "/" + i);
                }
            }
        }
        return res;
    }

    //i>j
    private boolean hasDivisor(int i, int j) {
        if (i % j == 0) return true;
        if((i%2==0&&j%2==0)||(i%3==0&&j%3==0)||(i%5==0&&j%5==0)||(i%7==0&&j%7==0)||(i%11==0&&j%11==0)||
                (i%13==0&&j%13==0)||(i%17==0&&j%17==0)||(i%19==0&&j%19==0)||(i%23==0&&j%23==0)||
                (i%29==0&&j%29==0)||(i%31==0&&j%31==0)||(i%37==0&&j%37==0)||(i%41==0&&j%41==0)||
                (i%43==0&&j%43==0)||(i%47==0&&j%47==0)) return true;
        return false;

    }
/*    public boolean isHuZhi(int m, int n) {
        int t;
        while (m > 0) {
            t = n % m;
            n = m;
            m = t;//当=0说明两个数之间存在倍数关系
        }
        if(n==1)return true;
        return false;
    }*/
}
