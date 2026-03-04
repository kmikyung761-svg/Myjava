package ch02_control_stement;

public class if05 {
    static void main(String[] args) {

        int su = 7;//su가 7의 배수이면 제곱 값을 출력하고, 7의 배수가 아니면 3을 더하는 프로그램 작성
        if (su % 7 == 0){// 7의 배수이면 제곱값 출력
            System.out.println(su * su);}
    else{// 7의 배수가 아니면
            System.out.println(su + 3);
        }
    }
}
