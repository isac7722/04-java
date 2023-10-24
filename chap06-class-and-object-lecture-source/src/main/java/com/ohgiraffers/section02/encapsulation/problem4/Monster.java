package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {



    /*
    * 접근 제한자
    * 클래스 혹은 클래스의 맴버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다
    * 1. public : 동일 패키지에 접ㅈ근 허용
    * 2.protected: 동일 패키지에 접근 허용 단, 상속관계에 있는 4경우 다른 패키지에도 접근 간으
    *  3. default: 동일 패키지에서만 접근 허용
    * 4. private: 해당 클래스 내부에서만 접근을 허용
    *
    *
    * 위 네가지 접근제한자는 클래스 의 맴버에 모두 사용이 간으핟.
    * 단 클래스 선언싱 사용하는 접근 제한자는 public과 default만 사용이 가능하다
    * 필드 : 클래스에 선언된 변수
    * 맴버 : 클래스에ㅐ 정의된 모든 속성을 의미
    *
    * */
    private String kind;
    private int hp;


    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setHp(int hp) {
        if (hp>0){
            this.hp = hp;
        }else{
            this.hp = 0;
            System.out.println("체력이 0보다 적으면 죽어요~~");
        }

    }

    public String getKind(){
        return this.kind;
    }
    public int getHp(){
        return this.hp;
    }

   @Override
    public String toString(){
        return "입력한 종류는 "+kind+"체력은 "+hp+"입니다";
   }

}
