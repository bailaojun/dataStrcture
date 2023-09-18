package day2023829.inout;

import java.util.Scanner;

/**
 * AB
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/1 19:56
 */
public class AB {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("reverseStr(s) = " + reverseStr(s));
    }

    public static String reverseStr(String s){
        char[] charArray = s.toCharArray();
        int length = s.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0 ;i<length;i++){
            char temp = charArray[i];
            charArray[i] = charArray[length];
            charArray[length] = temp;
            length --;

        }
        String string = stringBuilder.append(s).reverse().toString();

        return stringBuilder.append(charArray).toString();

    }
}
