package example.infact.huaxin;

import java.util.Scanner;

/**
 * NumberDesperate
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 给定一个正整数，现在要把这个正整数的每一位都拆分成一个数字，最高位拆成的数字为正数，且相邻的两个数字的符号相反，例如：152，变成（+1）（-5）（2），求这些数字的和
 * 输入描述:
 * 输入一个数字
 * 例如：152，变成（+1）（-5）（2）
 * 输出描述:
 * 最高位拆成的数字为正数，且相邻的两个数字的符号相反，求这些数字的和。
 *
 * 示例1
 * 输入
 * 152
 * 输出
 * -2
 * @date 2023/7/17 18:20
 */
public class NumberDesperate {

    public static void main(String[] args) {
        Solve solve = new Solve();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(solve.alternateDigitSum(num));
    }

    public static class Solve {
        public int alternateDigitSum(int n) {
            int res = 0, sign = 1;
            while (n > 0) {
                res += n % 10 * sign;
                sign = -sign;
                n /= 10;
            }
            return -sign * res;
        }
    }

}
