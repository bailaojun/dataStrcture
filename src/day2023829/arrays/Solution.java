package day2023829.arrays;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 如何找出数组中唯一的重复元素
 * @date 2023/8/29 21:53
 */
public class Solution {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();*/
        int[] ins = {1,2,3,4,5,6,4};
        int solution = solution(ins);
        System.out.println("solution = " + solution);
    }


    public static int solution(int[] ins){
        HashMap hashMap = new HashMap();
        for(int i =0;i<ins.length;i++){

            hashMap.putIfAbsent(ins[i],0);

        }
        Set set = hashMap.entrySet();
        for(int j = 0;j<set.size();j++){

        }


        return 'c';
    }
}
