package foundation.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * SortedList
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 15:00
 */
public class SortedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("bai");
        arrayList.add("black");
        arrayList.add("yellow");


        Collections.sort(arrayList, (o1, o2) -> (o2.length()-o1.length()));

        arrayList.forEach(k -> System.out.println(k));
    }
}
