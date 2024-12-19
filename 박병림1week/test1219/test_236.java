package test1219;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}
class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}
class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {}

public class test_236 {
    public static void main(String[] args) {
        FruitBox<Fruit> f1 = new FruitBox<Fruit>();
        FruitBox<Apple> f2 = new FruitBox<Apple>();
        FruitBox<Grape> f3 = new FruitBox<Grape>();
        f1.add(new Apple());
        f1.add(new Grape());
        f1.add(new Fruit());
        f2.add(new Apple());
        f3.add(new Grape());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}

class FruitBox<T extends Fruit & Eatable> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int index) {return list.get(index);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}

