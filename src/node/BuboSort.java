package node;

import java.util.Arrays;

/**
 * BuboSort
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/23 13:42
 */
public class BuboSort {

   static int[] arr = {3, 2, 5, 1, 4, 6};

    public static void main(String[] args) {
        /*for (int i = 0;i<arr.length-1;i++) {
            for (int j =0;j<arr.length-i-1;j++) {

                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }*/


        Arrays.stream(arr).forEach(System.out::println);

    }

}
