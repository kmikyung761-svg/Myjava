package ch05_inheritance.Mybeverage;



public class Americano04 extends Beverage04 {
    private double waterAmount;

    public Americano04(String name, double price, double waterAmount){
            //서브 클래스의 생성자의 첫줄에는 super();라는 단어가 히든
            //매개변수가 0개인 수퍼 클래스이다.
            // 사용자가 super(매개변수); 형식으로 다시 작성하면,super();는 사라진다.
            super(name,price);// 생성자를 통하여 수퍼 클래스에 넘겨 줍니다.
            this.waterAmount = waterAmount ;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println(" 투입된 물의 양 : " + waterAmount +"ml");

    }

    @Override
    public String toString() {
        String ismi =", 물의 양 : " + waterAmount;
        return super.toString() + ismi;
    }

    // sip: 홀짝 홀짝 마시다.
    public void sipAmericano() {

    }

    public void drink() {
    }
}

