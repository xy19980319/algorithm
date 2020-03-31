package com.xiaoxiao.letterCombinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例:
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * @author Xiaoyu
 * @date 2020/3/16 - 22:25
 */
public class Solution {
    public final static String[][] table;
    //List<String> combinations = new ArrayList<>();
    List<String> combinations = new LinkedList<>();
    LinkedList<String> queue = new LinkedList<>();

    static {
        String[] characterT = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int countC = 0;
        table = new String[10][];
        for (int i = 2; i < table.length; i++) {
            if (i == 7 || i == 9) {
                table[i] = new String[4];
            } else {
                table[i] = new String[3];
            }

            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = characterT[countC++];
            }
        }

    }

    public List<String> letterCombinations1(String digits) {
        //很显然,嵌套循环次数未知,考虑使用递归解决
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        for (int i = 0; i < digits.length(); i++) {
            for (int j = 0; j < table[digits.charAt(i) - '0'].length; j++) {

            }
        }
        char c = digits.charAt(0);
        int index = c - '0';
        for (int i = 0; i < table[index].length; i++) {
            queue.addLast(table[index][i]);
        }
        combinations.addAll(queue);
        return combinations;
    }



    public List<String> letterCombinations(String digits) {
        //很显然,嵌套循环次数未知,考虑使用递归解决
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        stringFind(digits, "", 0);

        return combinations;
    }

    private void stringFind(String digits, String s, int index) {
        //用索引记录迭代次数
        if (index == digits.length()) {
            combinations.add(s);
            return;
        }
        //拿到本次迭代的索引值
        int num = digits.charAt(index) - '0';
        //开始搜索
        for (int i = 0; i < table[num].length; i++) {
            stringFind(digits, s + table[num][i], index + 1);
        }
    }
}
