package com.xiaoxiao.no215数组中的第K个最大元素;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/6/8 - 23:15
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> repository = new ArrayList<>();
        repository.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int last = repository.get(repository.size() - 1);
            //如果还没存够K个数,那所有数都要放进去
            if (repository.size() < k) {
                if (nums[i] <= last) {
                    repository.add(nums[i]);

                } else {
                    for (int j = 0; j < repository.size(); j++) {
                        if (repository.get(j) <= nums[i]) {
                            repository.add(j, nums[i]);
                            break;
                        }
                    }
                }
            } else {
                if (nums[i] > last) {
                    for (int j = 0; j < repository.size(); j++) {
                        if (repository.get(j) <= nums[i]) {
                            repository.add(j, nums[i]);
                            repository.remove(repository.size() - 1);
                            break;
                        }
                    }
                }
            }

        }
        return repository.get(repository.size() - 1);
    }
}
