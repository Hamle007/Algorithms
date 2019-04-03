package com.hamle.chapter.first.section.second;

/**
 * 累加器
 * 返回平均值
 * @author Hamle
 * @date 2019/4/2.
 */
public class Accumulator {

    /** 处理的数量 */
    private int count = 0;
    /** 处理的数量总和 */
    private double sum = 0.0;

    Accumulator() {

    }

    public void addDataVale(double a) {
        sum += a;
        count++;
    }

    public double mean() {
        return sum / count;
    }

    @Override
    public String toString() {
        return "sum:" + sum;
    }
}
