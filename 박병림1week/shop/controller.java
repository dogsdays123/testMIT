package shop;

import java.util.Scanner;

class controller implements View {
    CustomerMember cusMem;
    EmployeeMember empMem;

    public controller() {
        join();
    }

    @Override
    public String mainView() {
        return "";
    }

    void join() {
        String[] memberAll = new String[4];
        System.out.println("회원이시면 yes 아니면 no");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals("yes")) {
            login(memberAll);
        } else if (input.equals("no")) {
            register(memberAll);
        } else {
            System.out.println(MSG_WRONG);
        }
    }

    void login(String[] member) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println(TITLE_MAIN02);
        System.out.println(MSG_INPUT_ID);
        member[0] = sc2.next();
        System.out.println(MSG_INPUT_PW);
        member[1] = sc2.next();
    }

    void register(String[] member) {
        System.out.println("고객이면 1번, 직원이면 2번을 적어주세요.");
        Scanner sc2 = new Scanner(System.in);
        int check = Integer.parseInt(sc2.next());
        if ((check != 1) && (check != 2)) {
            errorOnController(1, false);
            register(member);
        }
        System.out.println(MSG_INPUT_ENROLL);
        System.out.println(MSG_INPUT_ID);
        member[0] = sc2.next();
        System.out.println(MSG_INPUT_PW);
        member[1] = sc2.next();
        System.out.println(MSG_INPUT_NAME);
        member[2] = sc2.next();
        System.out.println(MSG_INPUT_TEL);
        member[3] = sc2.next();

        if (check == 1) {
            cusMem = new CustomerMember(member[0], member[1], member[2], member[3]);
            cusMem.addAddress();
            cusMem.prt();
        } else {
            empMem = new EmployeeMember(member[0], member[1], member[2], member[3]);
            empMem.addAddress();
            empMem.prt();
        }
    }

    public void errorOnController(int error, boolean error2) {
        switch (error) {
            case 1:
                System.out.println(MSG_WRONG);
                break;
        }
    }
}