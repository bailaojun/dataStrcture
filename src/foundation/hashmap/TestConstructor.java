package foundation.hashmap;

/**
 * TestContructor
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/10 8:31
 */
public class TestConstructor {

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor baibai = new Constructor("baibai");

        baibai.setName("heihei");
        System.out.println(baibai.getName());
    }
}
