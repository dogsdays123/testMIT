package test1212;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class test02 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("adb");
        set.add("adb");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return Objects.equals(name, p.name) && age == p.age;
    }
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
