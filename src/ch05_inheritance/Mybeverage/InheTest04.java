package ch05_inheritance.Mybeverage;


import ch05_inheritance.general.Espresso03;
import ch05_inheritance.general.Latte03;

public class InheTest04 {
    static void main() {
        Beverage04 bag = new Americano04("아메", 2424, 244);
        //업케스팅 : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 형태를 바꾸는것
        // 낮은 : 부모 최상위Beverage04 클래스고  높은 : 자식클래스 Americano04
        bag.showInfo();
        System.out.println();
        Americano04 beverage_ = (Americano04) bag;
        beverage_.showInfo();
        beverage_.drink();
        System.out.println();
        // 승급 개념과 배열의 사용
        Beverage04[] beverage = {
                bag,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("바나나 라떼", 7000.0, "milk"),
        };
        for (int i = 0; i < beverage.length; i++) {
            System.out.println(".........................");
            beverage[i].showInfo();

            // instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //              생성 되었는지를 판단하고자 할때 사용합니다.
            if (beverage[i] instanceof Americano04) {//아메리카노
                // i 번째 객체 아메리카노를 만든것 맞니?
                Americano04 ameri = (Americano04) beverage[i];// 강등
                ameri.sipAmericano();
                // 아메리카노가 맞으면 아메리카노로 변환해서 drink()실행// 다중택일
            } else if (beverage[i] instanceof Espresso04) {//에스프레소
                Espresso04 es = (Espresso04) beverage[i];
                //형변환
                es.drink();
            } else if (beverage[i] instanceof Latte04) {//라떼
                Latte04 la = (Latte04) beverage[i];
                // 객체를 프린트 하면 암시적으로 tostring()메소드가 호출이 됩니다.
                // toString() Ameicano04(x),Beverage04(x) object (o)상속 받았으니깐
                la.enjoyLatte();

            } else {//차후에...
            }
            //객체를 프린트 하면 암시적으로 toString()
            System.out.println(".........................");
            System.out.println(beverage[i]);
           }
        }
}

//
//        Beverage04 coffee = new Latte04("바닐라 라떼",5500.0,"딸기우유");
//        coffee.showInfo();
//        System.out.println();
//
//        Latte04 coffee04 = (Latte04)coffee;
//        coffee04.enjoyLatte();
//        System.out.println();







