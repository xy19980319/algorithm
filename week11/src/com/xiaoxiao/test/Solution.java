package com.xiaoxiao.test;
import java.util.ArrayList;
import java.util.Comparator;
import	java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/5/29 - 16:18
 */
public class Solution {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,100.0);
        Student student2 = new Student("lisi",13,56.0);
        Student student3 = new Student("wangwu",55,100.0);
        Student student4 = new Student("zhaoliu",14,90.0);
        Student student5 = new Student("zhouqi",14,11.0);
        Student student6 = new Student("wangba",23,34.42);
        Student student7 = new Student("sb",15,85.0);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(students);
    }
}
