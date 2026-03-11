package ch05_inheritance.Mybeverage;


public class Latte04 extends Beverage04 {
    private String milkType; // 우유의 타입

    public Latte04(String name, double price, String milky) {
        super(name, price);
        this.milkType = milky;
    }

public String enjoy(){
        return "부드럽고 크리미한 "+super.getName()+"를 마십니다.\n";
}
public void enjoyLatte(){
        String message = enjoy();
    System.out.printf(message, super.getName());
}

    @Override
    public String toString() {
        String message = "\n 맛의 상태 : "+enjoy();
        return super.toString() +message;
    }
    public String getMilkType(){
        return milkType;
    }




    public void printInfo() {

        super.showInfo();
        System.out.println("선택한 우유의 타입 : " + milkType + "입니다.");
    }
}

