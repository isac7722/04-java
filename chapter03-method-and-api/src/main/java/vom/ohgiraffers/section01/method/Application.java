package main.java.vom.ohgiraffers.section01.method;

public class Application {

    public static void main(String[] args){
        /*
        * 메소드란?
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */
        System.out.println("main()메서드 시작됨...");

        //새로언 함수를 만든다.
        Application app1 = new Application();
        app1 =  new Application();
        System.out.println("hashCode : " + app1.hashCode());

        app1.methodA();

        // 주소의 개념을 정착하자
        // 복사를 한다는 것은 새로운 주소를 정의하고 그 주소에 element를 복사하는 것
        // 메모리의 개념을 인지할 필요가 있음
    }

    public void methodA(){
        System.out.println("methodA() 호출...");

        methodB();

        System.out.println("methodA() 종료...");
    }

    public void methodB(){
        System.out.println("methodB() 호출...");

        methodC();

        System.out.println("methodB() 종료...");
    }
    public void methodC(){
        System.out.println("methodC() 호출...");
        System.out.println("methodAC) 종료...");
    }
    //   public(접근할 수 있는 범위) void (반환 타입)

}
