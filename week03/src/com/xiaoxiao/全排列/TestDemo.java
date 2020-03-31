package com.xiaoxiao.全排列;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/23 - 18:58
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> permute = s.permute(nums);
        System.out.println(permute.size());
        System.out.println(permute);
    }
}
