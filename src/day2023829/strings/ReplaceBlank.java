package day2023829.strings;

import java.util.Scanner;

/**
 * ReplaceBlank
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/2 11:20
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(replaceBlank(s));
    }

    public static String replaceBlank(String s){

        String replace = s.replace(" ", "%20");
        return replace;
    }

}
