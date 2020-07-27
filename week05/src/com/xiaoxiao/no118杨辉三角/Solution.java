package com.xiaoxiao.no118杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @author Xiaoyu
 * @date 2020/4/9 - 10:13
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        if(numRows ==0) return lists;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();//存放数字
            //每行都有i个数字
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i) list.add(1);
                else list.add((lists.get(i-1-1).get(j-1-1))+(lists.get(i-1-1).get(j-1))); //加入改位置的左上角和右上角元素和

            }
            lists.add(list);//将每排数字加入
        }
        return lists;
    }
}
