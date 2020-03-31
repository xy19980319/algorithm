package com.xiaoxiao.Zconvert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/11 - 21:58
 */
public class TestDemo {
    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf('a'));
        list.add(String.valueOf('b'));
        list.add(String.valueOf('c'));
        list.add(String.valueOf('d'));
        list.add(String.valueOf('e'));
        list.add(String.valueOf('f'));
        String s = String.join("", list);
        System.out.println(s);
    }

    @Test
    public void test02() {
        String str = "LEETCODEISHIRING";
        String st = "";
        String st1 = "ABC";
        String st2 = "ABCDE";
        Solution s= new Solution();
        String convert1 = s.convert(str, 3);
        System.out.println(convert1);
        String convert2 = s.convert(str, 4);
        System.out.println(convert2);
        String convert3 = s.convert(str, 5);
        System.out.println(convert3);
        String convert4 = s.convert(st, 1);
        System.out.println(convert4);
        String convert5= s.convert(st1, 2);
        System.out.println(convert5);
        String convert6= s.convert(st2, 2);
        System.out.println(convert6);
    }
}
