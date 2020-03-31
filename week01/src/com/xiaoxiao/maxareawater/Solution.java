package com.xiaoxiao.maxareawater;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 *
 *
 * 使用双指针,很明显,面积是由两条边中的短边决定的,如果左边短边,左移,右边短边,右移
 * @author Xiaoyu
 * @date 2020/3/14 - 22:17
 */
public class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length -1;
        int maxA = 0;
        while (first < last) {
            if (height[first]<height[last]) {
                maxA = height[first]*(last-first)>maxA ?height[first]*(last-first):maxA;
                first ++;
            }else {
                maxA = height[last]*(last-first)>maxA ?height[last]*(last-first):maxA;
                last--;
            }
        }
        return maxA;
    }
}
