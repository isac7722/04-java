package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {

        /*
        * 랜덤한 카드 한 장을 뽑아서 출력해보자
        * */

        String[] shapes = {"SPADE","CLOVER","HEART","DIAMOND"};
        String[]charNumber = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};

        //램덤한 카드를 배열에서 선택할 수 있나?

        Random random = new Random();
        int randomShapes = random.nextInt(shapes.length);
        System.out.println(shapes[randomShapes]);
    }
}
