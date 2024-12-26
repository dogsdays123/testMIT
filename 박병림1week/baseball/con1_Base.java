package baseball;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//랜덤생성 / 비교
public class con1_Base {

    public static int[] randomBall(int[] a) {

        IntStream oneS = IntStream.generate(() -> (int)(Math.random() * 10));
        List<Integer> testList = oneS
                .distinct()
                .limit(3)
                .boxed()
                .collect(Collectors.toList());

        testList.forEach(s -> System.out.println(s));

        List<Integer> numberList1 = IntStream.rangeClosed(0, 9)  // 0부터 9까지 숫자 생성
                .boxed()          // IntStream을 Integer로 변환
                .collect(Collectors.toList()); // List로 변환

        Collections.shuffle(numberList1); //컬렉션 섞음
        List<Integer> makeNum = numberList1.subList(0, 3); //3개 뽑음

        List<Integer> inputNum = Arrays.stream(a)   // IntStream 생성
                .boxed()             // Integer로 변환
                .collect(Collectors.toList()); // List로 변환

        System.out.println("당신이 입력한 값" + inputNum);
        System.out.println("만들어진 값" + makeNum);

        int[] check = new int[inputNum.size()];

        for (int i = 0; i < inputNum.size(); i++) {
            if (inputNum.get(i) == makeNum.get(i)) {
                check[0]++;
            }
        }

        HashSet<Integer> set1 = new HashSet<>(inputNum);
        HashSet<Integer> set2 = new HashSet<>(makeNum);
        set1.retainAll(set2); //교집합 찾음

        if (check[0] == 0) {
            check[1] = set1.size();
            check[2] = 3 - check[1];
        } else {
            check[1] = set1.size() - check[0];
            check[2] = 3 - check[1] - check[0];
        }

        return check;
    }
}


//연습용 오버라이딩과 관련하여.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}