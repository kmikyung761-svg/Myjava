package ch05_inheritance.Mybeverage;


public class Espresso04 extends Beverage04 {
    private  int shotCount ;
    public Espresso04(String name, double price, int shotCount){
        super(name,price);
        this.shotCount = shotCount ;
    }
public void printInfo(){
        super.showInfo();
    System.out.println("추가할 샷 : " + shotCount +"개" );
}

public  void drink(){
        String m = super.getName()+"를 마신다 (에스프레소)";
    System.out.println(m);
}
}
