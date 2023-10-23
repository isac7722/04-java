package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class quiz02 {

//    3팀
//<백준 문제>
//    백준 조건문 7단계 문제 일부 수정

/*
3개의 주사위를 던져서 상금을 받는 게임 프로그램을 제작한다.

3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
모두 다른 숫자의 눈이라면 “꽝”을 출력한다.

게임 프로그램을 작성하시오.

1. if 조건문을 1회 이상 사용해야 한다.
2. 입력한 내용이 ‘굴리기’가 아니라면 다음과 같이 실행한다.
System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
3. 6면체 주사위 코드는 다음과 같다.
return (int) (Math.random() * 6) + 1;

[출력 내용 예시 (주사위 숫자가 모두 다른 경우)]
===주사위 게임을 시작합니다.===
첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
첫 번째 주사위: 3
두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
두 번째 주사위: 4
세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
세 번째 주사위: 2
꽝!

*/

//==================================================
//        3팀 문제
//
//    첫째 줄에는 별 1개, 둘째 줄에는 2개 ….. N번째 줄에는 별 N개를 찍는 프로그램이다.
//    N의 범위는 0 < N < 50이며, 범위를 벗어나는 숫자를 입력하면 각각의 범위를 벗어나는 숫자를 입력하면 다시 입력하라는 안내와 함께 숫자를 다시 입력해야한다.
//
//    별을 출력한 이후에는 종료하시겠냐는 질문이 나오고 yes를 입력하면 그대로 프로그램 종료, no를 입력하면 새로운 숫자를 입력하라는 멘트가 나오며 프로그램이 계속된다
//
//    별 출력 예시
//    ex> N 값에 4 입력
//      *
//              **
//              ***
//              ****


    public static void main(String[] args) {

        //별을 입력받는다
        // 범위 50
        //숫자를 벗어나면 다시 입력하세요
        // 별을 출력 이후에는 종료? 물어본다/ yes를 입력하면 종료. no를 입력하면 새로운 숫자를 입력

        Scanner sc = new Scanner(System.in);
        System.out.println("별을 입력 받고 출력해주는 프로그램입니다.");

        while (true){
            System.out.println("별의 갯수를 입력해주세요");
            int noStar = sc.nextInt();
            while(noStar>50 || noStar<0){
                System.out.println("별의 갯수를 다시 입력해주세요: ");
                noStar = sc.nextInt();
            }
            String star = "";
            for (int i = 0; i < noStar; i++) {
                star += "*";
                System.out.println(star);
            }

            String yesOrNo = " ";
            System.out.println("종료하시겠습니까? y / n");
            yesOrNo = sc.next();

            if (yesOrNo .equals("n") ) {
                continue;
            }else{
                System.out.println("감사합니다. 안녕히 가세요~");
                return;
            }
        }


    }


}
