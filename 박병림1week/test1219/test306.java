package test1219;

public class test306 {
    public static void main(String[] args) {
        main2(args);
    }
    public static void check ( int[] x, int[] y){
        if (x == y) System.out.print("O");
        else System.out.print("N");
    }
    public static void main2 (String[]args){
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 4};
        int c[] = new int[]{1, 2, 3};
        check(a, b);
        check(b, c);
        check(a, c);
    }
}
