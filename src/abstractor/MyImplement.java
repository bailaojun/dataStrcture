package abstractor;

/**
 * MyImplement
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/10 11:44
 */
public class MyImplement implements MyInterface{


    @Override
    public void test() {
        System.out.println("override interface");
    }

    public static void main(String[] args) {
        MyImplement myImplement = new MyImplement();
        myImplement.test();
        myImplement.testTo();
    }
}
