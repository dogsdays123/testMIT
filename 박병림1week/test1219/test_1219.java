package test1219;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test_1219 {
    List<Tv> list = new ArrayList<Tv>();
    List<Tv> list2 = new LinkedList<Tv>();
}

class Tv {
    String name;
    String id;
    Tv(String name, String id) {}
}