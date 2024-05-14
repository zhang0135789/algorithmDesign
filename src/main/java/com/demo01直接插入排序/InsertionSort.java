package com.demo01直接插入排序;

import java.util.Arrays;

/**
 * @Author: zz
 * @Description:
 * @Date: 17:26 2024/05/12 0012
 * @Modified By
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 6, 5, 8, 7, 9};
        System.out.println("排序前" + Arrays.toString(nums));
        InsertionSort.insertionSort(nums);
        System.out.println("排序后"+Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        // 首选记录数组的长度
        int len = nums.length;
        // 从数组的第二个元素开始
        for (int i = 1; i< len; i++) {
            // 依次取出一个元素，存储在current变量中
            Integer current = nums[i];
            // 定义一个指针，初始化当前元素的前一个位置
            int j = i - 1;
            // 重复上述操作，直到找到一个位置j，使得 nums[j] <= current，或者 j 已经到达数组的起始位置。
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }


}
