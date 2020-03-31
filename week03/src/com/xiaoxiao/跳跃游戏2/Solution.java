package com.xiaoxiao.跳跃游戏2;

/**给定一个非负整数数组，你最初位于数组的第一个位置。

 数组中的每个元素代表你在该位置可以跳跃的最大长度。

 你的目标是使用最少的跳跃次数到达数组的最后一个位置。

 示例:
 输入: [2,3,1,1,4]
 输出: 2
 解释: 跳到最后一个位置的最小跳跃数是 2。
      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 说明:
 假设你总是可以到达数组的最后一个位置。

 * @author Xiaoyu
 * @date 2020/3/23 - 18:33
 */
public class Solution {
    public int jump(int[] nums) {
        int times = 0;//跳跃次数
        int maxBound = 0;//边界值最大值
        int bound = 0;//边界值大小

        //遍历,列出所有跳跃的可能性,不包括结尾,到结尾就行了
        for (int i = 0; i < nums.length-1; i++) {
            maxBound = Math.max(maxBound,nums[i] + i);//在这个I处可以跳跃到的最远距离
            //如果i等于最大边界,那就将边界值改变  因为题目说明一定能到达最后一个位置
            if (i == bound) {
                bound = maxBound;
                times++;
            }
        }
        return times;
    }
}
