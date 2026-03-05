package ch02_control_stement;

public class For03 {
    static void main(String[] args) {
     int total = 0 ;
        //1+2+3+...+50 = 1275
        //2+4+6+...+100= 2550
        for (int i =1 ; i <51 ; i++) {
            total += i;
        }
            System.out.println("총합01: " + total);
    }
}
// 정답 :1275



