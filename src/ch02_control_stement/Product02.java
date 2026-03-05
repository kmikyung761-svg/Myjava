package ch02_control_stement;

public class Product02{
     String brand; // 브랜드(static 변수=클래스변수)
    //클래스 이름으로 접근이 가능하여'클래스변수'라고 부릅니다.
    //static는 모든 객체들이 공유할 목적으로 사용되는 변수입니다.
    // 멤버 변수는 타입별로 기본 값이 있습니다.
    //문자열(null), 정수(0), 실수)0.0)
        private String name ; //상품명* 변수3개
        private int price ;//단가
        String inputdate ; //입고 일자
       // private String inputdate ;//입고일자
        public String getName(){
            return this.name ;
        }
        public void setName(String name){
            // 매개 변수는 지역 변수의 부분 집합입니다.
            System.out.println(name+"를 입력 받아서 private 속성에 값을 넣어준다");
            this.name=name ;
        }
        public void setPrice(int price) {
            System.out.println(price+"를 입력 받아서 private 속성에 값을 넣어준다");
             this.price = price;
         }
        public void getPrice() {
            System.out.println("getter로 데이터를 출력함"+price);
         }
}
