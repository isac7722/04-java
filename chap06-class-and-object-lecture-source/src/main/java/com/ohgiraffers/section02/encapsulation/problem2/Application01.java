package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {

    public static void main(String[] args) {



        /*
        * 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생된다
        * */

        //2083562754
        Monster monster = new Monster();
        System.out.println(monster.hashCode());

        monster.kind = "두치"; //2083562754.kind
        monster.hp = 200;   //2083562754.hp

        System.out.println("monster kind :"+monster.kind);
        System.out.println("monster hp :"+monster.hp);


        System.out.println(" ");

        //1239731077
        Monster monster2 = new Monster();
        System.out.println(monster2.hashCode());


        monster2.kind = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2 kind: "+monster2.kind);
        System.out.println("monster2 hp :"+monster2.hp);


        Monster monster3 = new Monster();
        monster3.kind = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 kind: "+monster3.kind);
        System.out.println("monster3의 hp: "+monster3.hp);


        Monster monster4 = new Monster();
        monster4.kind = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 kind :"+monster4.kind);
        System.out.println("monster4의 hp :"+monster4.hp);

        
    }

}
