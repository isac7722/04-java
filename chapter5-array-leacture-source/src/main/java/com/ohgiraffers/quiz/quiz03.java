package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class quiz03 {

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

    public static void main(String[] args) {
        System.out.println("======주사위 게임을 시작합니다=======");
        Scanner sc = new Scanner(System.in);

        String roll = "";
        int[] Dice = new int[3];

        while (true) {
            //주사위 굴리기
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + "번째 주사위를 굴립니다. '굴리기'를 입력하세요");
                roll = sc.next();
                if (roll.equals("굴리기")) {
                    Dice[i] = (int) (Math.random() * 6) + 1;
                    System.out.println(i + 1 + "번째 주사위: " + Dice[i]);
                } else {
                    System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다");
                    return;
                }
            }


            //게임 결과
            //3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
            //3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
            //모두 다른 숫자의 눈이라면 “꽝”을 출력한다.
            if (Dice[0] == Dice[1] && Dice[1] == Dice[2]) {
                int prize = 20000 + (Dice[0] * 2000);
                System.out.println(prize + "원의 상금을 받았습니다!");
            } else if (Dice[0] == Dice[1] || Dice[0] == Dice[2] || Dice[1] == Dice[2]) {
                int prize = 1500 + (Dice[0] * 100);
                System.out.println(prize + "원의 상금을 받았습니다");
            } else {
                System.out.println("꽝");
            }
        }
    }
}
