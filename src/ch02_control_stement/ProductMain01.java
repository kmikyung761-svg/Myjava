package ch02_control_stement;

public class ProductMain01 {
    static void main(String[] args) {
        //단계02: 객체 생성
        //'생성자 이름'은 '클래스이름'과 동일 해야 합니다.
        // 클래스 이름 객체이름 = new 생성자 이를();
        Product01 blackbean = new Product01();
        // 단계03 : 멤버 변수에 값을 할당
        // .을 멤버 참조 연산자 라고 부릅니다.
        blackbean = new Product01();
        blackbean.name = "짜파게티";
        blackbean.price = 2000;
        blackbean.inputdate = "2026/03/09";
        // 단계04: 멤버 변수들의 값을 출력
        System.out.println("2번상품 정보 출력");
        System.out.println("이름 : " + blackbean.name);
        System.out.println("단가 : " + blackbean.price);
        System.out.println("입고 : " + blackbean.inputdate);
        int su = 3;
        int result = blackbean.plus5(su);// 메소드 호출
        System.out.println("결과 :  " + result);

        String str = blackbean.showData() ;
        System.out.println(str);
//        blackbean.Disply();
    }
}

