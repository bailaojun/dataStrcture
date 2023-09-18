package node;

import org.springframework.util.StringUtils;

/**
 * TestThread
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 *
 */
public class TestThread {

    public static void main(String[] args) {
            method(new Runnable() {
                @Override
                public void run() {
                    System.out.println("ssss");
                }
            });
            // 这里也是重写了run方法
            method(() -> System.out.println("wowowowwow"));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("11111");
                String name = Thread.currentThread().getName();
                System.out.println("name = " + name);
            }
        });
        String name = Thread.currentThread().getName();
        System.out.println("name1111 = " + name);
        thread.start();
        String id = "123";
        if(!StringUtils.isEmpty(id)){
            System.out.println("full");
        }




    }


    public static  void method(Runnable runnable){
        runnable.run();
    }
}
