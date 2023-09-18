package abstractor;

/**
 * SubMyAbstract
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/10 11:15
 */
public class SubMyAbstract extends MyAbstract {
    @Override
    public void test() {
        System.out.println("override test()");
    }

    public static void main(String[] args) {
        SubMyAbstract subMyAbstract = new SubMyAbstract();
        subMyAbstract.test();
        subMyAbstract.studey("English");

    }
}
