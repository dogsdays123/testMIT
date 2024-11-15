import java.util.Scanner;

// << 비트연산자 c = 2 일때 c <<= 3 을 하면 c * 2^3의 식이 됨.
// ^= 베타적 or 연산자. 각 식이 같으면 0 다르면 1을 결과.
// string의 경우 String s1 = "123"; 선언했을 경우, "123"이라는 주소에 저장됨
// String s2 = new String("123"); 의 경우 새로운 주소로 "123"을 저장함
//그래서 s2 == "123"이 아님 s2.equals("123")이 맞음
public class Application {

  public static void main(String[] args) {
    // System.out.println(ex());
    // System.out.println(ex_4());
    // System.out.println(ex_5());
    // System.out.println(ex_6());
    // System.out.println(ex_7());
    // System.out.println(ex_8());
    // ex_9();
    // ex_10();
    // ex_11();
    // ex_12();
    // ex_13();
    // ex_14();
    // ex_15();
    // ex_16();
    // ex_17();
    // ex_18();
    // ex_19();
    ex_20();
  }

  public static String ex() {
    int num1 = 100 - 32;
    double num2 = 5d / 9d * num1;
    return "" + Math.round(num2 * 100) / 100d;
  }

  public static String ex_4() {
    int x = 0;
    int z = 0;
    int persent = 1000;
    while (x < persent) {
      x++;
      int c = (int) (Math.random() * persent);
      if (0 < c || c < 100) {
        if (c % 3 == 0 && c % 2 == 0 && c % 7 != 0) {
          z++;
        }
      }
    }
    String answer = "통과의 확률은 : " + ((z / 10) % 100) + "입니다.";
    return answer;
  }

  public static String ex_5() {
    Scanner scanner = new Scanner(System.in);
    char ch = ' ';
    System.out.println("문자를 입력하세요 >");
    String input = scanner.nextLine();
    ch = input.charAt(0);
    String answer = new String();
    if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
      if ('a' <= ch && ch <= 'z') {
        answer = " < 이건 소문자야";
      } else {
        answer = " < 이건 대문자야";
      }
    } else {
      answer = " < 이건 숫자야";
    }

    return input + answer;
  }

  public static String ex_6() {
    int a = 1, b = 2;
    int c = a < b ? 3 : 6;
    c ^= 3;
    return "" + c;
  }

  public static String ex_7() {
    int a = (int) (Math.random() * 4);
    switch (a) {
      case 1:
        return "1" + a;
      case 2:
        return "2" + a;
      case 3:
        return "3" + a;
      default:
        return "d" + a;
    }
  }

  public static String ex_8() {
    for (;;) {
      int a = (int) (Math.random() * 4);
      if (a == 3) {
        return "" + a;
      }
      System.out.println(a);
    }
  }

  public static void ex_9() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex_10() {
    int i = 1;
    while (i <= 5) {
      i++;
      int j = 1;
      while (j <= 5) {
        j++;
        if (j <= i)
          System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex_11() {
    int i = 0;
    int j = 0;
    while (j < 100) {
      System.out.printf("%d일때 %d%n", i, j);
      j += ++i;
    }
  }

  public static void ex_12() {
    Scanner scanner = new Scanner(System.in);
    String tmp = scanner.nextLine();
    long num = Long.parseLong(tmp);
    long i = 0, j = 0;
    // 1234
    while (num >= 1) {
      i = num % 10;
      j = j + i;
      if (num < 10) {
        System.out.println(j);
        break;
      }
      num /= 10;
    }
  }

  public static void ex_13() {
    long input = 0, answer = 0;
    Scanner scanner = new Scanner(System.in);
    answer = (long) (Math.random() * 100);
    do {
      input = Long.parseLong(scanner.nextLine());
      if (input < answer) {
        System.out.println("정답보다 작습니다.");
      } else {
        System.out.println("정답보다 큽니다.");
      }
    } while (input != answer);
    System.out.println("정답입니다.");
  }

  public static void ex_14() {
    int i = 0, j = 0;
    while (i < 100) {
      j++;
      i += j;
      System.out.println(i);
      if (i > 100) {
        break;
      }
    }
    System.out.println(i);
  }

  public static void ex_15() {
    for (int i = 0; i <= 10; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }

  public static void ex_16() {
    Scanner scanner = new Scanner(System.in);
    long menu = 0, num = 0;

    do {
      System.out.println("원하는 메뉴를 선택하세요.");
      System.out.println("1. 짜장면");
      System.out.println("2. 탕수육");
      System.out.println("3. 짬뽕");
      num = Long.parseLong(scanner.nextLine());
      if (num > 0 && num < 4) {
        System.out.printf("%d 번 메뉴를 선택했습니다.", num);
        break;
      } else {
        System.out.println("해당하는 메뉴는 없습니다. 다시 선택해주세요.");
        continue;
      }
    } while (menu != num);
  }

  public static void ex_17() {
    Seungwon1: for (int i = 0; i < 10; i++) {
      Seungwon2: for (int j = 0; j < 5; j++) {
        System.out.printf("i = %d, j = %d%n", i, j);
        if (i == 5 && j == 3) {
          System.out.printf("이게멈추네 ㅋㅋ");
          break Seungwon1;
        }
      }
    }
  }

  public static void ex_18() {
    int menu = 0, num = 0;
    Scanner scanner = new Scanner(System.in);
    outer: while (true) {
      System.out.println("음식 선택");
      System.out.println("1. 짜장");
      System.out.println("2. 짬뽕");
      System.out.println("3. 탕수육");
      String tmp = scanner.nextLine();
      menu = Integer.parseInt(tmp);

      if (menu == 0) {
        System.out.println("종료");
        break;
      } else if (menu < 4 && menu > 0) {
        System.out.printf("%d 번 음식을 선택%n", menu);
        second_outer: for (;;) {
          System.out.printf("1~98 까지 팁을 선택하세요. (0 종료, 99 계산 취소)%n");
          tmp = scanner.nextLine();
          num = Integer.parseInt(tmp);

          if (num < 99 && num > 0) {
            System.out.printf("%d원 팁 감사합니다.%n", num);
            break outer;
          } else if (num == 0) {
            break outer;
          } else if (num == 99) {
            break second_outer;
          } else {
            System.out.printf("잘못된 선택입니다.%n");
            continue;
          }
        }
      } else {
        System.out.printf("잘못된 값입니다. 다시 선택해주세요.");
      }
    }
  }

  public static void ex_19() {
    System.out.printf("아무키나 눌러서 주사위를 던져!");
    Scanner scanner = new Scanner(System.in);
    String tmp = scanner.nextLine();
    int[] i = new int[2];
    if (tmp != null) {
      frist: for (int z = 0;; ++z) {
        i[0] = (int) (Math.random() * 6) + 1;
        i[1] = (int) (Math.random() * 6) + 1;
        if (i[0] + i[1] == 6) {
          z++;
          System.out.printf("성공!%n");
          System.out.printf("%d", z);
          break;
        }
        System.out.printf("실패!");
      }
    }
  }

  public static void ex_20() {

  }
}
