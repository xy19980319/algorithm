package com.xiaoxiao.doubleweekrace.no1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**5408. 通过翻转子数组使两个数组相等  显示英文描述
 给你两个长度相同的整数数组 target 和 arr 。
 每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 输入：target = [1,2,3,4], arr = [2,4,1,3]
 输出：true
 解释：你可以按照如下步骤使 arr 变成 target：
 1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
 * @author Xiaoyu
 * @date 2020/5/30 - 21:51
 */
public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < target.length; i++) {
            l1.add(target[i]);
            l2.add(arr[i]);
        }
        return l1.containsAll(l2);
    }
}
