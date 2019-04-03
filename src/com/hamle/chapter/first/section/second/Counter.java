package com.hamle.chapter.first.section.second;

/**
 * 计数器
 * @author Hamle
 * @date 2019/4/1?l
 */
public class Counter {

    /** 统计计数器的增加次数 */
    private int count = 0;
    /** 名字 */
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public void increase() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return "name:" + name + " " + "count:" + count + " ";
    }
}
