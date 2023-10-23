package main.java.com.ohgiraffers.quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz01 {
    // 뽑기 프로그램을 만들어보자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();


        System.out.println("몇명의 사람이 참여합니까?");

        int pplNo = sc.nextInt();

        String namePpl[] = new String[pplNo];

        for (int i = 0; i < namePpl.length; i++) {
            System.out.println(i+1+"번째 참가자의 이름을 입력하세요: ");
            namePpl[i] = sc.next();
        }

        String winner = namePpl[ra.nextInt(pplNo)];
        System.out.println("당첨자는 "+winner+"입니다!!");



    }
}
