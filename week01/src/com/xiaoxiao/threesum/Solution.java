package com.xiaoxiao.threesum;

import java.sql.SQLOutput;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/15 - 23:55
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //定义双指针
        List<List<Integer>> allLists = new ArrayList<>();
        int first = 0;
        int last = 0;
        for (int v = 0; v < nums.length; v++) {
            if(nums[v] >0) {
                break;
            }
            if(v>=1&&nums[v-1]==nums[v]) {
                continue;
            }

            first = v+1;
            last = nums.length -1;
            while(first < last) {

                if(-nums[v]==nums[first]+nums[last]) {
                    if(first>1&&last<nums.length-1&&nums[first]==nums[first-1]&&nums[last]==nums[last+1]) {
                        first++;
                        last--;
                        continue;
                    }
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[v]);
                    list.add(nums[first]);
                    list.add(nums[last]);
                    allLists.add(list);
                    first++;
                    last--;

                }else if (-nums[v]>nums[first]+nums[last]) {
                    first++;
                }else {
                    last--;
                }
            }
        }
        System.out.println(allLists);
        return allLists;

    }
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        //定义双指针
        List<List<Integer>> allLists = new ArrayList<>();
        int first = 0;
        int last = nums.length - 1;
        if (nums[first] > 0 || nums[last] < 0) {
            return null;
        }
        int need = 0;
        int temp = 0;
        while (first < nums.length - 1 && last > 0) {
            need = -(nums[first] + nums[last]);
            if (need > 0) {
                temp = last;
                //if(nums[temp]==nums[last])
                while (temp > first && nums[temp] >= need) {
                    if (nums[temp] == need) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[temp]);
                        list.add(nums[last]);
                        allLists.add(list);
                        break;
                    }
                    temp--;

                }

                first++;
            } /*else if (need == 0) {
                //找有没有0
                temp = first + 1;
                while(temp<last) {
                    if(nums[temp]==0) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[temp]);
                        list.add(nums[last]);
                        allLists.add(list);
                    }
                    temp++;
                }
                last--;


            }*/ else {

                temp = first;
                while (temp < last && nums[temp] <= need) {
                    if (nums[temp] == need) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[temp]);
                        list.add(nums[last]);
                        allLists.add(list);
                        break;

                    }
                    temp++;

                }

                last--;
            }

        }
        System.out.println(allLists);
        return allLists;
    }
}