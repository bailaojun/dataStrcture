package abstractor;

/**
 * MyInterface
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/10 11:41
 */
public interface MyInterface {
   public final    String name = "baibai";

    void test();

   default void testTo(){
       System.out.println("wowowo");
   }

}
