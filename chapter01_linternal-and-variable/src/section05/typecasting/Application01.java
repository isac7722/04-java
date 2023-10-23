package section05.typecasting;

public class Application01 {
    public static void main(String[] args){

        /*
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * - 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다
        * */

        /*
        * 형변환의 종류와 규칙
        * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *   1-1 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다.
        *   1-2 정수는 실수로 자동 형변환 된다.
        *   1-3 문자형은 int 형으로 자동 형변환 된다.
        *   1-4 논리형은 형변환 규칙에서 제외된다.
        * 2. 강제 형변환(명시적 형변환) : 형변환 cast 연산자를 이용한 강제적으로 수행하는 형변환
        *   2-1 자동형변환이 적용되지 안흔 경우 강제 형변환이 필요하다.
        * */

        /*
        * 목차 1. 자동형변환 규칙 테스츠
        * 목차 1-1 작은 자료형에서 큰 자료형으로 자동 형변환된다.
        * 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다.
        * */

        //1-1-1 장슦;ㄹ;ㅇ,; 지덩 향뱐허ㅣㄴ
        // 잠잠 다 ㅋ,ㄴ 지려향ㅇ,러 ㄷ[ㅇ;탈,ㄹ 얾갸더 믅[ 앖ㅇ; 지덩 향뱐허ㅣㄴ 찰;더;ㄴ디/
        byte bnum =1;
        short snum = 1;
        int inum = 1;
        long lnum = inum;

        //연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다
        int num1 = 10;
        long num2 = 20;
        long result = num1 + num2;
//        int result1 = num1 * num2;// 작은 자료형과 큰 자료형 연산시 큰 자료형으로 자료형이 변경됨

        System.out.println("result"+ result);

        /*
        * 1-2 정수는 실수로 자동 형변환된다
        * 정수를 실수로 변경될때 소수점 자리수가 없어도 실수 형태로 표현이 가능히다
        * 이때 데이터 손실이 없기 때문에 자동 형변환이 가능하다
        * */
        long eight = 8;
        float four = eight;
        System.out.println("four : " + four);

        // 실수와 정수 연산
        float result3 = eight * four;
        System.out.println("result3 : "+ result3);

        char ch1 = 'a';
        int charNumber = 97;

        char chValue = (char)charNumber;
        System.out.println((int)ch1);
        System.out.println(chValue);
        System.out.println((char)charNumber);


        int ch2 = 65;
        System.out.println("ch2 : " + ch2);

        // 1-4. 노리형 형변환 규칙에서 제외
        boolean isTrue = false;
//        byte b = isTrue;
//        String test = isTrue;
//        int i = isTrue;
        /*다른 자료형도 동일함........*/
    }
}
