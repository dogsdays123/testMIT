package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_1 {
    static int border;
    static int[] holePoint;
    static int[] saveAnswer;
    static int index;
    static int[] check;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        border = Integer.parseInt(sc.next());
        saveAnswer = new int[border];
        check = new int[border];
        holePoint = new int[border * border];
        Arrays.fill(holePoint, 0);

        //정답 만들기
        for (int i = 0; i < border; i++) {
            check[i] = (int) (Math.random() * (holePoint.length)) + 1;
            for (int j = 0; j < i; j++) {
                if (check[i] == check[j]) {
                    i--;
                }
            }
        }
        //실행
        MakeArray();
    }

    public static void MakeArray() {
        if(!flag && index == 0){MakeBorderBox(0);}
        int answer = 0;
        Scanner clickOnPoint = new Scanner(System.in);
        answer = Integer.parseInt(clickOnPoint.next());
        //정답 다 찾으면 멈추기
        if (index == border) {
            return;
        }

        //정답 맞춤
        if (holePoint[answer - 1] == 1) {
            index++;
            saveAnswer[index] = answer;
            System.out.println("정답이다 연금술사.");
            MakeBorderBox(1);
            MakeArray();
        }
        //정답 틀림
        else {
            flag = true;
            System.out.println("틀렸다.");
            MakeBorderBox(1);
            MakeArray();
        }
    }

    static void MakeBorderBox(int x) {
        //위에거
        for (int i = 0; i < border + 1; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.print("1");

        switch (x) {
            case 0: gogo1();
                break;
            case 1: gogo2();
                break;
        }
    }

    static void gogo1() {
        //본문
        boolean checkX = false;
        for (int i = 1; i < holePoint.length + 1; i++) {
            checkX = false;
            for (int j = 0; j < border; j++) {
                if (i == check[j]) {
                    checkX = true;
                    holePoint[i-1] = 1;
                }
            }
            if ((i % (border) == 0)) {
                if (checkX) {
                    System.out.println("0");
                } else {
                    System.out.println("0");
                }
                if (i == holePoint.length) {
                    break;
                }
                if (i > border-1) {
                    System.out.print((i / border) + 1);
                }
            } else {
                if (checkX) {
                    System.out.print("0");
                } else {
                    System.out.print("0");
                }
            }
        }
        System.out.print("\n\n");
        System.out.print(Arrays.toString(check) + " ");
    }

    static void gogo2() {
        //본문
        boolean checkX = false;
        for (int i = 1; i < holePoint.length + 1; i++) {
            checkX = false;
            for (int j = 0; j < border; j++) {
                if (i == saveAnswer[j]) {
                    checkX = true;
                }
            }
            if ((i % (border) == 0)) {
                if (checkX) {
                    System.out.println("\u220E");
                } else {
                    System.out.println("0");
                }
                if (i == holePoint.length) {
                    break;
                }
                if (i > border-1) {
                    System.out.print((i / border) + 1);
                }
            } else {
                if (checkX) {
                    System.out.print("\u220E");
                } else {
                    System.out.print("0");
                }
            }
        }
        System.out.print("\n");
        System.out.print(Arrays.toString(check) + " ");
    }
}
