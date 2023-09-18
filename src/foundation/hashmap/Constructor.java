package foundation.hashmap;

/**
 * Constrctor
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/10 8:26
 */
public class Constructor {
    private String name;
    private Integer age;

    public Constructor(){

    }

    public Constructor(String name, Integer age){
        this.name = name;
        this.age = age ;
    }

    public Constructor(String name){
        this.name = name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
