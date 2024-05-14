package com.demo02希尔排序;

import java.util.Arrays;

/**
 * @Author: zz
 * @Description:
 * @Date: 17:43 2024/05/12 0012
 * @Modified By
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 6, 5, 8, 7, 9};
        System.out.println("排序前" + Arrays.toString(nums));
        ShellSort.shellSort(nums);
        System.out.println("排序后"+Arrays.toString(nums));
    }


    public static void shellSort(int[] arr) {
        //交换的次数
        int num = 0;
        int n = arr.length;
        // 初始化增量gap为数组长度的一半
        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println("gap值" + gap);
            // 对于每个增量gap，进行一次插入排序
            for (int i = gap; i < n; i++) {
                //temp表示当前操作的元素
                int temp = arr[i];
                //j是一个指针，表示当前操作的元素
                int j = i;
                // 对于每个元素，向前比较gap个距离的元素。如果前面的元素大于当前元素才需要交换
                while (j >= gap && arr[j - gap] > temp) {
                    //后面元素挪到前面
                    arr[j] = arr[j - gap];
                    //当前操作元素变为前gap个
                    j -= gap;
                }
                //将本次需要操作元素放到移动的位置
                arr[j] = temp;
                num++;
                System.out.println(gap + Arrays.toString(arr));
            }
        }
        System.out.println("一共交换了："+ num +"次");
    }
}
