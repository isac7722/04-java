package main.java.com.ohgiraffers.section02.lopping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        /*
         * while문 표현식
         * while(조건식){
         *
         * }
         * */


        Scanner sc = new Scanner(System.in);
//        String value = sc.nextLine();
//        int i= 0;
//
//
//        while(i<value.length()){
//            System.out.println(i);
//            i++;
//        }

        boolean isTrue = false;

        do {
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작은 원하면 true, 시작을 원하지 않은면 false를 입력해주세요");
            isTrue = sc.nextBoolean();
        }while(isTrue);


        }

    }

