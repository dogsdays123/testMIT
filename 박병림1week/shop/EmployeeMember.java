package shop;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMember extends Member implements View{
    EmployeeMember(MemberSave member) {
        super(member.id, member.password, member.name, member.phone);
    }

    List<String[]> EmAddList = new ArrayList<String[]>();
    static int error = 0;

    public boolean addAddress() {
        String[] address = {id, pw, name, tel};
        if (EmAddList.size() >= 30) {
            error = 2;
            errorOnCustomer(2, false);
            return true;
        }

        for (String[] strings : EmAddList) {
            if (strings[0].equals(this.getId())) {
                error = 1;
                errorOnCustomer(1, true);
                return true;
            }
        }

        EmAddList.add(address);
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
