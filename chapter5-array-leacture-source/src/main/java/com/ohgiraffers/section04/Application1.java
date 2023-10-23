package main.java.com.ohgiraffers.section04;

public class Application1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);

        int arr1 [] = {num2};
        int arr2 [] = {num1};

        num1 = arr1[0];
        num2 = arr2[0];

        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
    }
}
