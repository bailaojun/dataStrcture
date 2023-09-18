package example.infact.huaxin;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ZhuGeLiang
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 古话说的好，三个臭皮匠，顶个诸葛亮，已知诸葛亮的智力值为n，现在有m个人，他们的智力值各不相等，请编写一个程序，使用数组中的元素代表每个人的智力值，从他们当中选取三个人，使他们三人智力值之和最接近诸葛亮。
 * 输入描述:
 * 例如：
 * 1、输入6个人的智力值、如 [22,36,2,1,44,9]
 * 2、诸葛亮的智力值为n、如n=99
 * 输出描述:
 * 输入6个人的智力值当中选取三个人，使他们三人智力值之和最接近诸葛亮
 * 例如：输出为102
 * 示例1
 * 输入
 * 22,36,2,1,44,9
 * 99
 * 输出
 * 102
 * 说明
 * 例如输入：
 * m=22,36,2,1,44,9
 * n=99
 * 输出为102
 * @date 2023/7/17 18:58
 */
public class ZhuGeLiang {
    public static void main(String[] args) {
        Solve solve = new Solve();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] split = input.split(",");

        int[] nums = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();

        //   List<String> list = Arrays.asList(input.split(","));

        //   int[] nums = list.stream().mapToInt(Integer::parseInt).toArray();
        // 要同一个scanner 才行
        int n = scanner.nextLine().hashCode();

        int sumClosest = solve.threeSumClosest(nums, n);
        System.out.println(sumClosest);

    }


    public static class Solve {
        public int threeSumClosest(int[] nums, int target) {
            // 数组 nums 进行升序排序，以方便后续的操作
            Arrays.sort(nums);
            int n = nums.length;
            // 保存目前最接近目标值的和
            int best = Integer.MAX_VALUE;
            // 使用两个嵌套的循环来枚举数组中的三个数的组合
            for (int i = 0; i < n; ++i) {

                //这段代码是用来避免重复计算相同的三个数之和。
                //当数组经过排序后，如果当前索引 i 大于 0，并且当前元素 nums[i]
                // 与前一个元素 nums[i-1] 的值相等，那么说明在之前的迭代中已经考虑过以
                // nums[i-1] 作为第一个数的情况，因此可以跳过当前的迭代，继续下一个索引的迭代。
                //这样做的目的是为了避免重复计算相同的三个数之和，以提高效率。由于数组已经排序，
                // 所以相同的数必然是相邻的，而且如果第一个数重复，那么得到的三个数之和也会重复。
                //通过使用 continue 关键字，代码会跳过当前的迭代，直接进行下一次迭代。
                // 这样就能够确保每种组合只被计算一次。
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                // 两个指针 j 和 k 分别指向第一个数之后的数和最后一个数，
                // 以便在剩余的元素中查找剩下的两个数
                int j = i + 1, k = n - 1;


                // 首先计算当前三个数的和 sum。
                // 如果 sum 等于目标值 target，则直接返回 target
                // 因为已经找到了和为目标值的组合
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        return target;
                    }


                    // 计算当前和与目标值之间的差值 diff = sum - target。
                    // 如果 diff 的绝对值比 best - target 的绝对值小，说明当前的和更接近目标值，
                    // 这时更新 best 的值为当前的和 sum
                    int diff = sum - target;
                    if (Math.abs(diff) < Math.abs(best - target)) {
                        best = sum;
                    }
                    // diff 的正负情况，决定如何移动指针。如果 diff 大于 0，
                    // 说明当前的和偏大，需要减小和，所以将指针 k 左移，
                    // 并跳过相同元素，直到找到一个不同的元素
                    if (diff > 0) {
                        while (j < k && nums[k - 1] == nums[k]) {
                            --k;
                        }
                        --k;
                    } else {
                        while (j < k && nums[j + 1] == nums[j]) {
                            ++j;
                        }
                        ++j;
                    }
                }
            }

            return best;
        }
    }
}
