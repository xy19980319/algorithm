package com.xiaoxiao.weekrace.no2;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 矩形蛋糕的高度为 h 且宽度为 w，给你两个整数数组 horizontalCuts 和 verticalCuts，其中 horizontalCuts[i] 是从矩形蛋糕顶部到第  i 个水平切口的距离，类似地， verticalCuts[j] 是从矩形蛋糕的左侧到第 j 个竖直切口的距离。
 * 请你按数组 horizontalCuts 和 verticalCuts 中提供的水平和竖直位置切割后，请你找出 面积最大 的那份蛋糕，并返回其 面积 。由于答案可能是一个很大的数字，因此需要将结果对 10^9 + 7 取余后返回。
 *
 * @author Xiaoyu
 * @date 2020/5/31 - 10:29
 */
public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        final int MOD = 1000000007;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hLen = horizontalCuts.length;
        int vLen = verticalCuts.length;
        int maxH = Math.max(horizontalCuts[0],(h-horizontalCuts[hLen-1]));
        int maxW = Math.max(verticalCuts[0],(w-verticalCuts[vLen-1]));
        for (int i = 1; i < hLen; i++) {
            maxH = Math.max(maxH,(horizontalCuts[i]-horizontalCuts[i-1]));
        }
        for (int j = 1; j < vLen; j++) {
            maxW = Math.max(maxW,(verticalCuts[j]-verticalCuts[j-1]));
        }
        BigInteger bigH = BigInteger.valueOf(maxH);
        BigInteger bigW = BigInteger.valueOf(maxW);
        BigInteger multiply = bigH.multiply(bigW);
        BigInteger mod = multiply.mod(BigInteger.valueOf(MOD));
        int i = mod.intValue();
        return i;
    }
}
