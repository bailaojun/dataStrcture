package niukewang;

import java.util.Scanner;

/**
 * Prefix
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 描述
给你一个大小为 n 的字符串数组 strs ，其中包含n个字符串 ,
编写一个函数来查找字符串数组中的最长公共前缀，返回这个公共前缀。
示例1
输入：
["abca","abc","abca","abc","abcc"]
返回值：
"abc"
示例2
输入：
["abc"]
返回值：
"abc"
 * @date 2023/8/10 7:55
 */
public class Prefix {

   // String[] strs = {"abca","abc","abca","abc","abcc"};





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String replace = s.replace("[", "");
        String[] split =replace.split(",");

        String solution = solution(split);

        System.out.println("solution = " + solution);


    }

    public static  String solution(String[] strs){

        String first = strs[0];

        for(int i = 0;i<strs.length;i++){
            char temp = first.charAt(i);

            for(int j = 1;j<strs.length;j++){
                if(temp != strs[j].charAt(i)){
                    return first.substring(0,i);
                }
            }


        }

        return null;
    }
}
