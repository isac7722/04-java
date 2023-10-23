package main.java.vom.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        /*
        * static 메서드
        *
        * static 메서드를 호출하는 방법
        * 클래스.메소드명();
        * */

        //권장한지 않는 방식
        Application8 app8 = new Application8();

        int result = app8.sumToNumbers(1,2);
    }

    public static int sumToNumbers(int num1, int num2){
        return num1 + num2;
    }
}
