package stringchuan;

import java.util.Scanner;

/**
 * ShuangPublicPre
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 二个串的公共子串 公共前缀
 * @date 2023/8/26 13:56
 */
public class ShuangPublicPre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        solution(s1, s2);
    }

    public static int solution(String s1, String s2) {
        int i = 0;
        int j = 0;
        int sc = i;
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        for (i = 0; i < charArray1.length; i++) {
            if (charArray1[sc] == charArray2[j]) {
                sc++;
                j++;
                if (j == charArray2.length) {
                    return i;
                }
            } else {
                i++;
                sc = i;
                j = 0;
            }

        }
        return 0;
    }
}

