package test1224;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class test14_1 {
    static void execute(MyFunction f) {
        f.run();
    };

    static MyFunction getMyFunction() {
        MyFunction f3 = () -> System.out.println("f3");
        return f3;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1");

        MyFunction f2 = new MyFunction() {
            public void run() {
                System.out.println("f2");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run"));
    }
}
