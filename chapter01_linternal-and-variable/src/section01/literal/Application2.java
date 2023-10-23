package section01.literal;

import java.sql.SQLOutput;

public class Application2 {

    public static void main(String[]args){
        /* 수업 목표. 정수 리터럴 형식의 값을 직접 연산한다.*/

        /*
        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 / 10
        * 5. 10 %2
        * */

        var a = 123;

        var b = 456;


//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(40/10);
//        System.out.println(10%2);

        /* 실수와 실수 리터럴 연산 */
        /*
        * 1. 1.23 + 1.23
        * 2. 1.23 - 1.23
        * 3. 1.23 * 1.23
        * 4. 1.23 / 1.23
        * 5. 1.23 % 1.23
        * */


//        System.out.println(1.23 + 1.23);
//        System.out.println(1.23 - 1.23);
//        System.out.println(1.23 * 1.23);
//        System.out.println(1.23 / 1.23);
//        System.out.println(1.23 % 1.23);


        /*
        * 1 + 0.5
        * 1 - 0.5
        * 1 * 0.5
        * 1 / 0.5
        * 1 % 0.5
        *
        * */

//        System.out.println(1 + 0.5);
//        System.out.println(1 - 0.5);
//        System.out.println(1 * 0.5);
//        System.out.println(1 / 0.5);
//        System.out.println(1 % 0.5);


//        ('a' + 'b');
//        ('a' - 'b');
//        ('a' * 'b');
//        ('a' / 'b');
//        ('a' % 'b');

//        System.out.println('a' + 'b');
//        System.out.println('a' - 'b');
//        System.out.println('a' * 'b');
//        System.out.println('a' / 'b');
//        System.out.println('a' % 'b');

//        System.out.println('a' + 1);
//        System.out.println('a' - 1);
//        System.out.println('a' * 1);
//        System.out.println('a' / 1);
//        System.out.println('a' % 1);

        System.out.println("hello"+1004.4525);
        System.out.println("hello"+'a');
        System.out.println("hello"+true);

        // 정수형은 4비트를 체계를 갖는다
        // 컴퓨터는 데이터 타입이 다른 것 끼리는 연산이 안되기 때문에 데이터가 큰 것으로 자동 형 변환

        System.out.println("123"+"456");


        /* 논리값 연산 */
        /* 4-1 논리값과 논리값 연산 */

//        System.out.println(true + false);
//        System.out.println(true + 1);
//        System.out.println(true + "1");




    }
}
