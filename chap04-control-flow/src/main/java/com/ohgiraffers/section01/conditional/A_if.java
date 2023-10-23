package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public static void main(String[] args) {
        A_if app1 = new A_if();
        app1.testSimpleIfStatement();
    }
    public void testSimpleIfStatement(){
        /*
        * [if문 표현식]
        * if(조건){
        *  조건이 참일 경우 실행할 내용
        * }
        *
        *
        * 조건식이 : 참 혹은 거짓이 나오는 연산식을 조건식이라고 한다.
        * if 문은 조건식의 결과 값이 참이면 {} 안에 있는 코드를 실행하고
        * 조건식의 결과 값이 거짓이면 {} 안의 내용을 무시한다
        *
        * 정수를 한 개 입력받고 그 수가 짝수인지 아닌지 검사하는 프로그램을 만들어 보자
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        int num = sc.nextInt();
        if(num%2 == 0 ){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }else{
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

    }

    public void testNestedIfStatement(){
        /*
        * 중첩된 if 문 실행 흐름 확인
        *
        * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자느 양수이면서 짝수입니다." 라고 출력을 한다.
        * 그외 둘중 하나라도 아니면 프로그램을 종료한다..
        * */


        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 한개를 입력해주세요: ");
        int num = scanner.nextInt();

        //양수인가 확인
        if(num>0){
            System.out.println("양수입니다.");
            //짝수 판단
            if(num%2 == 0){
                System.out.println("입력한 정수는 양수 이면서 짝수 입니다.");
            }else{
                System.out.println("입력한 정수는 양수 이면서 홀수 입니다.");
            }
        }else if(num<0){
            System.out.println("음수입니다.");
        }else{
            System.out.println("0입니다.");
        }

    }
}

