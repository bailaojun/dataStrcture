package com.reference.datastructure;

/**
 * ArrayDemo1
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/7/20 11:28
 */
public class ArrayDemo1 {
        int[] nums = new int[8];

        public ArrayDemo1() {
            nums[0] = 3;
            nums[1] = 1;
            nums[2] = 2;
            nums[3] = 5;
            nums[4] = 4;
            nums[5] = 9;
        }

        public int get(int i) {
            return nums[i];
        }
        public void play(){
            for (int num : nums) {
                System.out.println("num = " + num);
            }
        }
}

