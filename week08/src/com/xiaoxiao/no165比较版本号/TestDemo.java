package com.xiaoxiao.no165比较版本号;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 11:38
 */
public class TestDemo {
    @Test
    public void test() {
        String version1 = "000007.05.02.004", version2 = "07.05.2.4";
        Solution s= new Solution();
        int i = s.compareVersion(version1, version2);
        System.out.println(i);
    }
}
