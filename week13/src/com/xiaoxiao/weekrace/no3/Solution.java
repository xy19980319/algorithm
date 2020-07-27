package com.xiaoxiao.weekrace.no3;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 你有一个只有一个标签页的 浏览器 ，一开始你浏览的网页是 homepage ，你可以访问其他的网站 url ，也可以在浏览历史中后退 steps 步或前进 steps 步。
 * <p>
 * 请你实现 BrowserHistory 类：
 * <p>
 * BrowserHistory(string homepage) ，用 homepage 初始化浏览器类。
 * void visit(string url) 从当前页跳转到访问页面 url 。执行此操作会把浏览历史前进的记录全部删除。
 * string back(int steps) 在浏览历史中后退 steps 步。如果你只能在浏览历史中后退至多 x 步且 steps > x ，那么你只后退 x 步。请返回后退 至多 steps 步以后的 url 。
 * string forward(int steps) 在浏览历史中前进 steps 步。如果你只能在浏览历史中前进至多 x 步且 steps > x ，那么你只前进 x 步。请返回前进 至多 steps步以后的 url 。
 *
 * @author Xiaoyu
 * @date 2020/6/7 - 10:27
 */
public class Solution {
    public static void main(String[] args) {
        String homepage = "leetcode.com";
        BrowserHistory obj = new BrowserHistory(homepage);
        String[] url = {"google.com","facebook.com","youtube.com"};
        for (String s : url) {
            obj.visit(s);
        }
       // String param_2 = obj.back(steps);
        //String param_3 = obj.forward(steps);
    }
}
class BrowserHistory {

    public String homepage;
    public int curr;
    ArrayList<String> pages ;//存放网页

    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        pages = new ArrayList<>();
        this.curr = -1;
    }

    public void visit(String url) {


        while(pages.size()>curr+1) {
            pages.remove(pages.size()-1);
        }
        pages.add(url);
        curr = pages.size() - 1;

    }

    public String back(int steps) {

        this.curr -= steps;
        if (curr < 0) curr = -1;
//        System.out.println(pages);
        return curr == -1?homepage :pages.get(curr);
    }

    public String forward(int steps) {
        this.curr += steps;
        if (curr > pages.size() - 1) this.curr = pages.size() - 1;
        System.out.println(pages);
        System.out.println(curr);
        return pages.get(curr);
    }
}
