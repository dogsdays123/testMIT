package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileStream {
    public static void main(String[] args) throws IOException {
        String path = "sample.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            reader.lines()
                    .filter(line -> line.length() > 10)  // 10자 이상인 줄만 필터링
                    .forEach(System.out::println);  // 결과 출력 
        }
    }
}
