package com.hamle.chapter.first.section.second;

/**
 * &#x8ba1;&#x6570;&#x5668;
 * @author Hamle
 * @date 2019/4/1?l
 */
public class Counter {

    /** 计数器的值 */
    private int value = 0;
    /** 统计计数器的增加次数 */
    private int count = 0;
    /** 名字 */
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return "name:" + name + "count:" + count + " " + "value:" + value;
    }
}
