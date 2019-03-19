package com.hamle.chapterfirst.sectionfirst.practice;

import java.util.Arrays;

/**
 * @author Hamle
 * @date 2019/3/16.
 */
public class OneTest {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 0, 0};
        int[] b = histogram(a, 5);
        System.out.println(Arrays.toString(b));
    }

    /**
     * 打印值
     * @param obj 目标
     */
    public static void print(Object obj) {
        System.out.println(String.valueOf(obj));
    }

    /**
     * 获取参数类型
     * @param obj 目标
     */
    public static void getType(Object obj) {
        System.out.println(obj.getClass() + "值" + String.valueOf(obj));
    }

    /**
     * 判断相等
     * @param a
     * @param b
     * @param c
     */
    public static void judgeEqual(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    /**
     * 严格位于0和1之间浮点数
     * @param b
     */
    public static void judgeDouble(double b) {
        if (b > 0.0 && b < 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * 猜猜会打印什么
     */
    public static void getWhat(int n) {
        int f = 0, g = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

    }

    /**
     * 二进制展示
     * @param N
     */
    public static void binaryShow(int N) {
        String s = "";
        for (int n = N; n > 0;n /= Constants.TWO_I) {
            s = n % 2 + s;
        }
        System.out.println(s);
    }

    /**
     * 打印二维数组
     * @param a
     */
    public static void twoArrayPrint(String[][] a) {
        System.out.print("行\\列 ");
        for (int i = 0; i < a[1].length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        boolean temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < a[i].length; j++) {
                temp = "*".equals(a[i][j]) ? true : false;
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }

    /**
     * 打印结果
     */
    public static void result() {
        int[] a = new int[10];
        for (int i = 0; i < Constants.TEN_I; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < Constants.TEN_I; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < Constants.TEN_I; i++) {
            System.out.println(i);
        }
    }

    /**
     * 转置
     */
    public static void transpose(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(b[i][j]);
            }
        }
    }

    /**
     * 返回以2为底n的对数的最大值
     * @param n
     */
    public static int lg(int n) {
        if (n == 1) {
            return 0;
        } else if (n > 1) {
            int bottom = 1;
            int two = 2;
            for (int i = 1; ; i++) {
                bottom = bottom * two;
                if (bottom > n) {
                    return i - 1;
                }
            }
        } else {
            double bottom = 1.0;
            double two = 0.5;
            for (int i = 1; ; i++) {
                bottom = bottom * two;
                if (bottom < n) {
                    return -(i - 1);
                }
            }
        }
    }

    /**
     * 返回一个长度为m的数组
     * 其中的第i个位置的值为整数i在a数组中出现的次数
     * @param a
     * @param m
     * @return
     */
    public static int[] histogram(int[] a, int m) {
        int[] b = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    count++;
                }
            }
            b[i] = count;
            count = 0;
        }
        return b;
    }


}
