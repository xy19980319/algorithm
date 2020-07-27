package com.xiaoxiao.no210课程表;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 输入: 2, [[1,0]]
 * 输出: [0,1]
 * 解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
 *
 * @author Xiaoyu
 * @date 2020/6/8 - 11:32
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //大致思路,使用bfs,直到numsC = 0就可以输出.入口是找到所有入度为0的点进行bfs
        int[] res = new int[numCourses];//返回值
        if (prerequisites == null || prerequisites.length == 0) {
            for (int i = 0; i < res.length; i++) {
                res[i] = i;
            }
            return res;
        }
        int[] indegrees = new int[numCourses];//记录入度
        Queue<Integer> queue = new LinkedList<>();//创建队列用来bfs
        List<List<Integer>> adj = new ArrayList<>();//创建邻接表
        //初始化邻接表
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            indegrees[pre[0]]++;//入度+1
            adj.get(pre[1]).add(pre[0]);//将楚的边加入集合
        }
        //将入度为0的点加入到队列进行bfs
        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) queue.add(i);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            numCourses--;
            int poll = queue.poll();
            res[count++] = poll;
            //结点的to边
            for (Integer to : adj.get(poll)) {
                if (--indegrees[to] == 0) queue.add(to);//如果入度剪成0了,加入队列
            }
        }
        return numCourses ==0?res:new int[0];
    }
}
