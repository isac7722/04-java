package main.java.vom.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개 변 수로 받아 나눈 값을 반환하는 함수
        *
        * 메서드에서 반환한 값을 받아서 화면에 출력해주세요
        * */

        Application7 app7;
        app7 = new Application7();

        int num1= 4;
        int num2= 2;
        int result = 0;

        result = app7.add(num1, num2);
        result = app7.add(num1, num2);
        result = app7.add(num1, num2);
        result = app7.add(num1, num2);


    }
    public int add(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
