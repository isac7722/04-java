package loginAlgorithm;

import java.util.Scanner;

public class Applicaiton {
    // 1. 회원가입 (done)
    // id
    // pw1
    // pw2
    // (pw1 == pw2) : 회원가입 완료
    // (pw1 != pw2) : 비밀번호를 다시 입력해주세요

    // 2. 로그인
    //      회원가입 후 로그인
    //       - 로그인시 id가 없다면 "없는 회원입니다. 회원가입을 먼저 해주세요"
    //       - 비밀번호가 틀릴시 "비밀번호가 틀렸습니다."

    // 9. 프로그램 종료

    public static void main(String[] args) {

        Menu.menu();

    }
}
