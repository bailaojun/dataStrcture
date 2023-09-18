package example.infact.huaxin.huaxin2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * StringCondition
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 从控制台输入最少2位字符对此字符做所有可能的排序组合
 * 输入描述:
 * 输入字符
 * test
 * 输出描述:
 * 输出所有可能得全组合
 * 示例1
 * 输入
 * test
 * 输出
 * [test, tets, tset, tste, ttes, ttse, etst, etts, estt, estt, etts, etst, stet, stte, sett, sett, stte, stet, ttes, ttse, tets, test, tste, tset]
 * @date 2023/7/17 19:52
 */
public class StringCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toString();
        List<String> res = permutation(s);
        System.out.println(res);
    }

    public static List<String> permutation(String str) {
        // 字符串为空或者长度为 0，则直接返回空的结果集
        List<String> res = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return res;
        }
        // 用于记录每个字符是否已经被访问过，默认都是未访问状态
        boolean[] visited = new boolean[str.length()];
        dfs(str.toCharArray(), visited, new StringBuilder(), res);
        return res;
    }
    // 深度优先搜索的递归函数，在生成排列组合时，通过回溯的方式遍历所有可能的情况
    private static void dfs(char[] chars, boolean[] visited, StringBuilder sbStr, List<String> res) {

        // 当前生成的字符串长度等于输入字符串的长度时，
        // 表示已经生成了一个完整的排列组合，将其加入结果集 res 中
        if (sbStr.length() == chars.length) {
            res.add(sbStr.toString());
            return;
        }
        // 遍历字符数组 chars 的每个位置
        for (int i = 0; i < chars.length; i++) {
            // 如果当前位置的字符已经被访问过，则跳过继续处理下一个位置
            if (visited[i]) {
                continue;
            }
            // 如果当前位置与前一个位置的字符相同，
            // 并且前一个位置的字符未被访问过，
            // 则跳过继续处理下一个位置，以避免生成重复的排列
            if (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1]) {
                continue;
            }
            // 将当前位置的字符标记为已访问，并将其加入 StringBuilder 中
            visited[i] = true;
            sbStr.append(chars[i]);
            // 在新的状态下继续生成排列组合
            dfs(chars, visited, sbStr, res);
            // 回溯，将当前位置的字符标记为未访问，
            // 并将其从 StringBuilder 中删除
            visited[i] = false;
            sbStr.deleteCharAt(sbStr.length() - 1);
        }
    }
}
