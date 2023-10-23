package main.java.com.ohgiraffers.section02.lopping;

import java.util.Scanner;

public class A_for {
    public void testSimpleforMachine() {
        /*
         * for[표현식]
         * for(초기값; 조건식; 증감식){
         * }
         *
         * */

        for(int i =1; i<=10; i++){
            System.out.println(i);
        }
    }

    public void testForExample(){
        // 반의 학생이 10명인 핵생의 이름을 입력 받기

        Scanner scanner = new Scanner(System.in);


        for(int i= 0; i<10; i++){
            System.out.println("학생의 이름을 입력하시오");
            String student = scanner.nextLine();
            System.out.println(i+"번째 학생의 이름은 "+student+"입니다.");
        }
    }

    public void testForExample2 (){
        int result =0;
        for(int i =1 ; i<=10 ; i ++){
            result += i;
            System.out.println(result);
        }
    }


    public void testForExample4(){
        /*
        * 숫자 두개를 입력받아 작은 수에ㅐ서 큰 수까지의 합계를 구하세요
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다
        * */

        /* 프로그램
        * 목표 : 두 수를 입력받아서 작은 수 부터 큰 수 까지의 합계를 구한다.
        * 주의 : 두 수의 값은 같을 수 없다.
        *
        * 1. 두 수를 입력받아야 한다.
        * 2. 입력받은 수가 같은지 비교한다
        *   false. 두 수가 같지 않다면 다음으로 넘긴다
        *   true. 두 수를 다시 입력받는다.
        * 3. 같지 않다면 작은 수와 큰 수를 구한다
        * 4. 작은 수 부터 큰 수까지의 합계를 구한다
        * */


        System.out.println("두 수를 입력받아 작은 수 부터 큰 수까지 합계를 구하는 프로그램 입니다.");
//        1. 두 수를 입력받아야 한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 수를 입력해주세요");
        int num2 = sc.nextInt();


//        2. 입력받은 수가 같은지 비교한다

        for(;;){
            if(num1==num2){ // 받은 수가 같다면 숫자를 다시 받는다
                System.out.println("두 수가 같습니다. 두 수를 다시 입력해주세요");
                System.out.println("첫번째 수를 입력해주세요");
                num1 = sc.nextInt();
                System.out.println("두번째 수를 입력해주세요");
                num2 = sc.nextInt();
            }else{ // 같지 않은 경우 다음 진행
                int max = (num1>num2) ? num1 : num2;
                int min = (num1<num2) ? num1 : num2;
                int sum = 0;

                for(int i= min; i<=max; i++){
                    sum += i;
                }
                System.out.println("입력 한 두 수 중에 작은 수는 "+min+"큰 수는 "+max+"이고 합계는 "+sum+"입니다");
                break;
            }
        }
//            false. 두 수가 같지 않다면 다음으로 넘긴다
//            true. 두 수를 다시 입력받는다.
//        3. 같지 않다면 작은 수와 큰 수를 구한다
//        4. 작은 수 부터 큰 수까지의 합계를 구한다
    }

    /**
     * 구구단을 위한  함수 입니다
     * n단 부터 9단까지의 구구단
     * @params : 해당 단을 출력함
     * @return void
    **/
    public void gugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이 프로그램은 구구단을 보여주는 프로그램입니다.");
        System.out.println("몇단부터 보시기 원하시나요?");

        int first = sc.nextInt();

        //9보다 큰 수를 입력한 경우
        while(first > 9){
            System.out.println("구. 구. 단. 입니다");
            System.out.println("숫자를 다시 입력해주세요");
            System.out.println("몇단부터 보시기 원하시나요?");
            first = sc.nextInt();
        }

        // 입력한 구구단 출력
        for(int i = first; i <10 ; i++){
            System.out.println(i+"단");
            for(int a =1; a<10; a++){
                System.out.println(i+" X "+a+"= "+a*i);
            }
        }
        System.out.println("이상");
    }



}
