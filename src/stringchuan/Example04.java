package stringchuan;

import java.util.HashMap;

/**
 * Example04
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/8/26 18:20
 */
public class Example04 {
    public static void main(String[] args) {

    }
    public static void solution(int a,int b){
        int[] arrs = new int[100000];
        for(int i = 0;i<b;i++){
            int value = 0;
            value = a*(int)Math.pow(10,a) ;
            arrs[i] = value;
            value = b*(int)Math.pow(10,a);
            a++;
            HashMap<String,String> hashMap = new HashMap<>();
           // hashMap.putIfAbsent()

        }
    }
}
