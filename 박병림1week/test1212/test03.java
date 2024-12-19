package test1212;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Collections.*;

public class test03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        addAll(list, 1,2,3,4,5);
        System.out.println(list);
        fill(list, 9);
        System.out.println(list);
        List list2 = nCopies(list.size(), list);
        System.out.println(list2);
    }
}
