package main.java.com.ohgiraffers.section02.quiz;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
//     2팀 문제 : up down 게임 만들기
    // 랜덤으로 생성된 수를 맞추는 게임입니다.
    // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
    // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
    // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
    // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

    // 조건문과 반복문을 사용하세요.
    public static void main(String[] args) {
        RandomGame app = new RandomGame();
        app.randomGame();
    }
    public void randomGame(){
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("랜덤으로 생성하는 수의 범위는 1~50 입니다.");
        int RandomNo = ra.nextInt(50);
        System.out.println("수를 선택하시오:");
        int GuessNo = sc.nextInt();

        while(true){
            if(RandomNo>GuessNo){
                System.out.println("틀렸습니다. UP입니다");
                System.out.println("숫자를 다시 입력해주세요");
                GuessNo = sc.nextInt();
            }else if(RandomNo<GuessNo){
                System.out.println("틀렸습니다. DOWN입니다");
                System.out.println("숫자를 다시 입력해주세요");
                GuessNo = sc.nextInt();
            }else{
                System.out.println("정답입니다.");
                break;

            }
        }

    }


}
