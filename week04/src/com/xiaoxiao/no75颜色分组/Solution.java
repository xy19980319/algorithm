package com.xiaoxiao.no75颜色分组;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * 示例:
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 进阶：
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 *
 * @author Xiaoyu
 * @date 2020/4/1 - 11:15
 */
public class Solution {
    public void sortColors(int[] nums) {
        //定义一个头指针,一个尾指针,和一个扫描指针,遇到0就放到前面,遇到2就放到后面
        int first = 0;
        int last = nums.length - 1;
        int curr = 0;

        //开始扫描
        while (curr <= last) {
            //如果为0,插在表头
            if (nums[curr] == 0) {
                exch(nums, curr, first);
                first++;
                curr++;
            } else if(nums[curr] == 2) {
                exch(nums, curr, last);
                last--;
            }else {
                curr++;
            }


        }
    }

    private void exch(int[] nums, int curr, int first) {
        int temp = nums[first];
        nums[first] = nums[curr];
        nums[curr] = temp;
    }
}
