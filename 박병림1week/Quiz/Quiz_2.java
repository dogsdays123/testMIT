package Quiz;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Quiz_2 {
    static boolean message;
    static int NumOfStudent;
    static int[] NumOfStudents;

    public static void main(String[] args) {
        if (!message) {
            System.out.println("데이터 분석을 시작합니다.");
            message = true;
        }
        System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
        switch (Error()) {
            case 1:
                System.out.println("학생 수를 입력하세요.(최대10명)");
                Scanner scNum = new Scanner(System.in);
                NumOfStudent = Integer.parseInt(scNum.next());
                if (NumOfStudent < 1 || NumOfStudent > 10) {
                    System.out.println("입력된 값이 잘못되었습니다.");
                    main(args);
                    break;
                } else {
                    System.out.printf("총 학생 수는 %d명 입니다.\n", NumOfStudent);
                    main(args);
                    break;
                }
            case 2:
                if(NumOfStudent < 1){
                    System.out.println("학생 수를 찾을 수 없습니다.");
                    main(args);
                    break;
                }
                System.out.printf("학생 수만큼 점수를 입력하세요. 총 학생 수는%d명 입니다.\n", NumOfStudent);
                System.out.println("예) 60,100,70");
                Scanner scNum2 = new Scanner(System.in);
                String input = scNum2.next();
                String[] str = input.split(",", NumOfStudent);
                NumOfStudents = new int[NumOfStudent];
                System.out.println(Arrays.toString(str));
                if (str.length != NumOfStudent) {
                    System.out.println("학생 수와 맞지 않습니다.");
                    main(args);
                    break;
                }
                for (int i = 0; i < NumOfStudent; i++) {
                    NumOfStudents[i] = Integer.parseInt(str[i]);
                }
                if ((NumOfStudents.length < 1) || (NumOfStudents.length > 10)) {
                    System.out.println("값이 초과하거나 미만입니다.");
                    main(args);
                    break;
                } else {
                    System.out.println("점수가 저장되었습니다.");
                    main(args);
                    break;
                }
            case 3:
                if((NumOfStudents == null) || (NumOfStudents.length < 1)){
                    System.out.println("점수 리스트가 올바르지 않습니다.");
                    main(args);
                    break;
                }
                if (NumOfStudent != NumOfStudents.length) {
                    System.out.println("학생수와 점수 리스트가 알맞지 않습니다.");
                    main(args);
                    break;
                }
                System.out.println("입력된 점수 리스트를 나열합니다.");
                for (int numOfStudent : NumOfStudents) {
                    System.out.printf("[%d] ", numOfStudent);
                }
                System.out.println();
                main(args);
                break;
            case 4:
                if((NumOfStudents == null) || (NumOfStudents.length < 1) || (NumOfStudent < 1)) {
                    System.out.println("앞선 값들을 찾을 수 없습니다.");
                    main(args);
                    break;
                }
                System.out.println("분석을 진행합니다.");
                System.out.println("최고 점수 : " + PointOf()[0]);
                System.out.println("평균 점수 : " + PointOf()[1]);
                main(args);
                break;
            case 5:
                System.out.println("프로그램을 종료합니다.");
                break;
        }
    }

    static int Error() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int returnNum = 0;
        try {
            int choise = Integer.parseInt(input);
            returnNum = choise;
            catchError(choise);
        } catch (Exception e) {
            System.out.println("입력된 값이 잘못되었습니다.");
        }
        return returnNum;
    }

    static void catchError(int errorChoise) throws Exception {
        if ((errorChoise <= 0) || (errorChoise > 5)) {
            throw new Exception();
        }
    }

    static int[] PointOf() {
        int[] Points = new int[2];
        int exPoint = 0;
        for (int i = 0; i < NumOfStudents.length - 1; i++) {
            Points[0] = Math.max(NumOfStudents[i], NumOfStudents[i + 1]);
            exPoint += NumOfStudents[i];
        }
        exPoint += NumOfStudents[NumOfStudent - 1];
        Points[1] = exPoint/NumOfStudent;
        return Points;
    }
}
