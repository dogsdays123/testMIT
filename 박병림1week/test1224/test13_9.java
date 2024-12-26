package test1224;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class test13_9 {
    public static boolean isValid (String name, Predicate<String> predicate) {
        return predicate.test(name);
    }

    public static void main(String[] args) {
        test13_9.isValid("", (String name) -> !name.isEmpty());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(i);
        }
        arr.forEach(i -> System.out.println(i + "a"));
        Function<String, Integer> fc = Integer::parseInt;
        System.out.println(fc.apply("55").equals("55"));

        String[] strArr = {"aaa", "Bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        //Stream은 1회용이다. 한 번 사용하면 재선언 해야한다.
        Stream<String> str1 = strList.stream();
        str1.sorted().forEach(System.out::println);

        //재선언 했다. strList.stream()
        System.out.println((Arrays.toString(strList.stream().toArray(String[]::new))));
    }
}
