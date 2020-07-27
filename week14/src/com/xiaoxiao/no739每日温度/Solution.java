package com.xiaoxiao.no739每日温度;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/daily-temperatures
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/11 - 8:24
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        List<Integer>[] hash = new ArrayList[101];

        for (int i = 0; i < len; i++) {
            if (hash[T[i]] == null) {
                hash[T[i]] = new ArrayList<>();
            }
            hash[T[i]].add(i);
        }
        for (int i = 30; i <= 100; i++) {
            if (hash[i] == null) continue;
            Collections.sort(hash[i]);
        }
        for (int i = 0; i < len; i++) {
            int min = 30001;
            for (int j = T[i] + 1; j <= 100; j++) {
                if (hash[j] == null) continue;
                int indexMin = 30001;
                for (int m = 0; m < hash[j].size(); m++) {
                    Integer indexTemp = hash[j].get(m);
                    if (indexTemp > i) {
                        indexMin = Math.min(indexMin, indexTemp);
                        break;
                    }
                }
                min = Math.min(min, indexMin);
            }
            res[i] = min == 30001? 0 :min - i;
        }
        return res;
    }

    public int[] dailyTemperatures1(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int temp = T[i];//拿到现在的温度
            for (int j = i + 1; j < len; j++) {
                if (temp < T[j]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
