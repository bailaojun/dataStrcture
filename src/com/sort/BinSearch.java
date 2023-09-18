package com.sort;

import java.sql.Array;

/**
 * BinSearch
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 传入一个有序的数组以及一个数组里面的数，根据数来查找
 * 数组的下标。
 * @date 2022/7/21 18:06
 */
public class BinSearch {
    public static int binSearch(int[] arr,int n){
        // 变量未初始化 这样的错也犯呢 我去吧！！
        int low =0;
        int high=arr.length-1;
        while (low<=high) {
            int mid = (low + high)/2;
            if (n == arr[mid]){
                return mid;
            }
            else if(n < arr[mid]){
                high = mid-1;
            }
            else{
               low = mid +1;
            }
        }
        return -1;
    }
  /*  public int bSearch(int[] nums,int value){
        int low =0;
        int high = nums.length-1;
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(value == nums[mid]){
            return mid;
        }
        if(value< nums[nums]){

        }
    }*/



    // 静态方法无法调用非静态方法
    // 方法之间的调用 直接调用。
    public static void main(String[] args) {
        int[] num = {1,2,5,8,34,56,67,78};
        System.out.println("binSearch(num,34) = " + binSearch(num, 34));
    }

}
