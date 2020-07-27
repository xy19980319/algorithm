package com.xiaoxiao.weekrace.no3;

import java.util.ArrayList;
import java.util.List;

/**
 * 重新规划路线
 * n 座城市，从 0 到 n-1 编号，其间共有 n-1 条路线。因此，要想在两座不同城市之间旅行只有唯一一条路线可供选择（路线网形成一颗树）。去年，交通运输部决定重新规划路线，以改变交通拥堵的状况。
 * 路线用 connections 表示，其中 connections[i] = [a, b] 表示从城市 a 到 b 的一条有向路线。
 * 今年，城市 0 将会举办一场大型比赛，很多游客都想前往城市 0 。
 * 请你帮助重新规划路线方向，使每个城市都可以访问城市 0 。返回需要变更方向的最小路线数。
 * 题目数据 保证 每个城市在重新规划路线方向后都能到达城市 0 。
 *
 * @author Xiaoyu
 * @date 2020/5/31 - 10:30
 */
public class Solution {


    public int minReorder(int n, int[][] cs) {
        //List<List<Integer[]>> adj = new ArrayList<>();
        List<Integer[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] c : cs) {
            //得到每一个路劲,第一个就是起点,第二个是重点
            int from = c[0];
            int target = c[1];
            //保存每个路径,1代表正想,0代表反向
            Integer[] temp1 = new Integer[2];
            temp1[0] = target;//这个是目的地
            temp1[1] = 1;//表示正向还是反向
            adj[from].add(temp1);
            Integer[] temp2 = new Integer[2];
            temp2[0] = from;//这个是目的地
            temp2[1] = 0;//表示正向还是反向
            adj[target].add(temp2);

        }
        return dfs(adj, 0, -1);//从0开始,父节点是-1
    }

    private int dfs(List<Integer[]>[] adj, int curr, int father) {
        int res = 0;
        //拿到这个curr位置要去哪
        for (Integer[] to : adj[curr]) {
            Integer target = to[0];//去哪
            Integer way = to[1];//正向还是反向,0是反向
            if (target == father) continue;//如果目标地点是来的地方,直接忽略
            //统计所有反向
            res += dfs(adj, target, curr) + way;
        }

        return res;
    }
}
