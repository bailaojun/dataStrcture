package stringchuan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Dan
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 单串无重复字符最子长串  比如 abca  abc 3   abccacd  acd  3
 * @date 2023/8/26 8:19
 */
public class Dan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] charArray = s.toCharArray();
        int solution = solution(charArray);
        System.out.println("solution = " + solution);

    }


    public static int solution(char[] arr) {
        int l = 0;
        int r = 0;
        int res = 0;

        Map<Character,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])) {
                l = Math.max(hashmap.get(arr[i]) + 1,l);
            }
            r++;
            res = Math.max(r - l, res);
            hashmap.put(arr[i],i);
        }

        return res;
    }

}
