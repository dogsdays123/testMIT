package test1224;

import java.util.*;

class Customer implements Comparable<Customer> {
    String name;
    int age;
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.age, other.age);
    }
}

public class test14 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Lee", 31));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Kim", 67));
        customers.add(new Customer("Choi", 19));

        List<Customer> list = new ArrayList<>();
        for(Customer customer : customers) {
            if(customer.age > 30) {
                list.add(customer);
            }
        }

        Collections.sort(list);
        for(Customer customer : list) {
            System.out.println(customer.name + ": " + customer.age);
        }
    }
}
