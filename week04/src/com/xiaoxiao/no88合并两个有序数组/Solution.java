package com.xiaoxiao.no88合并两个有序数组;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
 * <p>
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 *
 * @author Xiaoyu
 * @date 2020/4/3 - 11:24
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int merge = m + n - 1;//合并指针
        int curr1 = m - 1;//第一个指向数组末尾的指针
        int curr2 = n - 1;//第二个数组指向末尾

        while (curr1 >= 0 && curr2 >= 0) {
            if (nums2[curr2] >= nums1[curr1]) {
                nums1[merge] = nums2[curr2];
                curr2--;
            }else {
                nums1[merge] = nums1[curr1];
                curr1--;
            }
            merge--;
        }
        //如果遍历完还有剩余
        if(curr2>=0) {
            for (int i = curr2; i >=0; i--) {
                nums1[i] = nums2[i];
            }
        }
    }
}
