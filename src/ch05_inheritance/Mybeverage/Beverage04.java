package ch05_inheritance.Mybeverage;
/*
서브 클래스가 수퍼 클래스의 변수에 접근
 1. private은 getter/setter 로 접근
 2. private 대신 protected로 작성
 3. 생성자를 통한 대입

*/
public class Beverage04 {
private String name ;//음료 이름
private double price ;//단가

    @Override
    public String toString() {
        //to-->방향 St 형태로
        //String imsi = "상품명 : " + name + "단가 : " + price ;
        String imsi ="Beverage에서 오버라이딩 한 문자";
        //return super.toString() + "/n" + imi;
     return super.toString() + "\n" +imsi;
    }

    public String getName() {
        return name;
    }




    public Beverage04(String name, double price){
        this.name  = name ;
        this.price = price ;
    }
    protected void showInfo() {
        System.out.println(" 음료이름 : " + name );
        System.out.println(" 단가 : " + price +"원");

    }



    }
    //.
