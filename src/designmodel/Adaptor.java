package designmodel;

/**
 * Adaptor
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/23 11:23
 */
public class Adaptor {
    static class Car{
        public void run(){
            System.out.println("run .....");
        }
    }

    static class FlyCar{
        public FlyCar(){

        }

        public FlyCar(Car car){

        }

        public void flyRun(){
            System.out.println("fly and run ...");
        }
    }


    public static void main(String[] args) {
        FlyCar flyCar = new FlyCar(new Car());

        flyCar.flyRun();
    }




}
