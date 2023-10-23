package main.java.vom.ohgiraffers.section04.quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean AnsIsTrue = false;

        System.out.println("1~100사이의 정수를 입력하시오");
        int randomNo = random.nextInt(99)+1;
        int GuessNo = sc.nextInt();
        if(AnsIsTrue == false){
            UpDownGame.GameStart(randomNo, GuessNo);

        }else{
            System.out.println("정답입니다.");
            AnsIsTrue = true;
        }
    }

    public static void GameStart(int a, int b){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        if(a>b){
            System.out.println("틀렸습니다. UP입니다");
            System.out.println("숫자를 다시 입력해주세요");
            b = sc.nextInt();
            UpDownGame.GameStart(a,b);
        }else if(a<b){
            System.out.println("틀렸습니다. DOWN입니다");
            System.out.println("숫자를 다시 입력해주세요");
            b = sc.nextInt();
            UpDownGame.GameStart(a,b);
        }else{
            System.out.println("정답입니다.");

        }
    }


}
