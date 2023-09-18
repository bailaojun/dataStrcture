package tong.sort;

/**
 * SelectSort
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/12/25 10:27
 */
public class SelectSort {
    public void selectSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int s = i;
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[s]>arr[j]){
                    s =j ;
                    int temp = arr[s];
                    arr[s]  = arr[i];
                    arr[i]  =  temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] arr = {34,45,23,5,67,89};
        selectSort.selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
