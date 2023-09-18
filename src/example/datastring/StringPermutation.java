package example.datastring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * StringPermutation
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/18 8:36
 */
public class StringPermutation {

    public static void main(String[] args) {
        String string = "123";
        List<String> permutations = permute(string);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }


    static List<String> result = new ArrayList<>();

    public static List<String> permute(String str) {
        // 将字符串转换为字符数组
        char[] chars = str.toCharArray();
        // 调用回溯函数求解全排列
        backtrack(chars, 0);
        return result;
    }

    // 递归函数，用于求解全排列
    static void backtrack(char[] chars, int index) {
        if (index == chars.length - 1) {
            // 已完成一次排列，将结果添加到结果集中
            result.add(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                // 固定当前位置的字符
                swap(chars, index, i);
                // 递归求解剩余字符的全排列
                backtrack(chars, index + 1);
                // 还原字符位置，进行下一轮循环，尝试新的排列
                swap(chars, index, i);
            }
        }
    }


    // 辅助函数，用于交换字符位置
    static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }



}

