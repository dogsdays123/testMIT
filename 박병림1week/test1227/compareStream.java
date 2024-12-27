package test1227;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class compareStream {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("가자바", 2, 210),
                new Student("나자바", 1, 120),
                new Student("다자바", 3, 50)
        );

        Stream<String[]> testString = Stream.of(
                new String[]{"123", "456"},
                new String[]{"abc", "efg"}
        );

        Stream<String> testString2 = testString.flatMap((String[] a) -> Arrays.stream(a));
        Stream<Stream<String>> testString3 = testString.map((String[] a) -> Arrays.stream(a));
        Stream<String> testString4 = testString.flatMap(Arrays::stream);

        studentStream
                .sorted(Comparator.comparing((Student s) -> s.getBan())
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int score;

    Student(String name, int ban, int score) {
        this.name = name;
        this.ban = ban;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, score);
    }

    int getBan() {
        return ban;
    }

    @Override
    public int compareTo(Student s) {
        return s.score - this.score;
    }
}
