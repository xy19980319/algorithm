package com.xiaoxiao.canMeasureWater;

/**
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 * 你允许：
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 * 示例 1: (From the famous "Die Hard" example)
 * 输入: x = 3, y = 5, z = 4
 * 输出: True
 * 示例 2:
 * 输入: x = 2, y = 6, z = 5
 * 输出: False
 *
 * @author Xiaoyu
 * @date 2020/3/21 - 9:30
 */
public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        if (x == z || y == z || x + y == z||z ==0) return true;
        if (x == y) return false;
        //设计两个不同的桶,将较小的桶当做交换桶
        int largeSize = Math.max(x, y);
        int smallSize = Math.min(x, y);
        int large = 0;
        int small = 0;
        int diff = 0;

        //如果小桶的大桶水量=小桶,说明要进入循环了,如果还没找到,那说明没有机会找到了
        while (large != smallSize) {
            //将小桶水倒出,大桶水导入小桶
            small = Math.min(large, smallSize);
            //首先给大桶满水
            if(large <smallSize) {
                large = largeSize;
            }
            //大桶倒入小桶
            diff = smallSize - small==0?smallSize:smallSize-small;
            //small = smallSize;
            //大桶剩下水
            large -= diff;
            //判断是否得到结果
            if (large == z || large + smallSize == z) {
                return true;
            }


        }
        //没找到,变成环,直接输出false
        return false;

    }
}
