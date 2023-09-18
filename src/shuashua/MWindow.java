package shuashua;

import example.infact.huaxin.Wine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

/**
 * MWindow
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 *
 * abba  2 最长子串的问题
 *
 * @date 2023/8/3 8:21
 */
public class MWindow {

   static int l = 0;
    static int r = 0;
    static int ans = 0;

    public static void main(String[] args) {

       /* char[] nums ={'a','b','c','a'};
        char[] numss ={'a','b','b','a'};
        //solve(nums);
        System.out.println("ans = " + solve(numss));

        File file = new File(" ");
        try {
            String canonicalPath = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }

    public static  int solve(char[] nums){


        Map hashMap = new HashMap();

        while(r<nums.length){
            if(hashMap.containsKey(nums[r])){
                l = Math.max((int) hashMap.get(nums[r]) + 1,l);
            }
            ans = Math.max((r-l+1),1);

            hashMap.put(nums[r],r);
            r++;
        }
        return ans;
    }

}
