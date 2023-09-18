package foundation.hashmap;

import javax.lang.model.element.VariableElement;
import java.util.Comparator;

/**
 * Student
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/9 13:08
 */
public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        Student student = (Student) o;

        if (this.name == student.name) {
            return true;
        }

        return false;
    }

    Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };

}
