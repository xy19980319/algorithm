package com.xiaoxiao.twoweekrace.no4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 5399. 数位成本和为目标值的最大数字  显示英文描述
 * 给你一个整数数组 cost 和一个整数 target 。请你返回满足如下规则可以得到的 最大 整数：
 * <p>
 * 给当前结果添加一个数位（i + 1）的成本为 cost[i] （cost 数组下标从 0 开始）。
 * 总成本必须恰好等于 target 。
 * 添加的数位中没有数字 0 。
 * 由于答案可能会很大，请你以字符串形式返回。
 * <p>
 * 如果按照上述要求无法得到任何整数，请你返回 "0" 。
 * 输入：cost = [4,3,2,5,6,7,2,5,5], target = 9
 * 输出："7772"
 * 解释：添加数位 '7' 的成本为 2 ，添加数位 '2' 的成本为 3 。所以 "7772" 的代价为 2*3+ 3*1 = 9 。 "997" 也是满足要求的数字，但 "7772" 是较大的数字。
 * 数字     成本
 * 1  ->   4
 * 2  ->   3
 * 3  ->   2
 * 4  ->   5
 * 5  ->   6
 * 6  ->   7
 * 7  ->   2
 * 8  ->   5
 * 9  ->   5
 *
 * @author Xiaoyu
 * @date 2020/5/16 - 23:34
 */
public class Solution {
    public String largestNumber(int[] cost, int target) {
        List<List<List<Integer>>> res = new ArrayList<>();
        List<List<Integer>> comps = new ArrayList<>();
        //成本,数位为一个数组[i+1,cost[i]]
        dfs(cost, target, comps, res);
        if (res.isEmpty()) return "0";
        String ans = outRes(res);
        return ans;
    }

    private String outRes(List<List<List<Integer>>> res) {
        StringBuilder sb = new StringBuilder();
        res.sort((o1, o2) -> o1.size() - o2.size());
        if(res.size()==1||res.get(res.size()-1).size()>res.get(res.size()-2).size()) {
            out(res, sb);
        }else {
            int fSize = res.size();
            for (int i = 0; i < fSize; i++) {
                if(res.get(0).size()<res.get(res.size() -1).size()) res.remove(0);
                if(res.size()==2) out(res, sb);
            }
            int sSize = res.size();
            for (int i = 0; i < sSize; i++) {
                res.get(i).sort((o1, o2) -> o2.get(0)-o1.get(0));
            }
            res.sort((o1, o2) -> o1.get(0).get(0)-o2.get(0).get(0));
            for (int i = 0; i < sSize; i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    if(res.get(0).get(j).get(0)<res.get(res.size() -1).get(j).get(0)) res.remove(0);
                    if(res.size()==2) out(res, sb);
                }
            }
        }
        return sb.toString();
    }

    private void out(List<List<List<Integer>>> res, StringBuilder sb) {
        List<List<Integer>> temp = res.get(res.size() - 1);
        temp.sort((o1, o2) -> o2.get(0)-o1.get(0));
        for (int i = 0; i < temp.size(); i++) {
            sb.append(temp.get(i));
        }
    }

    private void dfs(int[] cost, int target, List<List<Integer>> comps, List<List<List<Integer>>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(comps));
            return;
        }
        if (target < 0) return;
        for (int i = 1; i <= cost.length; i++) {
            List<Integer> comp = new ArrayList<>();
            comp.add(i);
            comp.add(cost[i - 1]);
            comps.add(comp);
            dfs(cost, target - cost[i - 1], comps, res);
            comps.remove(comps.size() - 1);
        }
    }
}
