package stringchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * Example03
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/8/26 18:07
 */
public class Example03 {


    public static List<Integer> generateArray(int a, int b) {
        List<Integer> result = new ArrayList<>();
        int prev = 0;

        for (int i = 0; i < b; i++) {
            int curr = prev * 10 + a;

            if (curr == 10) {
                curr = 0;
            }

            result.add(curr);
            prev = curr;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        List<Integer> array = generateArray(a, b);
        System.out.println("生成的数组为：" + array);
    }
}

