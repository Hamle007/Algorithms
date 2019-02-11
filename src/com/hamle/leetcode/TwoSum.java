package com.hamle.leetcode;

import java.util.Arrays;

/**
 * 给定一个目标值，确认数组内两个位置的值相加等于目标值的位置（不考虑有多种结果集的情况）
 * @author Hamle
 * @date 2019/1/22.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3, 4};
        String string = Arrays.toString(twoSum(arr, 0));
        System.out.println(string);
    }

    /**
     * 实现
     * @param nums 数组
     * @param target 目标值
     * @return 结果
     */
    private static int[] twoSum(int [] nums, int target) {
        int [] result = new int[2];
        for (int i = 0, j = nums.length; i < j; i++ ) {
            for (int k = (j -1); k != i; k--) {
                int num = nums[i] +  nums[k];
                if (num == target) {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return result;
    }

}
