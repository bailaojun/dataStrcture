package example.infact.huaxin;

import java.util.Scanner;

/**
 * AntRout
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 有一张黑白格矩形桌布平铺在桌子上，已知桌布上的格子有x行，y列，在这个桌布的最左上角的格子上有一只蚂蚁，最右下角的格子上有一粒面包屑，而蚂蚁一次只能向右或者向下爬一个格，蚂蚁想要吃到面包屑有多少种路线可走？请编写一个程序解答
 * 输入描述:
 * 例如：桌布上的格子有x行，y列
 * x=2、y=3
 * 输出描述:
 * 蚂蚁想要吃到面包屑有多少种路线可走
 * 根据输入 x=2、y=3计算的话，那么输出结果为3
 * 示例1
 * 输入
 * 2
 * 3
 * 输出
 * 3
 * @date 2023/7/17 18:47
 */
public class AntRout {
    public static void main(String[] args) {
        Solve solve = new Solve();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int way = solve.uniquePaths(x, y);
        System.out.println(way);
    }

    public static class Solve {
        public int uniquePaths(int m, int n) {
            // int[m][n] 行 列
            int[][] f = new int[m][n];
            //初始化第一列的路径数量 将 f[i][0] 的值设置为 1，
            // 表示从左上角到当前位置的路径只有一条，
            // 因为只能向下移动。
            for (int i = 0; i < m; ++i) {
                f[i][0] = 1;
            }

            // 初始化第一行的路径数量。将 f[0][j] 的值设置为 1，
            // 表示从左上角到当前位置的路径只有一条，因为只能向右移动
            for (int j = 0; j < n; ++j) {
                f[0][j] = 1;
            }

            // 用来计算其他位置的路径数量。
            // 从第 2 行、第 2 列开始遍历，
            // 根据递推公式 f[i][j] = f[i-1][j] + f[i][j-1]
            // 计算每个位置的路径数量，即等于其上方和左方位置的路径数量之和。
            for (int i = 1; i < m; ++i) {
                for (int j = 1; j < n; ++j) {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
            //返回右下角位置的路径数量，即 f[m-1][n-1]
            return f[m - 1][n - 1];
        }
    }
}
