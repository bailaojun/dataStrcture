package day2023829.inout;

import java.util.Scanner;

/**
 * AB2
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/1 20:03
 */
public class AB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int i = scanner.nextInt();
            while(i != 0){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a+b);
                i--;
            }
        }

    }
}
