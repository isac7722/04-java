package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {

    public static void main(String[] args) {


        //2083562754
        Monster monster = new Monster();
        System.out.println(monster.hashCode());

        monster.name = "두치"; //2083562754.name
        monster.hp = 200;   //2083562754.hp

        System.out.println("monster name :"+monster.name);
        System.out.println("monster hp :"+monster.hp);


        System.out.println(" ");

        //1239731077
        Monster monster2 = new Monster();
        System.out.println(monster2.hashCode());


        monster2.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2 name: "+monster2.name);
        System.out.println("monster2 hp :"+monster2.hp);


        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name: "+monster3.name);
        System.out.println("monster3의 hp: "+monster3.hp);


        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name :"+monster4.name);
        System.out.println("monster4의 hp :"+monster4.hp);


    }

}
