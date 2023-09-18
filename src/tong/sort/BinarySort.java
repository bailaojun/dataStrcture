package tong.sort;

import sun.applet.Main;

/**
 * binarySort
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/12/7 15:05
 */
public class BinarySort {


    public int binarySort(int[] arr, int element) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int midIndex = (leftIndex + rightIndex) >> 1;


        if (arr[midIndex] == element) {
            return midIndex;
        }
        if (arr[midIndex] < element) {
            while ( arr[midIndex] != element ){
                midIndex = (midIndex + rightIndex) >> 1;
            }
                return midIndex;
        }else {
            while (arr[midIndex] != element ) {
                midIndex = (midIndex + leftIndex) >> 1;
            }
            return midIndex;
        }
    }




    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 23, 28, 45};
        BinarySort binarySort = new BinarySort();
       int index = binarySort.binarySort(arr,5);
        System.out.println(index);
    }
}
