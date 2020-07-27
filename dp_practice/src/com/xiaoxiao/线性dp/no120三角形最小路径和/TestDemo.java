package com.xiaoxiao.线性dp.no120三角形最小路径和;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/5/4 - 22:40
 */
public class TestDemo {
    @Test
    public void test() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> triangle = new ArrayList<> ();
        Collections.addAll(triangle,list1,list2,list3,list4);
        Solution s= new Solution();
        int i = s.minimumTotal(triangle);
        System.out.println(i);
    }
}
