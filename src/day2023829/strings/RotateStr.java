package day2023829.strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * RorateStr
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/2 15:15
 */
public class RotateStr {
    public static void main(String[] args) {
        int[]  nums = {3,2,2,3};
        int val = 3;
        System.out.println("bi(nums,val) = " + bi(nums, val));

        long a = (long)(-Integer.MIN_VALUE)-1;
        long b = (long)(-Integer.MIN_VALUE-1);
        int c = -Integer.MAX_VALUE-1;
        int d = -Integer.MIN_VALUE+1;

        System.out.println("a = " + a);
        System.out.println("a = " + b);
        System.out.println("a = " + c);
        System.out.println("a = " + d);

        int[] ints = Arrays.stream(nums).sorted().toArray();
    }
    public static int bi(int[] nums,int val) {
       /* Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println( rotateStr(s,k));
        HashSet<String> strings = new HashSet<>();
        HashSet<String> ss = new HashSet<>();
        strings.add("wowo");
        for(String str : strings){
            ss.add(str);*/


        ArrayList<Integer> list = new ArrayList<>(0);
        for(int i = 0;i<nums.length;i++){
            if(val != nums[i]){
                list.add(nums[i]);
                
            }else{

            }
        }
        return list.size();


    }

    public static String rotateStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String string = stringBuilder.reverse().toString();
        char[] charArray = string.toCharArray();
        reverseStr(charArray, 0, s.length() - k - 1);
        reverseStr(charArray, s.length() - k, s.length() - 1);
        return String.valueOf(charArray);

    }

    public static void reverseStr(char[] str, int start, int end) {

        for (; start < end; start++, end--) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
        }

    }
}
