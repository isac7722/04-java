package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class conditional {


    public static void main(String[] args) {
        conditional app1 = new conditional();
        String drink = "";
        drink = app1.testSwitchVendingMachine();
        System.out.println(drink);
    }
    public void testSimpleSwtichStatement(){

        /*
        * [switch 문 표현식]
        * switch(비교할 변수){
        *   case 비교값1 : 비교값 1과 일치하는 경우 실행할 구문; break;
        *   case 비교값1 : 비교값 1과 일치하는 경우 실행할 구문; break;
        *   case 비교값1 : 비교값 1과 일치하는 경우 실행할 구문; break;
        *   default : case 모두에 해당하지 않는 경우 실행할 구문; break;
        * }
        * */


        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력: ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력 ( + , - , * , / , %) ");
        char op = sc.next().charAt(0);


        int result = 0;
        switch (op){
            case '+' :  result = first + second;
                break;
            case '-' :  result = first - second;
                break;
            case '*' :  result = first * second;
                break;
            case '/' :  result = first / second;
                break;
            case '%' :  result = first % second;
                break;
        }
        System.out.println(first +" "+op+" "+second+" = "+result);

    }

    public String testSwitchVendingMachine(){
        /*
         * 사용자가 선택한 음료와 가격을 문자열로 반환해주자
         * 프로그램의 콘솔 출력은 반환받은 값을 main에서 출력할 것이다.
         *
         * 단 자판기는 switch 를 이용해서 만든다.
         * */
        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println("  1.사이다(500)   2.콜라(600)   3.환타(700)   4.바카스(1000)  5.핫식스(1500) /숫자를 입력하시오 ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
        String order = "";
        String SelectedDrink="";
        int price = 0;


        switch (choice){
            case 1 : price = 500;
                    SelectedDrink = "사이다";
                break;
            case 2 : price = 600;
                    SelectedDrink = "콜라";
                break;
            case 3 : price = 700;
                     SelectedDrink = "환타";
                break;
            case 4 : price = 1000;
                     SelectedDrink = "바카스";
                break;
            case 5 : price = 1500;
                    SelectedDrink = "핫식스";
                break;
        }
        order = "선택하신 음료는 "+SelectedDrink+"이고 가격은"+price+"원입니다.";

        return order;
    }
}
