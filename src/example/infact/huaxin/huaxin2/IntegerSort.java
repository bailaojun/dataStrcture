package example.infact.huaxin.huaxin2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * IntegerSort
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 控制台输入一个整数，然后重新排列，输出重排后的整数，并且让其最小化且不包含前导零
 *
 * 输入描述:
 * 控制台输入一个整数
 * 输入：23542526
 * 输出描述:
 * 输出重排后的整数，并且让其最小化且不包含前导零
 * 输出：22234556
 * 示例1
 * 输入
 * 23542526
 * 输出
 * 22234556
 * @date 2023/7/17 19:57
 */
public class IntegerSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
        int result = findMinNumber(num);
        System.out.println(result);
    }

    public static int findMinNumber(long num) {
        // 根据整数的正负号确定 sign 的值，
        // 如果为负则 sign 为 -1，否则为 1
        int sign = 1;
        if (num < 0) {
            sign = -1;
        }

        // 创建一个大小为 10 的整型数组 digit_freq，
        // 用于记录数字的频率
        int[] digit_freq = new int[10];
        // 将输入的整数取绝对值后赋值给变量 xx
        long xx = Math.abs(num);

        // 使用循环计算 xx 中每个数字出现的频率，
        // 并更新到 digit_freq 数组中
        while (xx != 0L) {
            digit_freq[(int) (xx % 10)]++;
            xx /= 10;
        }

        //创建一个 ArrayList 类型的 res 列表，用于存储最终结果
        List<Integer> res = new ArrayList<>();

        // 如果输入的整数为正数
        if (sign == 1) {
            // 如果数字 0 出现的次数大于 0，则从数字 1 开始遍历 digit_freq 数组，
            // 找到第一个出现次数不为 0 的数字 x，将其加入到 res 列表中，并将 digit_freq[x] 减 1
            if (digit_freq[0] > 0) {
                int x = 1;
                while (x < 10) {
                    if (digit_freq[x] == 0) {
                        x += 1;
                    } else {
                        break;
                    }
                }
                res.add(x);
                digit_freq[x]--;
                // 根据数字 0 出现的次数，在 res 列表中添加相应个数的 0
                for (int ee = 0; ee < digit_freq[0]; ee++) {
                    res.add(0);
                }
                // 继续遍历 digit_freq 数组，将剩余的数字按照出现的次数加入到 res 列表中
                while (x < 10) {
                    for (int ee = 0; ee < digit_freq[x]; ee++) {
                        res.add(x);
                    }
                    x++;
                }
            }
            else {
                for (int x = 0; x < 10; x++) {
                    for (int ee = 0; ee < digit_freq[x]; ee++) {
                        res.add(x);
                    }
                }
            }
        }
        // 如果输入的整数为负数
        // 从数字 9 开始遍历 digit_freq 数组，
        // 将每个数字按照出现的次数加入到 res 列表中
        else {
            for (int x = 9; x > -1; x--) {
                for (int ee = 0; ee < digit_freq[x]; ee++) {
                    res.add(x);
                }
            }
        }
        // 将 res 列表中的数字按顺序转换为最终的结果 res_num，
        // 在转换过程中每次乘以 10 并加上当前数字
        long res_num = 0;
        for (int x : res) {
            res_num = res_num * 10 + x;
        }
        // 最后将结果乘以 sign，并将其转换为 int 类型后返回
        return (int) (sign * res_num);
    }

}
