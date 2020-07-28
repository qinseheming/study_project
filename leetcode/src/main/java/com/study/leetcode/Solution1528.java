package com.study.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution1528 {

    // TODO 做错了
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        int index = 0;
        for (char item : s.toCharArray()) {
            map.put(index, item);
            index++;
        }
        StringBuilder builder = new StringBuilder();
        for (int value : indices) {
            builder.append(map.get(value));
        }
        return builder.toString();
    }
}
