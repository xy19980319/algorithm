package com.xiaoxiao.no187周赛.no1;
import	java.util.ArrayList;

import java.util.List;

/**5400. 旅行终点站
 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。

 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。
 * @author Xiaoyu
 * @date 2020/5/3 - 10:26
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths == null || paths.size() ==0) return "";
        List<String> start = new ArrayList<> ();
        List<String> end = new ArrayList<> ();
        for (int i = 0; i < paths.size(); i++) {
            List<String> strings = paths.get(i);
            start.add(strings.get(0));
            end.add(strings.get(1));
        }
        end.removeAll(start);
        return end.get(0);
    }


}
