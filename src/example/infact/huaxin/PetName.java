package example.infact.huaxin;

import java.util.*;

/**
 * PetName
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 你要给刚买来的小狗起名字，需要在m个可重复的名字中挑选名字，但又不想要过于大众化的名字，请编写一个程序，用数组中的元素代表每个名字，并在其中找到出现频率过高的名字（出现次数>m/3）
 *
 * 输入描述:
 * 输入宠物名字：
 * 胖胖,球球,大毛,球球,胖胖
 * 输出描述:
 * 输出：
 * 胖胖, 球球
 * 示例1
 * 输入
 * 胖胖,球球,大毛,球球,胖胖
 * 输出
 * [胖胖, 球球]
 * @date 2023/7/17 18:33
 */
public class PetName {

    public static void main(String[] args) {
        Solve solve = new Solve();
        Scanner scanner = new Scanner(System.in);
        // 获得输入
        String input = scanner.nextLine();
        // 输入转数组
        String[] split = input.split(",");
        // 数组转集合
       // List<String> list = Arrays.asList(split);
        //集合转数组
      //  String[] names = list.toArray(new String[0]);

        List<String> highFrequencyName = solve.majorityElement(split);
        System.out.println(highFrequencyName);
    }

    public static class Solve {
        public List<String> majorityElement(String[] names) {
            HashMap<String, Integer> cnt = new HashMap<>();
            for (int i = 0; i < names.length; i++) {
                // 存在key value值加1
                if (cnt.containsKey(names[i])) {
                    cnt.put(names[i], cnt.get(names[i]) + 1);
                } else {
                    cnt.put(names[i], 1);
                }
            }

            List<String> ans = new ArrayList<>();

            cnt.forEach((k,v) -> { if( v >names.length / 3) {
                ans.add(k);
            }
            });



            /*for (String x : cnt.keySet()) {
                if (cnt.get(x) > names.length / 3) {
                    ans.add(x);
                }
            }*/
            return ans;
        }
    }
}
