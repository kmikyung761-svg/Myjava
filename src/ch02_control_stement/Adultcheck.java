package ch02_control_stement;

public class Adultcheck {
    static void main(String[] args) {
        String name = "김철수";
        int age = 12 ;
        int _gender = 3;
        String gender ;
        if(_gender == 1 ||_gender ==3){
            gender = "남자"; }
            else{
            gender = "여자"; //<--- 제외 대상
            }
            String adult ;
            if(age>=19){
                adult = "성인" ; //
            }else{
                adult = "미성년자" ;
            }




            // 문자열을 다룰때 성별은 수치로 제시 변수 만들때 최종 변수 잠깐 스치는 변수

            // println 메소드 : 문자열 출력 엔터키를 누르는 역할을 합니다
        //메소드 = 역할 = 기능 = 함수
        System.out.println( "이름 :" + name + ", 나이 : " + age);
        // 서식 지정자 : %s(문자열) %d(정수)    ----> 서식지정자 2가지 치환대상이다.
        //intf 메소드 : 서식 지정자를 이용한 출력, 엔터키 기능 없음
        System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 성인 여부  : %s", name, age, gender, adult);
        System.out.println("하하하");

    }
}
