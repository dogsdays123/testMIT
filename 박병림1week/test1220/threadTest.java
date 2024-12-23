package test1220;

public class threadTest {
    static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        ThreadMan th1 = new ThreadMan();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
            System.out.print("소요시간1:" + (System.currentTimeMillis() - threadTest.startTime));
    }
}

class ThreadMan extends Thread {
    public void run(){
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.print("소요시간2:" + (System.currentTimeMillis() - threadTest.startTime));
    }
}
