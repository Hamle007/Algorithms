package com.hamle.chapterfirst.sectionfirst.practice;

/**
 * @author Hamle
 * @date 2019/3/16.
 */
public class OneTest {

    public static void main(String[] args) {
        /*
        print((0 + 15) / 2);
        print(2.0 * Math.E  - 6 * 100000000.1);
        print(true && false || true && true);

        getType((1 + 2.236) / 2);
        getType(1 + 2 + 3 + 4.0);
        getType(4.1 >= 4);
        getType(1 + 2 + "3");

        problem(1, 2, 3);
        */
        System.out.println(1.0 - 0);
    }

    /**
     * 打印值
     * @param obj
     */
    public static void print(Object obj) {
        System.out.println(String.valueOf(obj));
    }

    /**
     * 获取参数类型
     * @param obj
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
     * 有问题的代码
     * @param a
     * @param b
     * @param c
     */
    public static void problem(int a, int b, int c) {
        /*
        if (a > b) {
            then c = 0;
        }
        if a > b {
            c = 0;
        }
        if (a > b) c = 0;
        if (a > b) c = 0
        else b = 0;
        */
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
}
