package main.java.com.ohgiraffers.section01.user_type;

public class Application01 {
    public static void main(String[] args) {
        String id = "user01";
        String pwd = "pass01";
        String name = "기유";
        int age = 20;
        char gender = '남';
        String[] hobbys = new String[]{"축구", "볼링","헬스"};

//        print(id, pwd, name, age, gender, hobbys );


        System.out.println("---1년이 지나고");
        age = modifyAge(age);
//        print(id, pwd, name, age, gender, hobbys );


        /*
        * 위와 같이 변수를 개별적으리ㅗ활용햇서 생기는 문제범
        * 1. 변수명을 다 관리해야하는 어려움이 생긴다
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야하면 너무 낳은 값들을 인자로 전달해야 해서 한 눈에 안들어 온다
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다. (자료형이 서로 다르기 떄문이다.)
        * */


        //사용자 정의 타입을 활용

        Member kiyu = new Member();
        kiyu.name = "기유";
        kiyu.age = 20;
        kiyu.id = "kiyu";
        kiyu.pwd = "pass";
        kiyu.gender ='남';
        kiyu.hobby = new String[]{"축구", "헬스"};

        System.out.println("---1년이 지나고");
        kiyu = modifyMember(kiyu);
        System.out.println(kiyu.toString());

        Member minsik = new Member();
        minsik.name = "민식";
        minsik.age = 18;
        minsik.id = "minsik";
        minsik.pwd = "pass";
    }










    public static int modifyAge(int age){

        return age + 1;
    }

    public static Member modifyMember(Member member){
        member.age = member.age+1;
        return member;
    }
}
