package test1226;

import java.util.stream.Stream;

class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class test26 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", 30);
        Customer c2 = new Customer("Bob", 25);

        Stream<Customer> customerStream = Stream.of(c1, c2);
        customerStream.forEach(System.out::println);
// 출력:
// Alice (30)
// Bob (25)
    }
}
