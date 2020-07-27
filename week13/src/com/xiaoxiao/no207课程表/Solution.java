package com.xiaoxiao.no207课程表;

import java.util.LinkedList;
import java.util.Queue;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
 * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]
 * 给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/course-schedule
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/6 - 21:56
 */
public class Solution {
    /**
     * 广度优先遍历
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        /**
         * 检测图中的环,拓扑排序的广度优先遍历
         */
        if (prerequisites == null || prerequisites.length == 0) return true;
        List<List<Integer>> adj = new ArrayList<>();//定义邻接表,保存w<-v的路径
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegrees = new int[numCourses];//入度
        for (int[] pre2targ : prerequisites) {
            indegrees[pre2targ[0]]++;//入度+1
            adj.get(pre2targ[1]).add(pre2targ[0]);//加入先决条件
        }
        //将所有入度为0加入队列
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) queue.add(i);
        }
        //将入度为0的点清除
        while (!queue.isEmpty()) {
            numCourses--;//节点数-1
            int poll = queue.poll();
            for (Integer other : adj.get(poll)) {
                if (--indegrees[other] == 0) queue.add(other);
            }
        }
        return numCourses == 0;

    }

    /**
     * 深度优先遍历
     */
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        /**
         * 检测图中的环,考虑使用深度遍历
         */
        if (prerequisites == null || prerequisites.length == 0) return true;
        List<Integer>[] adj = new ArrayList[numCourses];//定义邻接表,保存w->v的路径
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        //将前提输入到邻接表中,提供的数组都是2->1
        for (int[] pre2targ : prerequisites) {
            adj[pre2targ[1]].add(pre2targ[0]);
        }
        int[] isVisited = new int[numCourses];//设置是否已经访问
        for (int i = 0; i < adj.length; i++) {
            if (hashCirle(adj, isVisited, i)) return false;
        }
        return true;
    }

    private boolean hashCirle(List<Integer>[] adj, int[] isVisited, int i) {
        if (isVisited[i] == 1) return true;//当前结点已经访问过
        if (isVisited[i] == -1) return false;//其他结点访问过
        isVisited[i] = 1;
        for (Integer to : adj[i]) {
            if (hashCirle(adj, isVisited, to)) return true;
        }
        isVisited[i] = -1;
        return false;
    }
}
