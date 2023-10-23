package com.ohgiraffers.section06.ternary;

public class quiz {
    public static void main(String[] args) {

        // 길동이의 첫달 월급은 100만원이다
        // 짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        // 길동이 연봉은?

        int salary = 100;
        final double bonus1 = 0.1;
        final double bonus2 = 0.15;
        int total=salary;

        for(int month = 2; month<=12 ; month++){
            if(month%2 == 0 ){
                total += (int)(salary * (1+bonus2));
            }else{
                total += (int)(salary * (1+bonus1));
            }
        }
        System.out.println("길동이의 연봉은 "+ total+"만원입니다");

        //ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것

        char ch1 = 'X';
        char ch2 = 'Z';
        String result;

        result = (ch1 == ch2) ? "참" : "거짓" ;
        System.out.println(result);

        //자신의 나이를 집어넣고 20 보다 작으면 미성년자 , 20보다 높으면 성인이 출력되도록 한다

        int myAge = 27;
        String isTrueAdult;
        isTrueAdult = (myAge < 20) ? "미성년자" : "성인";
        System.out.println("나는 "+isTrueAdult +"이다");



// A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 35만원 , 와인 : 30만원 , 고량주 : 40만원 이다.

// 마트의 주당 평균 총 매출이 140 만원일때

// 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

// 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

// 다음과 같은 양식을 가진다5


// A마트 이번 주 주류의 평균 실적은 ()만원이고, 세금은 ()만원을 냈으며, 세금을 제외한 수입은 ()만원이다.

// 이번 주 총 매출은 평균 총 매출보다 높다/낮다.


        int average;
        final int AVERAGE = 140;
        int total1;
        int pureRevenue;
        int tax;

        total1 = 45+35+30+40;
        tax = (int)(total1* 0.1);
        average = (int)(total1/4);
        pureRevenue = total1 - tax;

        System.out.println("A마트 이번 주 주류의 평균 실적은 "+ average +"만원이고, 세금은 "+ tax + "만원을 냈으며, 세금을 제외한 수입은 "+ pureRevenue +"만원이다.");

        String result1 = average > AVERAGE ? "높다" : "낮다";
        System.out.println("이번 주 총 매출은 평균 총 매출보다 "+result1);




//        2번문제
        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오


        final int STANDARD = 120;
        int passengerA = 113;
        int passengerB = 127;
        String result2;

        System.out.println("키카 "+passengerA+"cm 이므로 탑승 "+(result2 = passengerA < STANDARD ? "불가능": "가능")+"합니다.");
        System.out.println("키카 "+passengerB+"cm 이므로 탑승 "+(result2 = passengerB < STANDARD ? "불가능": "가능")+"합니다.");

//        3번문제
//삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력


//        1.
//        한 축구 구단의 직원 수는 약 1892명 이다.
//        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.
//
//                구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.
//
//        구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.

        int staff = 1892;
        int standing = 17;

        staff = (standing < 18) ? (int)(staff *= 0.85) : (int)(staff *= 1.15);

        System.out.println("구단의 직원수는"+ staff + "명이다");


//        2.
//        영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다 평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.

        int studentAverage = (int)((90 + 95 + 81)/3);
        String studentResult;
        System.out.println(studentResult = (studentAverage > 90) ? "true" : "false");



//        3.
//        /* 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라. */
//
        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String resultKim = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";

        System.out.println(resultKim);
//
//        4.
//        시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력

        int testAverage = (int)((50+40+60)/3);
        String testResult;
        System.out.println(testResult= testAverage > 40 ? "합격" : "불합격");


    }
}
