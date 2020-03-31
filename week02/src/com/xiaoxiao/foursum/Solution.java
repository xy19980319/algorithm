package com.xiaoxiao.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/17 - 20:54
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return lists;
        }
        Arrays.sort(nums);
        int lastcount = nums.length -1;
        while(lastcount>=3) {
            int first = 0;
            int last = lastcount;
            while (first < nums.length - 2) {
                int subfirst = first + 1;
                int sublast = last - 1;

                while (subfirst < sublast) {

                    if (nums[first] + nums[last] + nums[subfirst] + nums[sublast] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[subfirst]);
                        list.add(nums[sublast]);
                        list.add(nums[last]);
                        lists.add(list);
                        subfirst++;
                        while (subfirst < sublast && nums[subfirst] == nums[subfirst - 1]) {
                            subfirst++;
                        }
                    } else if (nums[first] + nums[last] + nums[subfirst] + nums[sublast] < target) {
                        subfirst++;
                    } else {
                        sublast--;
                    }
                }

                first++;
                while (first < nums.length - 1 && nums[first - 1] == nums[first]) {
                    first++;
                }
          /*  if(last>0&&first<nums.length-1) {
                if (nums[first]==nums[first+1]) {
                    first++;
                }
                if (nums[last]==nums[last-1]) {
                    last--;
                }*/
                /*if (last>0&&first<nums.length-1&&nums[first]+nums[last]>target) {
                    last --;
                    while (last>0&&nums[last+1]==nums[last]) {
                        last--;
                    }
                }*/

               /* else {
                    first ++;
                    while (first<nums.length-1&&nums[first-1]==nums[first]) {
                        first++;
                    }
                }*/
           /* }else {
                break;
            }*/

            }
            lastcount --;
            while(lastcount>=3&&nums[lastcount]==nums[lastcount+1]) {
                lastcount--;
            }
        }



        return lists;
    }
}
