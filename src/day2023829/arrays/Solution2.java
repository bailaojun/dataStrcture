package day2023829.arrays;

import org.springframework.transaction.jta.WebSphereUowTransactionManager;

import java.lang.annotation.Target;

/**
 * Solution2
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/7 22:13
 */
public class Solution2 {
    public static void main(String[] args) {
        String [] strs = {"flower","fkow"};
        String s = strs[0];
        for(int i =1;i<strs.length;i++){
            for(int j = 0;j<s.length();j++){
                if(strs[i].startsWith(s)){
                    System.out.println(s);
                    break;
                }else{
                    s =  s.substring(0,s.length()-1);
                    System.out.println("别人的提交");
                }
            }

        }
        System.out.println(s);
        if(strs.length>1 && !strs[1].startsWith(s)){
            s = "";
        }


        boolean f = "fkow".startsWith("f");
        System.out.println("f = " + f);
    }
}

