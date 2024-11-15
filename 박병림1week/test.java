
import java.util.Scanner;

class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World."); // println 줄바꿈
        System.out.print("3+5"); // system.out 시스템으로 표현한다
        float f = 0.1f;
        System.out.printf("d=%14.10f", f); // %14.10f 전체자리는 14개까지 소수자리는 10개까지 표현
        int a = 1;
        int b = 1;
        char c = 'c';
        String s = "s";
        System.out.printf("%d %x %f %c %s%n", a, b, f, c, s);
        // (d) 정수(10진법), (x) 16진법, (f) 부동소수점, (c)har 문자, (s)tring 문자열
        System.out.printf("[%.8s]%n", s); // [%.8s] 왼쪽에서 8자리
        float f1 = .10f;
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);

        Scanner scanner = new Scanner(System.in); // 스캐너를 사용하기 위해 설정
        System.out.printf("두자리의 정수 입력");
        String input = scanner.nextLine(); // 스캐너의 인풋값을 받을 스트링
        if (input.charAt(0) == '-') {
            String inputrevert = "";
            inputrevert = input.replace("-", "");
            if (!isNumberic(inputrevert)) {
                System.out.printf("%s 는 숫자가 아닙니다.%n", input);
            } else {
                int num = Integer.parseInt(input); // num이라는 int 변수에 input값을 넣어줌
                if (num >= 100 || num <= 9) {
                    System.out.printf("%d 는 음수입니다.", num);
                    return;
                }
                System.out.printf("%d%n", num);
            }
        } else {
            if (!isNumberic(input)) {
                System.out.printf("%s 는 숫자가 아닙니다.%n", input);
            } else {
                int num = Integer.parseInt(input); // num이라는 int 변수에 input값을 넣어줌
                if (num >= 100 || num <= 9) {
                    System.out.printf("%d는 2자리의 정수가 아닙니다.", num);
                } else {
                    System.out.printf("%d%n", num);
                }
            }
        }
    }

    public static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
