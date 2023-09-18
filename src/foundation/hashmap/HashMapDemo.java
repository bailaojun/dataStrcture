package foundation.hashmap;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * HashMapDemo
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 12:28
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();

        hashMap.put("bai","bai");
        hashMap.put("hei","black");
        hashMap.put("yellow","T_shirt");

        long start = System.currentTimeMillis();

        Map<String,String> sortedMap = new LinkedHashMap<>();

        sortedMap.put("bai","bai");
        sortedMap.put("hei","black");
        sortedMap.put("yellow","T_shirt");

        sortedMap.forEach((k,v) -> {System.out.println(k + "|||" + v);});

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // way1
        Set<String> set = hashMap.keySet();
        for( String key : set){
            String value = hashMap.get(key);
            System.out.println(key + " " +value);
        }
        // method two
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet();

        for(Map.Entry entry : entrySet){
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }

        // method three

        hashMap.forEach((k,v) -> {System.out.println(k+":" + v);} );

        // method four

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()){

            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "|" + next.getValue());
        }


    }


}
