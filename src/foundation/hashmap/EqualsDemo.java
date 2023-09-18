package foundation.hashmap;

/**
 * EqualsDemo
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 13:12
 */
public class EqualsDemo {

    public static void main(String[] args) {
        String s1 = "bai";
        String s2 = "bai";

        System.out.println(s1.equals(s2));

        Student bai = new Student("bai");
        Student bai1 = new Student("bai");

        System.out.println(bai.equals(bai1));


    }
}
