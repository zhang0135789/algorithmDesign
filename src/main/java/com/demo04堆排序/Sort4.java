package com.demo04堆排序;

import java.util.Arrays;

/**
 * @Author: zz
 * @Description: 堆排序
 * @Date: 22:23 2024/05/14 0014
 * @Modified By
 */
public class Sort4 {

    //测试
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 9, 1, 8, 5, 3, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {

        //判断如果arr为空或者只有一个数据，则不需要进行排序
        if (arr == null || arr.length < 2) {
            return;
        }

        //构建大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        //将堆顶元素依次放到数组最后，并重新调整堆结构
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }

    //构建大根堆
    public static void heapInsert(int[] arr, int index) {
        //如果
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //调整大根堆
    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    //交换数组中的两个元素
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
