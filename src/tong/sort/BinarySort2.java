package tong.sort;

/**
 * BinarySort2
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/12/25 9:53
 */
public class BinarySort2 {

    public int binarySort (int[] arr , int element){
        int l = 0;
        int r = arr.length-1;

        while(l <= r){
            int m = (l+r)>>1;
            if (arr[m] == element){
                return m;
            }
            if (arr[m] > element){
                r = m-1;
            } else {
                l = m+1;
            }

        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,34,36,43 };
        BinarySort2 binarySort2 = new BinarySort2();
        int i = binarySort2.binarySort(arr, 36);
        System.out.println("i = " + i);
    }
}
