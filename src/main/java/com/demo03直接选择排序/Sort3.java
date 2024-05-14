package com.demo03直接选择排序;

import com.demo02希尔排序.ShellSort;

import java.util.Arrays;

/**
 * @Author: zz
 * @Description: 直接排序法
 * @Date: 22:17 2024/05/14 0014
 * @Modified By
 */
public class Sort3 {


    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 2, 6, 5, 8, 7, 9};
        System.out.println("排序前" + Arrays.toString(nums));
        Sort3.SelectionSort(nums);
        System.out.println("排序后"+Arrays.toString(nums));
    }
    public static void SelectionSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length-1 ; i++) {
            //从当然开始筛选
            int minIndex = i;

            for (int j = i+1; j <  length; j++) {
                if(arr[minIndex] >arr[j]){
                    minIndex = j;
                }
            }
            //交换数值
            int current = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = current;
        }
    }
}
