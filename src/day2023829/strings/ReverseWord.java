package day2023829.strings;

import org.yaml.snakeyaml.nodes.ScalarNode;

import java.util.Scanner;

/**
 * ReverseWord
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/2 10:17
 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("reverseWords(s) =" + reverseWords(s));

    }
    public static String reverseWords(String s){
        String[] s1 = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for(int  i = s1.length-1;i>=0;i--){
            if("".equals(s1[i])){
                continue;
            }

            stringBuilder.append(s1[i]).append(" ");

        }
        return stringBuilder.toString().trim();
    }
}
