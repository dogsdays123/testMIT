package baseball;

import java.util.Arrays;
import java.util.stream.Stream;

public class mainBase {
    public static void main(String[] args) {
        int[] inputNumbers = new int[args.length];

        for(int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);
        }

        int[] checks = con1_Base.randomBall(inputNumbers);

        System.out.println("스트라이크 : " + checks[0] + " / 볼 : " + checks[1]);

        //연습용
        Stream.of(
                        new Person("Alice", 30),
                        new Person("Bob", 25),
                        new Person("Alice", 30), // 중복 객체
                        new Person("Charlie", 35)
                )
                .distinct()
                .forEach(System.out::println); // 출력: Alice: 30, Bob: 25, Charlie: 35
    }
}
