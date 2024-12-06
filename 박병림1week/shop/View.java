package shop;

    public interface View {
        final String TITLE_MAIN01 = "[회원가입]";
        final String TITLE_MAIN02 = "[로그인]";
        final String TITLE_MAIN03 = "[프로그램 종료]";
        final String TITLE_SUB02 = "[회원탈퇴]";
        final String TITLE_SUB03 = "[로그아웃]";
        final String MSG_INPUT_ID = "아이디를 입력하세요.";
        final String MSG_INPUT_PW = "비밀번호 입력하세요.";
        final String MSG_INPUT_ENROLL = "회원가입을 시작합니다.";
        final String MSG_INPUT_NAME = "이름을 입력하세요.";
        final String MSG_INPUT_TEL = "전화번호를 입력하세요.";
        final String MSG_SUCCESS_LOGIN = "로그인에 성공했습니다.";
        final String MSG_SUCCESS_ENROLL = "회원가입에 성공했습니다.";
        final String MSG_FAIL_LOGIN = "로그인에 실패했습니다.";
        final String MSG_MOVE_UPPER = "상위 메뉴로 이동합니다.";
        final String MSG_LOGOUT_CONFIRM = "로그아웃 하시겠습니까?";
        final String MSG_LOGOUT = "로그아웃 되었습니다.";
        final String MSG_CLOSE_CONFIRM = "프로그램을 종료하시겠습니까?";
        final String MSG_WITHDRAW_CONFIRM = "회원을 탈퇴하시겠습니까?";
        final String MSG_WITHDRAW = "탈퇴 처리되었습니다.";
        final String MSG_CLOSE = "프로그램을 종료합니다.";
        final String MSG_MODIFY_ID = "아이디가 수정되었습니다.";
        final String MSG_MODIFY_PW = "비밀번호가 수정되었습니다.";
        final String MSG_MODIFY_NAME = "이름이 수정되었습니다.";
        final String MSG_MODIFY_TEL = "전화번호가 수정되었습니다.";
        final String MSG_WRONG = "잘못 입력했습니다.";
        final String MSG_DUPLICATE_ID = "중복된 아이디가 있습니다.";
        final String MSG_IS_FULL = "회원수가 채워져서 더 이상 가입을 할 수 없습니다.";
        abstract String mainView(); }
