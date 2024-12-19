package test1219;

import java.lang.reflect.Array;
import java.util.*;

public class test_1219 {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<Student>();
        list.add(new Student("왕", 1, 1));
        list.add(new Student("왕자", 1, 2));
        list.add(new Student("왕비", 2, 1));
        list.add(new Student("왕", 1, 1));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}