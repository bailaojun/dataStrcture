package Extends;

/**
 * Test
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/17 22:07
 */
public class Test {
    public static void main(String[] args) {
        int c =1;
        int m = 3 ;
        int sum = 0;
        for(int i =m ; i>0 ;i--){
            sum = sum + c*i;
            c = c*10;
        }
        System.out.println("sum = " + sum);
    }
}
