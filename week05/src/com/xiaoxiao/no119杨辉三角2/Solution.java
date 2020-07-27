package com.xiaoxiao.no119杨辉三角2;

import java.util.ArrayList;
import java.util.List;

/**给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * @author Xiaoyu
 * @date 2020/4/9 - 10:13
 */
public class Solution {
        List<Integer> res = new ArrayList<>();
        public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>(rowIndex + 1);
            long cur = 1;
            for(int i = 0; i <= rowIndex / 2; i++) {
                result.add((int)cur);
                cur = cur * (rowIndex - i) / (i+1);
            }
            int j = (rowIndex & 1) == 0 ? 2 : 1;
            for(int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
                result.add(result.get(i - j));
                j += 2;
            }
            return result;
        }
}
