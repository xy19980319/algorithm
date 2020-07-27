package com.xiaoxiao.weekrace.no2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/10 - 17:19
 */
public class TestDemo {
    @Test
    public void test() {
        int i=1,j=1;
        int n =3;
        int res =0;
        while (n <= 10) {
            int temp = i+j;
            res = temp;
            i=j;
            j=temp;
            n++;
        }
        System.out.println(res);
    }
}
