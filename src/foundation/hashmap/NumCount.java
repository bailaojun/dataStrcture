package foundation.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * NumCount
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 14:34
 */
public class NumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("input num");

        String s = scanner.nextLine();

        char[] charArray = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(Character word : charArray){
            if(hashMap.containsKey(word)){
                Integer num = hashMap.get(word);
                num ++;
                hashMap.put(word,num);
            } else{
                hashMap.put(word,1);
            }

        }
        hashMap.forEach((k,v) -> {System.out.println(k + ":" +v);});


    }
}
