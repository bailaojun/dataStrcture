package example.infact.huaxin;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Wine
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 超市里的货架上有一排红酒，价格由低到高依次排列（起始位置为0），售货员手中有一瓶新的红酒A要上架，请在货架中找到和A价格相同的红酒的位置号并返回，如果货架中没有和A价格相同的红酒，那么就返回A将要放到的位置号。请编写一个程序，用数组中的元素代表每瓶红酒的价格，并实现需求。
 * 输入描述:
 * 输入一个数组、数组元素代表商品价格：
 * 例如：100,300,500,600
 * 输入商品价格500
 * 输出描述:
 * 在货架中找到和商品价格相同的红酒的位置号并返回、如果货架中没有和商品价格相同的，那么就返回商品将要放到的位置号
 * 如：
 * 输入：
 * 100,300,500,600
 * 输入商品价格500
 * 输出：2
 * 示例1
 * 输入
 * 100,300,500,600:500
 * 输出
 * 2
 * 说明
 * 100,300,500,600:500
 * @date 2023/7/17 18:03
 */
public class Wine {
    public static void main(String[] args) {
        Solve solve = new Solve();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(":");

        List<String> list = Arrays.asList(str[0].split(","));

        int[] pricess = list.stream().mapToInt(e -> Integer.valueOf(e)).toArray();

    //    int[] prices = list.stream().mapToInt(Integer::parseInt).toArray();
        int index = solve.searchInsert(pricess, Integer.valueOf(str[1]));
        System.out.println(index);
    }
    public static class Solve {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left = 0, right = n - 1, ans = n;
            // 二分查找 前提是有序
            while (left <= right) {
                // 求 mid 下标
                int mid = ((right - left) >> 1) + left;
                // 和中间值比较nums[mid]
                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
}
