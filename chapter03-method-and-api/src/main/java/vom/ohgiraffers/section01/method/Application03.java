package main.java.vom.ohgiraffers.section01.method;

import java.util.EnumMap;
import java.util.Enumeration;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 전달인자 (argument)와 매개변수를 애용한 메소드 호출
        *
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(field)
        * 4. 클래스 변수
        * ! 번외 클래스 속성 (method, variable 포함)
        *
        * 지역변수는 선언한 메소드 블랙 내부에서만 사용가능하다..
        * 이것을 지역변수의 스코프라고 한다.
        * 다른 메스드간 서로 공유해야한 값이 존재하는 경우 메소드 홀출 시 사망하는 뢀호를이용해서
        * 값을 전달할 수 있따
        * 이때 전달하느 ㄴ값을 전달인자라고 부르고,  메솓 선언부 괄호 안애 전
        * */

        Application03 app3 = new Application03();
        app3.testMethode(20);

        byte bytAge =20;
        app3.testMethode(bytAge);

        long longAge = 30;
        app3.testMethode(30);

    }

    public void testMethode(int age){
        System.out.println("당신의 나이는 "+age+"입니다.");
    }
}
