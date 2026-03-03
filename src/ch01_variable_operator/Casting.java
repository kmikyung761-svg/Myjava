package ch01_variable_operator;

public class Casting {
    static void main() {
        double d = 100 ;//암시적 형변환(Casting)
        System.out.println("d : " +d);
        int i = (int)3.14 ; //실수 ->정수 타입으로 바뀌는 것은 없다. 큰타입에서 작은 타이브 바꿀 수 없다.
        System.out.println("i: " +i);
        System.out.println(14/5); // 정수/정수=정수
        System.out.println((double)14/5); //실수=>실수
        //(double)14/5 =>명시적 형변환 14.0/5=>14.0/5.0 <=암시적 --->2.8
        //(double)(14/5)=>(double)2 => 2.0 (명시적)
        System.out.println((double)(14/5));
        //학생이 3과목 시험을 치르다. 평균 구하라
        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math ;
        System.out.println("총점 : " + total);
        double average = (double)total /3 ;
        System.out.println("평균 : " + average);
        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2 ;
        System.out.println("bool1 : " + bool1);
        // 각각 99와 97으로 암시적 형변환 97이 99보다 크니?
        //a97 A-->65 아스키 코드 표준
        int result = ch1-ch2 + 5;
        System.out.println("result : " + result);
        //
        char ch3 = 'D';
        String str = ch3 >= 'A' && ch3 <= 'z' ? "대문자" : "대문자 아님" ;
        //암시적 형변환 65
        System.out.println("str : " + str);
        //*문제 풀이*
        // 대문자
        // 1. 덮어씀---->int a = 10; 10이라는 값이 왼쪽 변수 a에 할당
        //2. 누적 a+= 5; a=a+5;
        //3. 결합 ex)str += " " 기존 문자열 뒤에 새로운 글자를 붙임
        //4. blool-->true or false 중의 하나의 값
        //5. 조건 경우의 수 조건? 참 : 거짓 형태
        //6. 아스키 코드+암시적//대입,산술,관계,조건---->String str = x%2== 0? "짝수" "홀수"
        //7. 정수로 볼 수 있다. ----> 암시적 형변환
        // num % 2 ==0이면 짝수, 아니면 홀수입니다.
        //

    }
}
