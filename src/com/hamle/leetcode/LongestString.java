package com.hamle.leetcode;

/**
 * 截取给定字符转中最长不重复的子串
 * @author Hamle
 * @date 2019/2/11.
 */
public class LongestString {

    public static void main(String[] args) {
        LongestString test = new LongestString();
        System.out.println(String.valueOf(test.lengthOfLongestSubstring("jlygy")));
    }

    /**
     * 实现
     * @param s 目标字符串
     * @return 返回结果
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        boolean falg = false;
        String temp = null;
        int maxLength = 0;
        String maxString = null;
        for (int i = 0, j = chars.length, k = 1, z = 0; k < j;) {
            if(chars[i] == chars[k]) {
                temp = s.substring(i, k);
                int tempLength = temp.length();
                if (tempLength > maxLength) {
                    maxString = temp;
                    maxLength = tempLength;
                }
                i++;
                k = i + 1;
            } else {
                z = i;
                while ((z + 1) != k) {
                    if (chars[z + 1] == chars[k]) {
                        temp = s.substring(i, k);
                        int tempLength = temp.length();
                        if (tempLength > maxLength) {
                            maxString = temp;
                            maxLength = tempLength;
                        }
                        i++;
                        k = i + 1;
                        falg = true;
                        break;
                    } else {
                        z++;
                    }

                }
                if (falg) {
                    falg = false;
                } else {
                    if ((k + 1) == j) {
                        temp = s.substring(i, j);
                        int tempLength = temp.length();
                        if (tempLength > maxLength) {
                            maxString = temp;
                            maxLength = tempLength;
                        }
                        break;
                    } else {
                        k++;
                    }
                }
            }
        }
        if (maxLength == 0) {
            maxString = s;
            System.out.println(maxString);
            return s.length();
        }
        System.out.println(maxString);
        return maxLength;
    }

}
