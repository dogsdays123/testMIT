package shop;

import java.util.ArrayList;
import java.util.List;

public class CustomerMember extends Member implements View {
    CustomerMember(MemberSave member) {
        super(member.id, member.password, member.name, member.phone);
    }

    List<String[]> cuAddList = new ArrayList<String[]>();
    static int error = 0;

    public boolean addAddress() {
        String[] address = {id, pw, name, tel};
        if(cuAddList.size() >= 100){
            error = 2;
            errorOnCustomer(2, false);
            return true;
        }

        for (String[] strings : cuAddList) {
            if (strings[0].equals(this.getId())) {
                errorOnCustomer(1, true);
                return true;
            }
        }
        cuAddList.add(address);
        System.out.println(MSG_SUCCESS_ENROLL);
        return false;
    }

    @Override
    public String mainView() {
        return "";
    }

    @Override
    public void prt() {
        super.prt();
    }

    public void errorOnCustomer(int error, boolean error2) {
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
