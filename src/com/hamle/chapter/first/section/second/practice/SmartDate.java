package com.hamle.chapter.first.section.second.practice;

/**
 * 简单日期类
 * @author Hamle
 * @date 2019/4/3.
 */
public class SmartDate {
    private int year;
    private int month;
    private int day;

    public SmartDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        if (judgeYear() || judgeMonth() || judgeDay()) {
            throw new RuntimeException("日期格式不正确！");
        }
    }

    private boolean judgeYear() {
        if (year < 1) {
            return true;
        }
        return false;
    }

    private boolean judgeMonth() {
        if (month < 1 || month > Constants.TWELVE) {
            return true;
        }
        return false;
    }

    private boolean judgeDay() {
        if (month == Constants.TWO && day > Constants.TWENTY_NINE) {
            return false;
        }
        if (day < 1 || day > Constants.THIRTY_ONE) {
            return true;
        }
        return false;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String dayOfTheWeek() {
        return null;
    }
}
