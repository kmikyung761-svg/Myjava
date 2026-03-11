package ch05_inheritance.general;

public class Latte03 extends Beverage03 {
    private String milkType; // 우유의 타입

    public Latte03(String name, double price, String milky) {
        super(name, price);
        this.milkType = milky;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("선택한 우유의 타입 : " + milkType + "입니다.");
    }
}

