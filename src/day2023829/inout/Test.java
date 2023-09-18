package day2023829.inout;

/**
 * Test
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/2 8:47
 */
public class Test {
    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        thread1.start();
        thread1.interrupt();
        System.out.println("Main run");

    }

}


