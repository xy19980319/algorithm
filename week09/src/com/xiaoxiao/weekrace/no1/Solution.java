package com.xiaoxiao.weekrace.no1;

import java.util.ArrayList;

import java.util.List;

/**
 * 给你一个目标数组 target 和一个整数 n。每次迭代，需要从  list = {1,2,3..., n} 中依序读取一个数字。
 * 请使用下述操作来构建目标数组 target ：
 * Push：从 list 中读取一个新元素， 并将其推入数组中。
 * Pop：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 * 题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
 * <p>
 * 请返回构建目标数组所用的操作序列。
 * <p>
 * 题目数据保证答案是唯一的。
 *
 * @author Xiaoyu
 * @date 2020/5/10 - 10:28
 */
public class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length;
        List<String> res = new ArrayList<>();
        int currNum = 1;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if(target[len-1] == currNum) {
                res.add("Push");
                break;
            }
            if(target[curr]!=currNum) {
                res.add("Push");
                res.add("Pop");
            }else {
                res.add("Push");
                curr++;
            }
            currNum++;
        }
        return res;
    }
}
