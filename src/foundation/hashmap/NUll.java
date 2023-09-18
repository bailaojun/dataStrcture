package foundation.hashmap;

import java.util.HashMap;
import java.util.HashSet;

/**
 * NUll
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 20:14
 */
public class NUll {
    public static void main(String[] args) {
        ((NUll)null).haha();

        HashSet<String> strings = new HashSet<>();
        strings.add(null);

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("1","1");
        stringStringHashMap.get("1");

    }

    public static void haha(){
        System.out.println("haha");
    }
}
