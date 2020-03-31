package com.xiaoxiao.getLeastNumbers;

import java.util.Arrays;

/**输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 示例 1：
 输入：arr = [3,2,1], k = 2
 输出：[1,2] 或者 [2,1]
 示例 2：
 输入：arr = [0,1,2,1], k = 1
 输出：[0]
 限制：
 0 <= k <= arr.length <= 10000
 0 <= arr[i] <= 10000
 * @author Xiaoyu
 * @date 2020/3/20 - 18:13
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length ==0||k ==0) {
            return new int[] {

            };
        }
        Arrays.sort(arr);
        return Arrays.copyOf(arr,k);
        /*int[] mins = Arrays.copyOf(arr, k);
        Arrays.sort(mins);
        for (int i = k; i < arr.length; i++) {
            if(arr[i]<mins[k-1]) {
                mins[k-1] = arr[i];
                Arrays.sort(mins);
            }
        }
        return mins;*/
    }
}
