package loginAlgorithm;

import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Regis_Login regisLogin = new Regis_Login();

        log1: while(true){
            System.out.println("1. 회원가입     2. 로그인     3. 가입한 회원목록     9. 프로그램 종료하기");
            int choice = sc.nextInt();

            switch (choice){
                case 1 : regisLogin.register(sc); break;
                case 2 : regisLogin.login(sc); break;
                case 3 : UserDatabase.allUserData(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    break log1;
                default:
                    System.out.println("입력하신 번호가 맞지 않습니다. 다시 입력해주세요.");
                    continue ;

            }
        }

    }
}
