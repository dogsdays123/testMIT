package com.test;

import java.io.*;
import java.util.*;

class Ex8_5 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보하라");
        } catch (MemoryException me) {
            System.out.println(me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치하라");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoguhSpace()) {
            throw new SpaceException("설치할 공간이 부족");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족");
        }
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoguhSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

    static class SpaceException extends Exception {
        SpaceException(String msg) {
            super(msg);
        }
    }

    static class MemoryException extends Exception {
        MemoryException(String msg) {
            super(msg);
        }
    }
}

class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 예외처리");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 예외처리");
            throw e;
        }
    }
}

//------------------------------------
class Person {
    String name;
    int age = 3;

    public Person(String name) {
        this.name = name;
    }
}

class Example {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        Person person2 = new Person("홍길동");

        System.out.println(person1.age == person2.age); // == 은 객체타입인경우 주소값을 비교한다. 서로다른 객체는 다른 주소를 가지고 있기 때문에 false가 출력됨

        System.out.println(person1.equals(person2)); // equals또한 객체타입인경우 주소값을 비교하기 때문에 false가 출력된다.
    }
}
//------------------------------------

class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Person2 p1 = new Person2("홍길동");
        Person2 p2 = new Person2("홍길동");

        // 객체 인스턴스마다 각기 다른 주해시코드(주소))를 가지고 있다.
        System.out.println(p1.hashCode()); // 622488023
        System.out.println(p2.hashCode()); // 1933863327
    }
}

class Man {
    public String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man p = (Man) o;
        return Objects.equals(name, p.name);
    }
}

class ClassTest {
    public static void main(String[] args) throws Exception {
        Man p1 = new Man("홍길동");
        Man p2 = new Man("홍길동");

        String str1 = new String("홍길동");
        String str2 = new String("홍길동");

        // 두 객체의 해시 코드
        System.out.println(str1.hashCode()); // 460141958
        System.out.println(str2.hashCode()); // 1163157884

        // 해시코드가 달라도, equals를 재정의 했기 때문에 동등함
        System.out.println(p1.equals(p2)); // true

        // 리스트를 생성하고 두 객체 데이터를 추가한다.
        List<Man> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);

        // 그리고 리스트의 길이를 출력한다.
        System.out.println(people.size()); // 2
    }
}

class MyInt {
    final int num;

    MyInt(int num) {
        this.num = num * 100;
    }

    public String toString() {
        return Integer.toString(num);
    }
}

class test {
    public static void main(String[] args) {

        Object[] arr = new Object[2];
        arr[0] = new MyInt(1);
        arr[1] = new MyInt(2);

        System.out.println(Arrays.toString(arr));
    }
}

class test2 {
    public static void main(String[] args) {
        StringJoiner a = new StringJoiner(",", "[","]");
        String[] str = {"aaa", "bbb", "ccc"};
        for(String s : str){
            a.add(s.toUpperCase());
        }
        System.out.println(a.toString());
    }
}

class test3 {
    public static void main(String[] args) {
        String s1 = "aaa";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s2);
    }
}

class test4 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("01");
        StringBuffer s2 = s1.append(23);
        StringBuffer s3 = s2.append(45);
        System.out.println(s1.equals(s3));
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        int val = list.get(0);
        Integer intg = Integer.valueOf(val) + Integer.valueOf(10);
        System.out.println(intg);
    }
}