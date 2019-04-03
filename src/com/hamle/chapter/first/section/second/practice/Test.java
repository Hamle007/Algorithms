package com.hamle.chapter.first.section.second.practice;

/**
 * @author Hamle
 * @date 2019/4/2.
 */
public class Test {

    /**
     * 判断字符串循环变位
     * @param s
     * @param t
     * @return
     */
    public boolean xuhHuan(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        return (s.length() == t.length()) && (s + s).indexOf(t) >= 0;
    }

    /**
     * 将一个字符串进行倒序
     * @param s
     * @return
     */
    public String mystery(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return mystery(b) + mystery(a);
    }


}
