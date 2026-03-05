package ch02_control_stement;

public class Product01 { // 단계01 클래스 정의
     // 멤버 변수
  //단계01 : 클래스 정의
        String name ; // 상품명
        int price ; // 가격
        String inputdate ; // 등록일
// 정수 1개를 입력 받아서 +5를 수행하고, 값을 반환합니다.
//'매개변수'는 메소드 외부에서 넣어 주는 값입니다.
// 반환 타입 메소드 이름(매개  변수리스트){...}
    int plus5(int x) {
        return x + 5;
    }
// // 상품명 : 신라면, 단가 : 1000, 입고 : 2026/03/01
// 매개 변수 없다. 반환 : String
    String showData(){
    String result = "상품명 : "+name +", 단가 : "+price + "원, 입고 : " + inputdate ;
    return result;
    }
void Display(){}
}
