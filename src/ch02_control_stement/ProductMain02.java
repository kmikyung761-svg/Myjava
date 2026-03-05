package ch02_control_stement;

import ch02_control_stement.Product02;

public class ProductMain02{
    static void main() {
        Product02 shin= new Product02();
        shin.setPrice(1000);// 간접쓰기
        shin.inputdate ="2026/03/01";//직접쓰기
        shin.brand = "nongsim";
        System.out.println(shin.brand);


        System.out.println("상품명 : " + shin.getName() );
        System.out.println("단가 : " ); shin.getPrice();
        System.out.println("상품명 : " );shin.getPrice();

        for (int i = 0; i <10; i++) {

        }
        for (int i = 0; i < 20; i++) {

        }
    }
}
