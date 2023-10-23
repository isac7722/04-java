package quiz;

public class quiz01 {
    public static void main(String[] args) {
        /*
         * 김경리가 사원 10명의 월급을 입금해줘야 하는 날이다.
         * 사원의 직책은 대리/ 과장/ 부장/ 찾장이 있으며
         * 대리는 100만원
         * 과장은 120만원
         * 부장은 130만원
         * 차장은 150만원의 월급을 받는데
         * 보너스는 각 월급 *0.5만큼을 더해서 주어야 한다.
         * 화면에 보여지는 형태는 다음과 같다
         * 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.
         * */

        int salary;


//        System.out.println("김대리의 월급은 "+(salary = 100) + "만원 + 보너스 "+ ((int)(salary*0.5)) + "만원으로 총"+((int)(salary * 1.5)) + "만원 입금되었습니다.");
//        System.out.println("김과장의 월급은 "+(salary += 20) + "만원 + 보너스 "+ ((int)(salary*0.5)) + "만원으로 총"+((int)(salary * 1.5))+ "만원 입금되었습니다.");
//        System.out.println("김부장의 월급은 "+(salary += 10) + "만원 + 보너스 "+ ((int)(salary*0.5)) + "만원으로 총"+((int)(salary * 1.5))+ "만원 입금되었습니다.");
//        System.out.println("김차장의 월급은 "+(salary += 20) + "만원 + 보너스 "+ ((int)(salary*0.5)) + "만원으로 총"+((int)(salary * 1.5))+ "만원 입금되었습니다.");


        // 연습문제

//        salary = 100;
//
//        for(int i=1; i<=12 ; i++){
//            System.out.println(i+"월 김대리의 월급은 "+ salary+"만원 입니다.");
//            salary += 10;
//        }

        salary = 100;

        int month = 1;
        while (month <= 12) {
            System.out.println(month + "월 김대리의 월급은 " + salary + "만원 입니다.");
            salary += 10;
            month++;
        }


        // F=ma, 힘 = F, 질량 = m, 가속도 = a, 지구 중력 가속도 = 9.81, 달의 중력 가속도 = 1.63
        // (질량이 100kg인 사람이 지구에서 받는 힘과 달에서 받는 힘의 몫 연산값을 구하고 정수로만 표현하시오.)

        int m = 100;
        double a;
        System.out.println("지구에서 받는 힘:" + (int)(m*(a=9.81)));
        System.out.println("달에서 받는 힘:" + (int)(m*(a=1.63)));

    }
}
