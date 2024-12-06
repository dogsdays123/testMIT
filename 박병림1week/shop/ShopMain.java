package shop;
import java.util.Scanner;

public class ShopMain implements View {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        controller c = new controller();
    }

    @Override
    public String mainView() {
        return "";
    }

    public void errorOnShopMain(int error, boolean error2) {
        switch (error) {
            case 1:
                System.out.println(MSG_FAIL_LOGIN);
                if (error2) {
                    System.out.println(MSG_DUPLICATE_ID);
                }
                break;
            case 2:
                System.out.println(MSG_IS_FULL);
        }
    }
}


