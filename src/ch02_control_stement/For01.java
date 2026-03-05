package ch02_control_stement;

public class For01 {
    static void main(String[] args) {
        //1부터 10까지의 총합
        int total = 0; // 변수 0정의 0값 할당
        for (int i = 1; i < 97; i += 3) { //int->1 1씩 증가  ---11 대입
            total += i * i;
        }
        System.out.println("총합02: " + total);
        //1 + 4+ 7+ ...+ 100 =1717

        total = 0; // 변수 0정의 0값 할당
        for (int i = 1; i < 11; i++) { //int->1 1씩 증가  ---11 대입
            total += i * i;
        }
        System.out.println("총합01: " + total);
        total = 0;
        for (int i = 1; i < 51; i++) {
            total += i;
        }
        System.out.println("총합01: " + total);
    }
}



/*
  0               1
          0+1           2
          1+2           3
          3+3           4
          6+4           5
          10+5          6
          15+6          7
          21+7          8
          28+8          9
          36+9          10
          45+10         11//<소멸><---- 거짓 판별 되서 실행이 안된다.  i 소멸 된다.
total(소멸)


 */

