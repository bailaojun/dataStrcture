package example.infact.huaxin.huaxin2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * DrawReward
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 734抽奖大作战，给定一串数字，由3、4、7组成，两个7可以兑换一个大奖。兑奖机按照数字顺序进行兑奖，兑奖机只有两个数字显示位。
 * 条件：
 * 1、兑奖机优先保留数字7，当另一位数字不是7则会丢弃，继续录入下一位数字，直到兑出一个大奖，两个数字显示位清空，继续兑奖。
 * 2、兑奖机最多只能显示两位数字，如果是3和4（顺序不限）则合并为7，并补入下一位数字显示。
 * 3、如果显示位两个数字既不能合并，又不能中奖，则按照数字串的顺序，丢弃一位，录入下一位。
 *
 * 输入描述:
 * 输入一行数字，内容由3、4、7组成（三种数字不一定同时包含）
 * 输出描述:
 * 输出可以兑换大奖的个数。
 * 示例1
 * 输入
 * 73443733447
 * 输出
 * 2
 * @date 2023/7/17 19:23
 */
public class DrawReward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readLine = sc.nextLine();
        String[] numArrays = readLine.split("");
        List<String> numList = Arrays.asList(numArrays);
        // 兑奖机A显示位
        int first = 0;
        // 兑奖机B显示位
        int second =  0;
        // 本次大奖个数
        int bigCount = 0;
        for (int i = 0; i < numList.size(); i++) {


            // 设置A显示位的值
            first = Integer.parseInt(numList.get(i));
            i++;
            // 设置B显示位的值，无法设置则结束
            if (i < numList.size()) {
                second = Integer.parseInt(numList.get(i));
            } else {
                break;
            }

            // A B 都为7，中大奖了
            if (first == 7 && second == 7) {
                bigCount++;
                continue;
            }

            // 如果A+B= 7则合并为7 或者 如果A和B有一个为7，寻找下一个7
            if (first + second == 7 || first == 7 || second == 7) {
                int next = findNext7(numList, i + 1);
                // 如果返回下标不是0，说明找到了，否则说明没找到，就可以结束了
                if (next != 0) {
                    bigCount++;
                    // 需要重置下标为返回的下标
                    i = next;
                } else {
                    break;
                }
            } else {
                // 最后一种情况， A = B，需要找下一个不同值合并为7 或者 直接找到7
                int next = findDifferenceOr7(numList, i + 1, first);
                if (next == 0) {
                    break;
                }
                // 重置下标之后再去找7
                i = next;
                int next7 = findNext7(numList, i + 1);
                // 如果返回下标不是0，说明找到了，否则说明没找到，就可以结束了
                if (next7 != 0) {
                    bigCount++;
                    // 需要重置下标为返回的下标
                    i = next7;
                } else {
                    break;
                }
            }
        }
        System.out.println(bigCount);
    }

    private static int findNext7(List<String> numList, int curNum) {
        int returnNum = 0;
        for (int i = curNum; i < numList.size(); i++) {
            int findNum = Integer.parseInt(numList.get(i));
            if (findNum == 7) {
                returnNum = i;
                break;
            }
        }
        return returnNum;
    }

    private static int findDifferenceOr7(List<String> numList, int curNum, int first) {
        int returnNum = 0;
        for (int i = curNum; i < numList.size(); i++) {
            int findNum = Integer.parseInt(numList.get(i));
            if (findNum == 7 || findNum != first) {
                returnNum = i;
                break;
            }
        }
        return returnNum;
    }
}
