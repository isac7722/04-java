package main.java.com.ohgiraffers.section04;

import java.util.Arrays;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 버블 정렬에 대한 알고리즘
        * 인접한 두개의 원소를 검사하여 정렬하는 방법
        * 구형이 쉽다는 장점이 있다.
        * 이미 정렬된 데이터를 정렬할때 가장 빠르다
        *
        * */

        int[] arr = {2,4,5,1,6,3};
        int temp;
//
//        Arrays.sort(arr);
//        for (int x :
//                arr) {
//            System.out.println(x+" ");
//        }

        for (int i = arr.length-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int x :
                arr) {
            System.out.println(x);
        }
    }
}
