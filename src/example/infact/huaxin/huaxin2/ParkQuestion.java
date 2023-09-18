package example.infact.huaxin.huaxin2;

import java.util.Scanner;

/**
 * PartQuestion
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 停车场n个车位  0< n <1000  用数组表示  p[]    0 空车位， 1已停车位
 *
 * 现在有一批车排队进入停车场 数组cars[] 1表示小车占一个车位 2表示大车占2个车位
 *
 * 大车占两个相邻的车位  小车占一个车位
 *
 * 求 剩余车位能否满足
 *
 *
 * 若能分配    输出 true
 * 若不能分配  输出 false
 * 输入描述:
 * 输入 停车场车位情况[1,0,0,0,0,1,1,0,1,0...]
 *      待进场车辆cars  [1,1,1,1,1,1,2,2,2,1,2,1...]
 *
 * 输出  是否可以全部分配
 * 输出描述:
 * 输出剩余车位是否满足所有车辆
 * 示例1
 * 输入
 * [0,0,0,0]
 * [1,1,1,1,2,2]
 * 输出
 * 2
 * FALSE
 * @date 2023/7/17 19:54
 */
public class ParkQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();

        String p = str1.substring(1, str1.length() -1);
        String[] park = p.split(",");

        String str2 = s.nextLine();
        String car = str2.substring(1, str2.length() -1);


        int flag = 0;
        int bigPark = 0;
        int parkNum = 0;
        for (String s1 : park) {

            if (s1.equals("1")) {
                flag = 0;
            } else {
                flag++;
                // 空车位数量
                parkNum ++;
            }
            // 连续的车位
            if (flag == 2) {
                // 大车车位数量
                bigPark++;
                flag = 0;
            }
        }

        System.out.println(bigPark);

        String[] carGroup = car.split(",");
        int carSum = carGroup.length;

        int bigCar= 0;
        for (String s1 : carGroup) {
            if (s1.equals("2")) {
                bigCar++;
            }
        }

        // 大车位小于大车
        if (bigPark < bigCar) {
            System.out.println("FALSE");
            return;
        }

        // 小车位 小于 小车
        if ((parkNum - bigCar * 2) < carSum - bigCar) {
            System.out.println("FALSE");
            return;
        }
        System.out.println("TRUE");
    }
}
