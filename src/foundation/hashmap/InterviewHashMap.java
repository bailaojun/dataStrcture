package foundation.hashmap;

import java.util.HashMap;
import java.util.HashSet;

/**
 * InterviewHashMap
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 13:40
 */
public class InterviewHashMap {

    public static void main(String[] args) {
        HashMap<Object,Object> hashMap = new HashMap<>();


        hashMap.put(new Student(),"bai");
        hashMap.put("haha","hehe");
        hashMap .get("haha");

        hashMap.put(null,"hei");
        hashMap.put(null,"yellow");

        hashMap.forEach((k,v) -> System.out.println(k  + "," + v));
    }



}
