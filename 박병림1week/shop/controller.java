package shop;

import java.util.*;

class controller implements View {
    CustomerMember cusMem;
    EmployeeMember empMem;
    Set HashMember = new HashSet();
    List<CustomerMember> cusMemList = new ArrayList();
    List<EmployeeMember> empMemList = new LinkedList();

    public controller() {
        join();
    }

    @Override
    public String mainView() {
        return "";
    }

    void join() {
        String[] memberIndex = new String[4];
        System.out.println("1.로그인 2.신규회원 3.프로그램종료");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals("1")) {
            login();
        } else if (input.equals("2")) {
            register(memberIndex);
        } else if (input.equals("3")) {
            System.out.println("시스템종료.");
            return;
        } else {
            System.out.println(MSG_WRONG);
            join();
            return;
        }
    }

    void login() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println(TITLE_MAIN02);
        System.out.println("고객이면 1번, 직원이면 2번. 메인으로 나가려면 3번을 적어주세요.");
        String[] loginIndex = new String[2];
        int category = sc2.nextInt();

        if (category != 1 && category != 2) {
            if (category == 3) {
                join();
                return;
            }
            errorOnController("입력오류");
            login();
            return;
        }

        System.out.println(MSG_INPUT_ID);
        loginIndex[0] = sc2.next();
        System.out.println(MSG_INPUT_PW);
        loginIndex[1] = sc2.next();
        loginSave(loginIndex, category);
    }

    void loginSave(String[] index, int c) {
        if ((c == 1) && !cusMemList.isEmpty()) {
            for (int i = 0; i < cusMemList.size(); i++) {
                CustomerMember a = cusMemList.get(i);
                if ((a.getId().equals(index[0])) && (a.getPw().equals(index[1]))) {
                    System.out.println("로그인 성공! 환영합니다 고객님!");
                    Menu(i, c);
                    return;
                } else if ((a.getId().equals(index[0])) && !(a.getPw().equals(index[1]))) {
                    errorOnController("비밀번호오류");
                    login();
                    return;
                } else {
                    errorOnController("아이디오류");
                    login();
                    return;
                }
            }
        }
        if ((c == 2) && !empMemList.isEmpty()) {
            for (int i = 0; i < empMemList.size(); i++) {
                EmployeeMember b = empMemList.get(i);
                if ((b.getId().equals(index[0])) && (b.getPw().equals(index[1]))) {
                    System.out.println("로그인 성공! 환영합니다!");
                    Menu(i, c);
                    return;
                } else if ((b.getId().equals(index[0])) && !(b.getPw().equals(index[1]))) {
                    errorOnController("비밀번호오류");
                    login();
                    return;
                } else {
                    errorOnController("아이디오류");
                    login();
                    return;
                }
            }
        }
        errorOnController("아이디오류");
        join();
    }

    void register(String[] member) {
        System.out.println("고객이면 1번, 직원이면 2번을 적어주세요.");
        Scanner sc2 = new Scanner(System.in);
        int check = Integer.parseInt(sc2.next());

        if ((check != 1) && (check != 2)) {
            errorOnController("입력오류");
            register(member);
            return;
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
        MemberSave ms = new MemberSave(member[0], member[1], member[2], member[3]);

        if (check == 1) {
            cusMem = new CustomerMember(ms);
            cusMemList.add(cusMem);
            if(cusMem.addAddress()){
                join();
                return;
            };
            cusMem.prt();
            join();
            return;
        } else {
            empMem = new EmployeeMember(ms);
            empMemList.add(empMem);
            if(empMem.addAddress()){
                join();
                return;
            };
            empMem.prt();
            join();
            return;
        }
    }

    public void Menu(int z, int c) {
        Scanner sc3 = new Scanner(System.in);
        int menuindex = 0;
        System.out.println("메뉴를 선택해 주세요.");
        System.out.printf("1. 회원정보 수정%n2. 회원탈퇴%n3. 로그아웃%n");
        menuindex = Integer.parseInt(sc3.next());

        if (c == 1) {
            Scanner sc4 = new Scanner(System.in);
            if (menuindex == 1) {
                System.out.println("수정할 정보를 선택하세요.");
                System.out.printf("1. 아이디%n2. 비밀번호%n3. 이름%n4. 전화번호%n5. 상위메뉴로 이동%n");
                switch (sc4.nextInt()) {
                    case 1:
                        System.out.println("수정할 아이디를 적어주세요.");
                        String id = sc3.next();
                        System.out.println("정말로 수정하시겠습니까? yes 를 입력하면 수정합니다.");
                        if (!sc4.next().equals("yes")) {
                            System.out.printf("메뉴로 돌아갑니다.%n");
                            Menu(z, c);
                        } else {
                            cusMemList.get(z).setId(id);
                            System.out.printf("아이디가 수정되었습니다.%n");
                            Menu(z, c);
                        }
                        break;
                    case 2:
                        System.out.println("수정할 비밀번호를 적어주세요.");
                        String pw = sc3.next();
                        System.out.println("정말로 수정하시겠습니까? yes 를 입력하면 수정합니다.");
                        if (!sc4.next().equals("yes")) {
                            System.out.printf("메뉴로 돌아갑니다.%n");
                            Menu(z, c);
                        } else {
                            cusMemList.get(z).setPw(pw);
                            System.out.printf("비밀번호가 수정되었습니다.%n");
                            Menu(z, c);
                        }
                        break;
                    case 3:
                        System.out.println("수정할 이름을 적어주세요. (특수문자, 공백없이)");
                        String name = sc3.next();
                        System.out.println("정말로 수정하시겠습니까? yes 를 입력하면 수정합니다.");
                        if (!sc4.next().equals("yes")) {
                            System.out.printf("메뉴로 돌아갑니다.%n");
                            Menu(z, c);
                        } else {
                            cusMemList.get(z).setName(name);
                            System.out.printf("이름이 수정되었습니다.%n");
                            Menu(z, c);
                        }
                        break;
                    case 4:
                        System.out.println("수정할 전화번호를 적어주세요. (-, 공백없이)");
                        String phone = sc3.next();
                        System.out.println("정말로 수정하시겠습니까? yes 를 입력하면 수정합니다.");
                        if (!sc4.next().equals("yes")) {
                            System.out.printf("메뉴로 돌아갑니다.%n");
                            Menu(z, c);
                        } else {
                            cusMemList.get(z).setTel(phone);
                            System.out.printf("전화번호가 수정되었습니다.%n");
                            Menu(z, c);
                        }
                        break;
                    case 5:
                        System.out.printf("메뉴로 돌아갑니다.%n");
                        Menu(z, c);
                        break;
                }
            } else if (menuindex == 2) {
                System.out.println("[" + cusMemList.get(z).getName() + " - 회원탈퇴]");
                System.out.printf("비밀번호를 입력하세요%n");

                if (!sc4.next().equals(cusMemList.get(z).getPw())) {
                    errorOnController("비밀번호오류");
                    Menu(z, c);
                    return; // 비밀번호가 틀리면 더 이상 진행하지 않음
                }
                System.out.printf("비밀번호를 한 번 더 입력하세요.%n");
                if (!sc4.next().equals(cusMemList.get(z).getPw())) {
                    errorOnController("비밀번호오류");
                    Menu(z, c);
                    return; // 두 번째 비밀번호가 틀리면 더 이상 진행하지 않음
                }
                System.out.printf("정말로 탈퇴하시겠습니까? yes 를 입력하면 탈퇴합니다.%n");
                if (!sc4.next().equals("yes")) {
                    System.out.printf("메뉴로 돌아갑니다.%n");
                    Menu(z, c);
                    return; // "yes"가 아니면 탈퇴하지 않음
                }
                cusMemList.remove(z);
                System.out.printf("정상적으로 탈퇴되었습니다.%n");
                join();
                return;
            } else if (menuindex == 3) {
                System.out.printf("로그아웃 하시겠습니까? yes / no%n");
                if (sc3.next().equals("yes")) {
                    join();
                    return;
                } else if (sc3.next().equals("no")) {
                    Menu(z, c);
                    return;
                } else {
                    errorOnController("입력오류");
                    Menu(z, c);
                    return;
                }
            }
        } else if (c == 2) {
            Scanner sc4 = new Scanner(System.in);
            if (menuindex == 1) {
                System.out.println("수정할 정보를 선택하세요.");
                System.out.printf("1. 아이디%n2. 비밀번호%n3. 이름%n4. 전화번호%n5. 상위메뉴로 이동");
            } else if (menuindex == 2) {
                System.out.println("[" + empMemList.get(z).getName() + " - 회원탈퇴]");
                System.out.printf("비밀번호를 입력하세요%n");

                if (!sc4.next().equals(empMemList.get(z).getPw())) {
                    errorOnController("비밀번호오류");
                    Menu(z, c);
                    return; // 비밀번호가 틀리면 더 이상 진행하지 않음
                }
                System.out.printf("비밀번호를 한 번 더 입력하세요.%n");
                if (!sc4.next().equals(empMemList.get(z).getPw())) {
                    errorOnController("비밀번호오류");
                    Menu(z, c);
                    return; // 두 번째 비밀번호가 틀리면 더 이상 진행하지 않음
                }
                System.out.printf("정말로 탈퇴하시겠습니까?.%n");
                if (!sc4.next().equals("yes")) {
                    System.out.printf("메뉴로 돌아갑니다.%n");
                    Menu(z, c);
                    return; // "yes"가 아니면 탈퇴하지 않음
                }
                empMemList.remove(z);
                System.out.printf("정상적으로 탈퇴되었습니다.%n");
                Menu(z, c);
                return;
            } else if (menuindex == 3) {
                System.out.printf("로그아웃 하시겠습니까? yes / no%n");
                if (sc3.next().equals("yes")) {
                    join();
                    return;
                } else if (sc3.next().equals("no")) {
                    Menu(z, c);
                    return;
                } else {
                    errorOnController("입력오류");
                    Menu(z, c);
                    return;
                }
            }
        }
    }

    public void errorOnController(String error) {
        switch (error) {
            case "입력오류":
                System.out.println(MSG_WRONG);
                break;
            case "비밀번호오류":
                System.out.println(PW_WRONG);
                break;
            case "아이디오류":
                System.out.println(ID_WRONG);
                break;
        }
    }
}

class MemberSave {
    String id;
    String password;
    String name;
    String phone;

    public MemberSave(String id, String password, String name, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }
}
