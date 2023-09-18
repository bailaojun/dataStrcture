package example.infact.huaxin.huaxin2;

import java.util.Scanner;

/**
 * InterestAdd
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 计算sum=c+cc+ccc+cccc+cc…c(共m个数)的值，c取值范围（1-9，数字）。举例：当c ＝ 4，m ＝ 6时，s ＝ 4+44+444+4444+44444+444444
 * 输入描述:
 * 输入一行包含两个整数c(1<=c<=9)和m(1<=m<=9)
 * 输出描述:
 * 输出一行结果sum
 * 示例1
 * 输入
 * 33
 * 33
 * 输出
 * 795364189
 * @date 2023/7/17 19:43
 */
public class InterestAdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int m = input.nextInt();
        int s = 0;
        for (int i = m; i > 0; i--) {
            s += c * i;
            c *= 10;
        }
        System.out.println(s);
    }
}
