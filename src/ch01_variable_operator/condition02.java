package ch01_variable_operator;

public class condition02 {
    static void main(String[] args) {
        int x = 10, y = 20;
        //타입 result = 조건식 ? 참일때처리 : 거짓일때 처리 ;
        int result = x >= y ? x : y;
        System.out.println("result : " + result);


        String str = x % 2==0 ? "짝수" : "홀수";
        System.out.println("str : " + str);
        x=6;
        //x가 3의 배수이면 제곱을 , 아니면 더하기 5의 결과 출력하기

         result = x % 3 == 0 ? (x*x) : (x + 5) ;
        System.out.println("result : " + result);
//result = 조건식 ? 참일때처리 : 거짓일때 처리 ;
        int month =3 ;
        str =month >= 3 && month<=5?"봄" : "다른계절";
        System.out.println("결과 : " + str);
        //타입 result = 조건식 ? 참일때처리 : 거짓일때 처리 ;
        //x가 7의 배수이면 제곱을, 아니면 더하기 3의 결과 출력하기
        x=7 ;
                result = x % 7 == 0 ? (x*x) : (x+5) ;
        System.out.println("result : " + result);
        // x는 12의 약수이면 제곱을, 아니면 더하기 5의 결과 출력하기
        result = (x % 12== 0) ? (x*x) : (x+5);
        System.out.println("result : " + result);

    }
}
