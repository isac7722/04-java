package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요

        Scanner sc = new Scanner(System.in);
        double[] javaNum = new double[5];
        double sum = 0;

        for(int i =0; i< javaNum.length; i++){
            System.out.println(i+1+"번째 사람의 점수를 입력하세요: ");
            javaNum[i] = sc.nextInt();
            sum += javaNum[i];
        }
        System.out.println("5명의 자바 점수 합계는 "+sum+"점이고, \n 평균점수는 "+(sum/5)+"입니다.");

        //1. 5명의 학생의 자바 정수를 입력 받는다.


    }
}
