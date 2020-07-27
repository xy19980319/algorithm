package com.xiaoxiao.weekrace.no3;

import java.util.ArrayList;
import java.util.List;

/**
 * 5414. 收藏清单  显示英文描述
 * 给你一个数组 favoriteCompanies ，其中 favoriteCompanies[i] 是第 i 名用户收藏的公司清单（下标从 0 开始）。
 * <p>
 * 请找出不是其他任何人收藏的公司清单的子集的收藏清单，并返回该清单下标。下标需要按升序排列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
 * 输出：[0,1,4]
 * 解释：
 * favoriteCompanies[2]=["google","facebook"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集。
 * favoriteCompanies[3]=["google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 和 favoriteCompanies[1]=["google","microsoft"] 的子集。
 * 其余的收藏清单均不是其他任何人收藏的公司清单的子集，因此，答案为 [0,1,4] 。
 *
 * @author Xiaoyu
 * @date 2020/5/17 - 10:31
 */
public class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        boolean[] isused = new boolean[favoriteCompanies.size()];
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            for (int j = 0; j < favoriteCompanies.size(); j++) {
                if (j == i || isused[j]) continue;
                if (favoriteCompanies.get(j).size()>favoriteCompanies.get(i).size()&&favoriteCompanies.get(j).containsAll(favoriteCompanies.get(i))) {
                    temp.add(i);
                    isused[i] = true;
                    break;
                }
                if (favoriteCompanies.get(i).size()>favoriteCompanies.get(j).size()&&favoriteCompanies.get(i).containsAll(favoriteCompanies.get(j))) {
                    temp.add(j);
                    isused[j]=true;
                }

            }
        }
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            if (!temp.contains(i))
                res.add(i);
        }
        return res;
    }
}
