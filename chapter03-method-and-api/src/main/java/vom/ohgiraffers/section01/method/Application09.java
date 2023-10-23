package main.java.vom.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {
        /*계산기 만들기*/

        int first = 100;
        int second = 50;

        int result = 0;

        Calculator cal = new Calculator();

        result = cal.minNumberOf(1,2);
        System.out.println(result);
        result = cal.maxNumberOf(1,2);
        System.out.println(result);




//        Application09 app9 = new Application09();
//
//        result = app9.minNumberOf(1,2);
//        System.out.println(result);
//
//        result = Application09.maxNumberOf(1,2);
//        System.out.println(result);

    }

//    public int minNumberOf(int first, int second){
//        return ((first > second) ? second : first);
//    }
//
//    public static int maxNumberOf(int first, int second){
//        return((first > second) ? first : second);
//    }
}
