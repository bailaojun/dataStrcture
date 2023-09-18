package tong.sort;



/**
 * BubbleSort
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 冒泡排序
 * @date 2022/11/18 16:34
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array ={1,3,6,2,5,7};
        for (int i = 0; i < array.length-1; i++) {
            for(int j = 0; j<array.length-i-1; j++){
               // int minIndex= 0;
                int temp;
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }

    }
}
