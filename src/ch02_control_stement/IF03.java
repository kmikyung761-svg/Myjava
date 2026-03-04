package ch02_control_stement;

public class IF03 {
    static void main(String[] args) {
        int jumsu = 75 ;
        if(jumsu >=90){
            System.out.println("A 학점");
        }else if (jumsu >=80){
            System.out.println("B 학점");
        }else if (jumsu >=70){
            System.out.println("C 학점");
    }else if(jumsu >=60){
            System.out.println("D 학점");
        }else {
            System.out.println("F 학점");
        }
       // 학점 매기기  경우의 수 5가지
    }
}
