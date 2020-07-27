package com.xiaoxiao.weekrace.no3;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Xiaoyu
 * @date 2020/6/7 - 12:30
 */
public class TestDemo {
    @Test
    public void test() {
        ArrayList<String> pages = new ArrayList<>() ;//存放网页
        pages.add("p0");
        pages.add("p1");
        pages.add("p2");
        pages.add("p3");
        pages.add("p4");
        pages.add("p5");
        int curr = 2;
        while(pages.size()>curr+1) {
            pages.remove(pages.size()-1);
        }
        System.out.println(pages);
    }
}
