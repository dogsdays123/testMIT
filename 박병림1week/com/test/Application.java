package com.test;

import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.*;
import java.text.*;

// << 비트연산자 c = 2 일때 c <<= 3 을 하면 c * 2^3의 식이 됨.
// ^= 베타적 or 연산자. 각 식이 같으면 0 다르면 1을 결과.
// string의 경우 String s1 = "123"; 선언했을 경우, "123"이라는 주소에 저장됨
// String s2 = new String("123"); 의 경우 새로운 주소로 "123"을 저장함
//그래서 s2 == "123"이 아님 s2.equals("123")이 맞음
//String 관련 비교연산에서 고차원(2, 3차원) 배열의 비교는 deepToString / deepEquals 를 사용한다.
//int[] arr2 = Arrays.copyOf(arr, arr.length) 를 주면 (배열이름, 원하는 길이) 를 카피한다.
//int[] arr3 = Arrays.copyOfRange(arr, 2, 4) 를 주면 (배열이름, 시작길이, 끝길이) 를 카피한다.
//Arrays.sort(arr) 배열을 정렬한다. 순서대로
//public, private ==
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
        // ex_20();
        // ex_21();
        // ex_22();
        // ex_23();
        // ex_24();
        // ex_25();
        // ex_26();
        // ex_27();
        //ex_28();
        // ex_29();
        // ex_30();
        //ex_31();
        //ex_32();
        //ex_33();
        //System.out.println(ex_34());
        //ex_35();
//        ex_36();
//        ex_37(args);
//        ex_38(args);
//          ex_39();
        ex_40();
    }

    public static String ex() {
        int num1 = 100 - 32;
        double num2 = 5d / 9d * num1;
        return "" + Math.round(num2 * 100) / 100d;
    }

    public static String ex_4() {
        int x = 0;
        int z = 0;
        int percent = 1000;
        while (x < percent) {
            x++;
            int c = (int) (Math.random() * percent);
            if (c % 3 == 0 && c % 2 == 0 && c % 7 != 0) {
                z++;
            }
        }
        return "통과의 확률은 : " + ((z / 10) % 100) + "입니다.";
    }

    public static String ex_5() {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.println("문자를 입력하세요 >");
        String input = scanner.nextLine();
        scanner.close();
        ch = input.charAt(0);
        String answer = "";
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
        for (; ; ) {
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
        Seungwon1:
        for (int i = 0; i < 10; i++) {
            Seungwon2:
            for (int j = 0; j < 5; j++) {
                System.out.printf("i = %d, j = %d%n", i, j);
                if (i == 5 && j == 3) {
                    System.out.print("이게멈추네 ㅋㅋ");
                    break Seungwon1;
                }
            }
        }
    }

    public static void ex_18() {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        outer:
        while (true) {
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
                second_outer:
                for (; ; ) {
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
                System.out.print("잘못된 값입니다. 다시 선택해주세요.");
            }
        }
    }

    public static void ex_19() {
        System.out.print("아무키나 눌러서 주사위를 던져!");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int[] i = new int[2];
        if (tmp != null) {
            frist:
            for (int z = 0; ; ++z) {
                i[0] = (int) (Math.random() * 6) + 1;
                i[1] = (int) (Math.random() * 6) + 1;
                if (i[0] + i[1] == 6) {
                    z++;
                    System.out.printf("성공!%n");
                    System.out.printf("%d", z);
                    break;
                }
                System.out.print("실패!");
            }
        }
    }

    public static void ex_20() {
        int[] score = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String test = score.length + "";
        System.out.println(test);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        String[] ch = {"hi", "bye", "Hello"};
        System.out.println(ch[0]);

        System.out.println(Arrays.toString(score));
    }

    public static void ex_21() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 5;
        int b = 1;
        while (a >= 0) {
            while (b <= a) {
                b++;
                System.out.print("*");
            }
            a--;
            b = 1;
            System.out.println();
        }

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < (3 - i); ++j) {
                System.out.printf(" ");
            }
            for (int k = 0; k < ((2 * i) + 1); ++k) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");

        for (int i = 3; i >= 0; --i) {
            for (int j = 0; j < (3 - i); ++j) {
                System.out.printf(" ");
            }
            for (int k = 0; k < ((2 * i) + 1); ++k) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < (3 - i); ++j) {
                System.out.printf(" ");
            }
            for (int k = 0; k < ((2 * i) + 1); ++k) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        for (int i = 2; i >= 0; --i) {
            for (int j = 0; j < (3 - i); ++j) {
                System.out.printf(" ");
            }
            for (int k = 0; k < ((2 * i) + 1); ++k) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
    }

    public static void ex_22() {
        char[] a = {' ', '*'};
        for (int i = 0; i < 5; ++i) {
            if (i > 2) {
                for (int j = 0; j < (i - 1); ++j) {
                    System.out.print(a[0]);
                }
                for (int k = 0; k < i; ++k) {
                    System.out.print(a[1]);
                }
            } else {
                for (int j = 0; j < (3 - i); ++j) {
                    System.out.print(a[0]);
                }
                for (int k = 0; k < (i * 2 + 1); ++k) {
                    System.out.print(a[1]);
                }
            }
            System.out.printf("%n");
        }
    }

    public static void ex_23() {
        int sum = 0;
        float average = 0f;
        int[] goal = {100, 80, 45, 65};
        for (int i = 0; i < goal.length; i++) {
            sum += goal[i];
        }
        average = sum / (float) goal.length;
        System.out.println(sum);
        System.out.print(average);
    }

    public static void ex_24() {
        int[] goal = {100, 80, 45, 65};
        int max = goal[0];
        int min = goal[0];
        for (int i = 0; i < goal.length; i++) {
            if (goal[i] >= max) {
                max = goal[i];
            }
            if (goal[i] <= min) {
                min = goal[i];
            }
        }
        System.out.printf("max = %d%nmin = %d", max, min);
    }

    public static void ex_25() {
        int[] g = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = g[0];
            g[0] = g[n];
            g[n] = tmp;
        }
        System.out.print(Arrays.toString(g));
    }

    public static void ex_26() {
        int[] g = new int[45];
        for (int i = 0; i < g.length; i++) {
            g[i] = i + 1;
        }
        int n = 0;
        int tmp = 0;
        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 45);
            tmp = g[i];
            g[i] = g[n];
            g[n] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(g[i]);
        }
    }

    public static void ex_27() {
        String[] names = new String[]{"Kim", "Ko", "kar"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }
        names[0] = "Yu";
        System.out.println("names[" + 0 + "]:" + names[0]);
    }

    public static void ex_28() {
        String str = new String("abcdef");
        if (str.substring(1, 3).equals("bc")) {
            System.out.println("ㅈ정답");
        }
    }

    public static void ex_29() {
        int[][] score = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int sum = 0;
        System.out.println(score.length);
        System.out.println(score[0].length);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.printf("%n sum = %d", sum);
    }

    public static void ex_30() {
        int[][] score = new int[][]{
                {10, 10, 10},
                {5, 5, 5},
                {3, 3, 3},
                {1, 1, 1}};
        int kototal = 0;
        int entotal = 0;
        int mathtotal = 0;
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            kototal += score[i][0];
            entotal += score[i][1];
            mathtotal += score[i][2];
            System.out.printf("%3d", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=========================");
    }

    public static void ex_31() {
        String[][] words = new String[][]{
                {"chair", "1"},
                {"computer", "2"},
                {"integer", "3"},
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("%d. %s의 뜻은?", i + 1, words[i][0]);
            String tmp = sc.nextLine();
            if (tmp.equals(words[i][1])) {
                System.out.println("정답");
            } else {
                System.out.printf("오답. 정답은 %3s 입니다.", words[i][1]);
            }
        }
    }

    public static void ex_32() {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        String[][] b = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}};
        String[][] c = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}};
        System.out.println(Arrays.equals(b, c));
        System.out.println(Arrays.deepEquals(b, c));
    }

    public static void ex_33() {
        int size = 6;
        int num = 1;
        for (int i = 0; i < (size / 2) + 1; i++) {
            String str1 = "";
            String str2 = "";
            for (int j = 0; j < (size / 2) + 1 - i; j++) {
                str1 += " ";
            }
            for (int j = 0; j < num; j++) {
                str2 += "*";
            }
            System.out.println(str1 + str2);
            num += 2;
        }
    }

    public static int ex_34() {
        int total_usage = 0;
        int storage = 5141;
        int usage = 500;
        int[] change = new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        for (int i = 0; i < change.length; i++) {
            usage = usage + usage * change[i] / 100;
            System.out.println(usage);
            total_usage += usage;
            System.out.println(total_usage);
            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }

    public static void ex_35() {
        int lower = 10;
        int[] a = {2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            lower = Math.min(a[i], lower);
            System.out.println(lower);
        }
    }

    public static void ex_36() {
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
//
//        System.out.println(String.valueOf(c));
        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 3, 29);
        System.out.println(toString(c1));
        c1.add(Calendar.DATE, 40);
        System.out.println(toString(c1));
    }

    private static String toString(Calendar c) {
        return c.get(Calendar.YEAR) + "sis " + (c.get(Calendar.MONTH) + 1) + "dnjf " + c.get(Calendar.DATE) + "dlf";
    }

    public static void ex_37(String[] arg) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));
        int today = 0;
        int lastday = 0;
        int year = Integer.parseInt(arg[0]);
        int month = Integer.parseInt(arg[1]);
        c1.set(year, month - 1, 1);
        c2.set(year, month, 1);
        c2.add(Calendar.DATE, -1);
        today = c1.get(Calendar.DAY_OF_WEEK);
        lastday = c2.get(Calendar.DATE);
        System.out.println("      " + arg[0] + "년 " + arg[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");
        for (int i = 1; i < today; i++) {
            System.out.print("   ");
        }
        int n = today;
        for (int i = 1; i <= lastday; i++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) System.out.println();
            n++;
        }
    }

    public static void ex_38(String[] args) {

        DateFormat df3 = new SimpleDateFormat("yyyy참MM참dd참");
        DateFormat df4 = new SimpleDateFormat("yyyy--MM--dd");
        try {
            Date d = df3.parse(args[0]);
            System.out.println(df4.format(d));
        } catch (Exception e) {
        }
    }

    public static void ex_39() {
        Date d = null;
        String pattern = "yyMMdd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 " + pattern + " 형식으로 작성하세요.");
        while (sc.hasNext()) {
            try {
                d = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("생년월일을 " + pattern + "형식으로 다시 작성하세요.");
            }
        }
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d);
        Calendar today = Calendar.getInstance();
        long day = ((today.getTimeInMillis() - c1.getTimeInMillis()) / (24 * 60 * 60 * 1000)) / (365);
        System.out.println(day + "만큼 살았네");

    }

    public static void ex_40() {
        Calendar time = Calendar.getInstance();
        Date d = new Date();
        String pattern = "yy";
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat(pattern);
        System.out.println("년도를 " + pattern + " 형식으로 작성하세요.");
        //년도만 작성하면 문제없는데, 월/일 까지 작성하면 똑같은 패턴만 반복됨 문제있음
        while (sc.hasNext()) {
            try {
                d = df.parse(sc.nextLine());
                System.out.println(d);
                break;
            } catch (Exception e) {
                System.out.println("년도를 " + pattern + "형식으로 다시 작성하세요.");
            }
        }
        time.setTime(d);

        for (int i = 0; i < 12; i++) {
            // 1일의 요일을 구한다.
            // EX) 7 = 토요일, 1 = 일요일
            int weekDay = time.get(Calendar.DAY_OF_WEEK);

            // 둘째주 일요을 찾는다.
            if (weekDay == 1) {
                time.set(Calendar.DAY_OF_MONTH, 8);
            } else {
                time.set(Calendar.DAY_OF_MONTH, 16 - weekDay);
            }

            // Data로 형식을 바꿔준다.
            Date date = time.getTime();

            // 출력
            System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일 입니다.").format(date));

            // 월을 더해주고, 일을 1일로 초기화 한다.
            time.add(Calendar.MONTH, 1);
            time.set(Calendar.DAY_OF_MONTH, 1);
        }
    }

    public static void ex_41() {
        
    }
}
