package com.test;
import java.util.Arrays;

class product {
    int price;
    int bonusPoint;

    product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

}

class Tv1 extends product {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    product[] cart = new product[10];
    int i = 0;

    void buy(product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을 구매");
        cart[i++] = p;
    }

    void summury() {
        int sum = 0;
        String itemList = "";

        for(int i = 0; i < cart.length; i++) {
            if(cart[i] == null) {break;}
            sum+=cart[i].price;
            itemList+=cart[i] + ", ";
        }
        System.out.println(sum);
        System.out.println(itemList);
    }

}

public class supertest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Computer c = new Computer();
        Tv1 tv = new Tv1();
        b.buy(tv);
        b.buy(c);
        b.summury();

        System.out.println("현재남은돈" + b.money + "이다.");
        System.out.println("보너스포인트" + b.bonusPoint + "이다.");
    }
}
