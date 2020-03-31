package com.xiaoxiao.reverse;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/11 - 23:34
 */
public class TestDemo {
    @Test
    public void test01() {
        int x1 = 123;
        int x2= -123;
        int x3 = 1230;
        int reverse = Integer.reverse(x1);
        System.out.println(reverse);
        String s = Integer.toString(x2);
        char[] chars = s.toCharArray();
        for (char a : chars) {
            System.out.println(a);
        }
        System.out.println(s);
        System.out.println("-------------------");
        String s1 = "123";
        String s2= "-123";
        String s3 = "0321";
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int v3 = Integer.parseInt(s3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);


    }
    @Test
    public void test02(){
        Solution s = new Solution();
        int reverse = s.reverse1(-1231111000);
        System.out.println(reverse);
    }
}
