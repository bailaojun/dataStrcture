package MyIO;

/**
 * Animal
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/18 23:25
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 抽象方法：没有具体的实现代码
    public abstract void sound();

    // 普通方法：具有实现代码
    public void eat() {
        System.out.println(name + " is eating.");
    }
}


