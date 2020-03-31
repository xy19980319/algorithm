package com.xiaoxiao.单词的压缩编码;

import java.util.Arrays;
import java.util.Comparator;

/**给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 示例：
 输入: words = ["time", "me", "bell"]
 输出: 10
 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
 * @author Xiaoyu
 * @date 2020/3/28 - 11:05
 */
public class Solution {
    public int minimumLengthEncoding(String[] words) {
        //首先对字符串数组按照数组的长度进行降序排列
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        //将字符串数组放入数组中
        StringBuilder sb = new StringBuilder();
        //对字符串进行遍历
        for (int i = 0; i < words.length; i++) {
            //如果新字符串不包含老字符串,将字符串加入字符中,加上一个#号
            if(sb.indexOf(words[i])<0) {
                sb.append(words[i]).append("#");
            }
        }
        return sb.length();
    }
}
