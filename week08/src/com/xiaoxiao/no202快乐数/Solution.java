package com.xiaoxiao.no202快乐数;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 20:09
 */
public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        int c = 0;
        while (n != 1) {
            int tmp = 0;
            int left = 0;
            while (n > 0) {
                left = n % 10;
                tmp += left * left;
                n = n / 10;
            }
            n = tmp;
            c++;
            if (c > 10)
                break;
        }
        if (c <= 10)
            return true;
        return false;
    }
    public boolean isHappy2(int n) {
        if(n<=0) return false;
        if(n==1) return  true;
        int c = 0;//记录循环次数,设置十次循环就越界
        while (n != 1) {
            int tmp = 0;
            int left = 0;
            while (n > 0) {
                left = n % 10;
                tmp += left * left;
                n = n / 10;
            }
            n = tmp;
            c++;
            if (c > 10)
                break;
        }
        if (c <= 10)
            return true;
        return false;
    }
}
