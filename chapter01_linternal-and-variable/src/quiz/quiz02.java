package quiz;

public class quiz02 {
    public static void main(String[] args) {
        // 5명의 반 학생이 있으며 학생들의 키는 각각
        /*
        * 178.5
        * 170.3
        * 190.7
        * 188.678
        * 160.8
        * 이다
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        * 화면에 보여지는 양식은 다음과 같다
        * 1반 학생 5명의 키의 평균은 000cm 이다..
        *
        * -------------------
        * 문자 z에 대응하는 숫자를 화면에 출력해주세요
        *
        * long lnum = 10L;
        * int num = 190;
        *
        * 아래의 연산의 차이를 옆사람에게 설명해주세요
        * int sum = (int)lnum + num;
        * int sum2 = (int)(num + lnum);
        *
        * ----
        * 사업을 시작한 홍길동은  10월18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        * 10-18 매출은 다음과 같다
        * 150400
        * 1400
        * 25000
        * 30000
        * 여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자
        *
        * */

        int height;
        height = (int)((178.5 + 170.3 +190.7 + 188.678 + 160.8)/5);
        System.out.println("1반 학생 5명의 키의 평균은"+ height +"cm 이다");


        char charz= 'z';
        byte numz = (byte)charz;

        System.out.println(numz);

        final double VAT = 0.1;
        int revenue;

        revenue = (int)((150400 + 1400 + 25000 + 30000)*(1-VAT));
        System.out.println(revenue);
    }
}
