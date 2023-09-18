package shuashua;

import java.util.HashSet;
import java.util.Set;

/**
 * SWindow
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/8/1 23:08
 */
public class SWindow {
    public static void main(String[] args) {

       int[] nums = {1,2,3,1,2,3};
       int k = 2;
       containsNearbyDuplicate(nums,k);


    }

    public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        Set hash = new HashSet();
        int l = 0;
      //  int r = k;

        for(int j = 0;j<nums.length;j++){
            if(j>(k)){
                hash.remove(nums[j-k-1]);
            }

            if(hash.contains(nums[j])){
                return true;
            }

            hash.add(nums[j]);
             // r++;
        }
        return false;
    }


}
