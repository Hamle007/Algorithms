package com.hamle.base;

import java.util.logging.Logger;

/**
 * 问题：最大公约数
 * @author Hamle
 * @date 2019/2/20.
 */
public class MaxGCD {

    /**
     * 日志打印
     */
    private static Logger LOG = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        LOG.info("2和6的最大公约数为：" + solution(2, 6));
    }

    /**
     * 实现一：欧几里得算法
     * @param a
     * @param b
     */
    public static int solution(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        return solution(b, r);
    }
}
