package com.xiaoxiao.atoifunction;
import	java.util.regex.Pattern;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Xiaoyu
 * @date 2020/3/12 - 18:45
 */
public class TestDemo {
    @Test
    public void test01() {
        String str = "  +123456word";
        String regex ="(\\+-)?[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        matcher.find();
        String group = matcher.group();
        System.out.println(group);
        String str1 = "123www-123456word,,";
        boolean matches = str1.matches("[\\+\\d-]?[^\\+-]*");
        System.out.println(matches);


    }
    @Test
    public void test02() {
        String str = "  -123456word,,";
        Solution s = new Solution();
        int v = s.myAtoi(str);
        System.out.println(v);
        System.out.println("------------");
        String str1 = "wwww-123456word,,";
        int v1 = s.myAtoi(str1);
        System.out.println(v1);
        System.out.println("------------");
        String str2 = "123www-123456word,,";
        int v2 = s.myAtoi(str2);
        System.out.println(v2);
        System.out.println("------------");
        String str3 = "  +b12102370352";
        int v3 = s.myAtoi(str3);
        System.out.println(v3);
        System.out.println("------------");
        String str4 = "+   524";
        int v4 = s.myAtoi(str4);
        System.out.println(v4);
        System.out.println("------------");
        String str5 = "--2";
        int v5 = s.myAtoi(str5);
        System.out.println(v5);

    }
}
