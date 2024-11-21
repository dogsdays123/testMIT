public class ClassStudy {

    public static void main(String[] args) {


//		Quiz 3. 다음의 모양을 출력하세요. (제한 없음)
//		  *
//		 ***
//		*****
//	   *******

        int size = 4; // 피라미드의 높이
        String str1, str2;

        System.out.printf("%" + size + "s%n", "*");

        for (int i = 0; i < size - 1; i++) {
            str1 = str2 = "";
            for (int j = 0; j < i + 1; j++) {
                str1 += "*";
                str2 += "*";
            }
            System.out.printf("%" + (size - 1) + "s / * / %s%n", str1, str2);
        }
    }
}