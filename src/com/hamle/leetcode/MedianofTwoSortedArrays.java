package com.hamle.leetcode;

import java.util.Arrays;

/**
 * 找出两个有序数组集合的中位数，时间复杂度为O(log(m + n))
 * @author Hamle
 * @date 2019/2/13.
 */
public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        MedianofTwoSortedArrays test = new MedianofTwoSortedArrays();
        int[] a = {1};
        int[] b = {3};
        test.findMedianSortedArraysTwo(a, b);
    }

    /**
     * 实现一
     * @param nums1 目标数组一
     * @param nums2 目标数组二
     * @return 结果
     */
    public double findMedianSortedArraysOne(int[] nums1, int[] nums2) {
        int tempLength = nums1.length + nums2.length;
        int[] temp = new int[tempLength];
        for (int i = 0, j = nums1.length; i < j; i++) {
            temp[i] = nums1[i];
        }
        for (int i = 0, j = nums2.length, k = nums1.length; i < j; i++, k++) {
            temp[k] = nums2[i];
        }
        Arrays.sort(temp);
        return getMedian(temp);
    }

    /**
     * 实现二
     * @param nums1 目标数组一
     * @param nums2 目标数组二
     * @return 结果
     */
    public double findMedianSortedArraysTwo(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] temp = new int[nums1Length + nums2Length];
        if (nums1Length == 0 && nums2Length == 0) {
            return 0;
        }
        if (nums1Length == 0 && nums2Length > 0) {
            temp = nums2;
        } else if (nums2Length == 0 && nums1Length > 0) {
            temp =nums1;
        } else {
            if (nums1[nums1Length - 1] <= nums2[0]) {
                for (int i = 0, j = nums1.length; i < j; i++) {
                    temp[i] = nums1[i];
                }
                for (int i = 0, j = nums2.length, k = nums1.length; i < j; i++, k++) {
                    temp[k] = nums2[i];
                }
            } else if (nums1[0] > nums2[nums2Length - 1]) {
                for (int i = 0, j = nums2.length; i < j; i++) {
                    temp[i] = nums2[i];
                }
                for (int i = 0, j = nums1.length, k = nums2.length; i < j; i++, k++) {
                    temp[k] = nums1[i];
                }
            } else {
                for (int i = 0, j = 0, k = 0; ; i++) {
                    if (j < nums1Length && k < nums2Length) {
                        if (nums1[j] > nums2[k]) {
                            temp[i] = nums2[k];
                            k++;
                        } else if (nums1[j] < nums2[k]) {
                            temp[i] = nums1[j];
                            j++;
                        } else {
                            temp[i++] = nums1[j];
                            temp[i] = nums2[k];
                            j++;
                            k++;
                        }
                    } else if (j == nums1Length && k == nums2Length) {
                        break;
                    } else if (j == nums1Length && k < nums2Length) {
                        temp[i] = nums2[k];
                        k++;
                    } else if (k == nums2Length && j < nums1Length) {
                        temp[i] = nums1[j];
                        j++;
                    }
                }
            }
        }
        return getMedian(temp);
    }

    /**
     * 从优化好的数组中返回中位数
     * @param temp 目标数组
     * @return 结果
     */
    private double getMedian(int[] temp) {
        int length = temp.length / 2;
        double result;
        if ((temp.length % 2) == 0) {
            result = ((double)temp[length] + (double)temp[length - 1]) / 2;
        } else {
            result = temp[length];
        }
        System.out.printf(result + "");
        return result;
    }
}
