package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;


public class quiz {


    //실행창
    public static void main(String[] args) {
//        quiz app = new quiz();
//        app.VendingMachine();

    }





    // 자판기
    // 사이다 - 500원 / 콜라 - 600원 / 환타 - 700 / 바카스 - 1000원 / 핫식스 - 1500원
    // 원하시는 음료를 선택해 주세요





//    public void VendingMachine() {
//        Scanner scan = new Scanner(System.in);
//
//        int price = 0;
//
//        System.out.println("자판기 입니다. 음료수를 선택해주세요");
//
//        while (true) {
//            System.out.println("사이다-500원  콜라-600원  환타-700원  바카스-1000원  핫식스-1500원");
//            System.out.println("계산을 원하시면 계산을 입력해주세요");
//
//            String product = scan.next();
//
//            switch (product) {
//                case "사이다":
//                    price += 500;
//                    break;
//                case "콜라":
//                    price += 600;
//                    break;
//                case "환타":
//                    price += 700;
//                    break;
//                case "바카스":
//                    price += 1000;
//                    break;
//                case "핫식스":
//                    price += 1500;
//                    break;
//                case "계산":
//                    System.out.println("가격은 " + price + "원 입니다.");
//                    return;
//                default:
//                    System.out.println("잘못된 음료수입니다. 다시 선택해주세요.");
//            }
//        }
//
//    }













    //수업 퀴즈
    public void teacherQuiz() {
        Scanner sc = new Scanner(System.in);
        int dan;

        do {
            System.out.println("본 프로그램은 1단부터 N단까지 출력하는 구구단 프로그램입니다.");
            System.out.println("몇단까지 출력할까요?");

            dan = sc.nextInt();

            for (int i = 1; i <= dan; i++) {
                // 2의 보수는 스킵
                if(i%2 == 0){
                    continue;
                }

                // 10단 이상은 스킵
                if(i > 9){
                    break;
                }

                // 구구단 출력
                System.out.println(i + "단");
                for (int a = 1; a < 10; a++) {
                    System.out.println(i + " X " + a + "= " + a * i);
                }
            }

        } while (false);


    }

}
