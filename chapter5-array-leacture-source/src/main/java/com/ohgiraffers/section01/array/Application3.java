package main.java.com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 값의 형태 별 기본 값
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \u0000
        * 참조 : null
        * */


        // new -> heap 주소를 할당 -> 기본값으로 초기화
        int[] iarr = new int[5];

        for(int i =0 ; i<=5; i++){
            System.out.println(iarr[i]);
        }

        for(int i=0; i <=iarr.length;i++){
            System.out.println("i array["+i+"] = "+iarr[i]);
        }

        int[] iarr2 = new int [5];
        int[] iarr3 = {10,20,30,40,50};

    }
}
