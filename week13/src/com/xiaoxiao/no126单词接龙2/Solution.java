package com.xiaoxiao.no126单词接龙2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/6/7 - 20:46
 */
public class Solution {
    private List<List<String>> res = new ArrayList<>();
    private Integer resSize ;
    private String beginWord;
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        //wordList.sort(Comparator.comparingInt(o -> o.charAt(0)));
        resSize = beginWord.length()*2;
        wordList.sort((o1, o2) -> {
            char[] chars1 = o1.toCharArray();
            char[] chars2 = o2.toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if(chars1[i]!=chars2[i]) return chars1[i]-chars2[i];
            }
            return 0;
        });
        this.beginWord = beginWord;
        if(!wordList.contains(endWord)) return res;
        int[] isUsed = new int[wordList.size()];//标记是否使用过
        List<String> repository = new ArrayList<>();
        repository.add(beginWord);
        dfs(beginWord, endWord, isUsed, repository, wordList,0);
        return res;

    }


    private void dfs(String curr, String target, int[] isUsed, List<String> repository, List<String> wordList, int rem) {
        if(repository.size()>resSize) return;
        if (curr.equals(target)) {
            int size = repository.size();
            if(size<resSize) {
                resSize = size;
                res.clear();
                res.add(new ArrayList<>(repository));
            }else {
                res.add(new ArrayList<>(repository));
            }
            return;
        }
        for (int i = rem; i < wordList.size(); i++) {
            if (isUsed[i] == 1||wordList.get(i).equals(beginWord)) continue;
            String temp = wordList.get(i);
            if (canChange1(curr, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(temp, target, isUsed, repository, wordList, i);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }else break;
        }
        for (int i = rem-1; i >=0; i--) {
            if (isUsed[i] == 1||wordList.get(i).equals(beginWord)) continue;
            String temp = wordList.get(i);
            if (canChange1(curr, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(temp, target, isUsed, repository, wordList, i);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }else break;
        }

        /*for (int i = 0; i < wordList.size(); i++) {
            if (isUsed[i] == 1||wordList.get(i).equals(beginWord)) continue;
            String temp = wordList.get(i);
            if (canChange1(curr, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(temp, target, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }*//*else if(canChange1(target, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(curr, temp, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }*//*
        }*/


    }
    private void dfs1(String curr, String target, int[] isUsed, List<String> repository, List<String> wordList) {
        if(repository.size()>resSize) return;
        if (curr.equals(target)) {
            int size = repository.size();
            if(size<resSize) {
                resSize = size;
                res.clear();
                res.add(new ArrayList<>(repository));
            }else {
                res.add(new ArrayList<>(repository));
            }
            return;
        }
        for (int i = 0; i < wordList.size(); i++) {
            if (isUsed[i] == 1||wordList.get(i).equals(beginWord)) continue;
            String temp = wordList.get(i);
            if (canChange1(curr, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs1(temp, target, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }else if(canChange1(target, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs1(curr, temp, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }
        }


        /*for (int i = 0; i < wordList.size(); i++) {
            if (isUsed[i] == 1||wordList.get(i).equals(beginWord)) continue;
            String temp = wordList.get(i);
            if (canChange1(curr, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(temp, target, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }*//*else if(canChange1(target, temp)) {
                isUsed[i] = 1;
                repository.add(temp);
                dfs(curr, temp, isUsed, repository, wordList);
                isUsed[i] = 0;//剪枝
                repository.remove(temp);
            }*//*
        }*/


    }

    private boolean canChange1(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) diff++;
            if (diff > 1) return false;
        }
/*        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i]!=chars2[i]) diff++;
            if (diff > 1) return false;
        }*/
        return true;
    }
}
