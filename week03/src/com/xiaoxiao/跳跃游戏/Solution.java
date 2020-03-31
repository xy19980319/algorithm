package com.xiaoxiao.跳跃游戏;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 示例 1:
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 *
 * @author Xiaoyu
 * @date 2020/3/25 - 17:56
 */
public class Solution {
    public boolean canJump(int[] nums) {
        //1.从后往前遍历,找到最近的一个0;
        if (nums.length == 0) return true;
        if (nums[0]==0&&nums.length>1) return false;
        //遍历找0
        int curr = nums.length - 2;
        while (curr > 0) {
            //2.从这个零开始往前遍历,看看这个0是否能被到达
            if (nums[curr] == 0) {
                int preCurr = curr - 1;//设置前置指针
                boolean isOver = false;
                //如果指针值小于0则退出循环
                while (preCurr >= 0 ) {
                    if (preCurr + nums[preCurr] > curr)  break;//说明可达
                    preCurr--;
                }
                if (preCurr==-1) return false;//遍历完还没找到
            }
            curr--;
        }
        //如果没找到0
        return true;

    }
}
