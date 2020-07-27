package com.xiaoxiao.no990等式方程的可满足性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/6/8 - 9:48
 */
public class Solution {
    public boolean equationsPossible(String[] equations) {
        Arrays.sort(equations, (o1, o2) -> o2.charAt(1) - o1.charAt(1));//按照第二个字符降序,就是==在前
        int len = equations.length;
        int[] hash = new int[26];
        int no = 1;//分组编号
        for (String eq : equations) {
            int a = eq.charAt(0)-'a';
            int b = eq.charAt(3)-'a';
            //如果相等,就放到一个组
            if(eq.charAt(1)=='=') {
                if(hash[a] ==0 &&hash[b]==0) {
                    hash[a] = no;
                    hash[b] = no;
                    no++;
                }else {
                    //其中有一个没有分组
                    if(hash[a] ==0 ||hash[b] ==0) {
                        int cNo = hash[a] ==0? hash[b]: hash[a]; //拿到分组了的组号
                        hash[a] = cNo;
                        hash[b] = cNo;
                    }else {
                        //两个有已经有分组,那么就吧两个分组合并
                        int tNo = hash[a]; //分组号
                        int preNo = hash[b];//需要改分组的
                        for (int i = 0; i < hash.length; i++) {
                            if(hash[i] == preNo) hash[i] = tNo;
                        }
                    }
                }
            }else {
                if(a==b) return false;//这是不成立的 比如1!=1
                //1.两个数都没有分组,或者其中一个没有分组,都是可以的
                if(hash[a] ==0||hash[b]==0) continue;
                //如果不相等,查值是不是在一个分组,如果在一个分组,那就是不成立(因为事先已经排序,先看==再看!=
                if(hash[a] ==hash[b]) return false;
            }
        }
        return true;
    }
}
