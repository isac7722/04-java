package main.java.com.ohgiraffers.section03.dto;

public class MemberDTO {


    /*
    * DTO(Data Transfer Object)의 약자로 계층간의 데이터 전송을 위해 도메인 모델 대신 사용되는 객체이다.
    * */

    private int number;                     //회원번호
    private String name;                    //회원이름
    private int age;                        //회원나이
    private char gender;                    //회원성별
    private double weight;                  //몸무게
    private boolean isActiveated;           //활동상태


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActiveated() {
        return isActiveated;
    }

    public void setName(String 홍길동) {
    }
}
