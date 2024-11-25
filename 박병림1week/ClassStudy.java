public class ClassStudy {
    public static void main(String[] args) {
        Car car = new Car();
        Student student = new Student();
        for(int i =0; i < student.studentIndex[0].length; i++){
            System.out.printf("%10s ", student.studentIndex[0][i]);}

        for (int i = 1; i < (student.studentIndex.length); i++) {
            System.out.printf("%n");
            for (int j = 0; j < student.studentIndex[0].length; j++) {
                System.out.printf("%10s ", student.studentIndex[i][j]);}
            }
        }
    }

class Car {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}

class Student {
    static String[][] studentIndex = {{"type", "mathName", "preview"},
            {"String", "name", "학생이름"},
            {"int", "ban", "반"},
            {"float", "class", "클래스"}};
}