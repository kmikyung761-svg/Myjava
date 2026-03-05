package ch02_control_stement;

import java.util.Scanner;

public class while03 {
    static void main(String[] args) {
         int answer = 40 ;// 컴퓨터가 생각하고 있는 숫자 (1)
        Scanner scan = new Scanner(System.in);
        while(true) {//endless while loop 무한 while loopint(2)
            System.out.println("1부터 100사이의 정수 1개 입력하세요.");
             int input = scan.nextInt();  //(2)
            System.out.println("입력한 숫자 : " + input);
            // 바코드 스캐너 scanner 준비합니다
            if(answer == input) {// 맞춘 경우
                System.out.println("정답입니다.");//(3)
                //무제한 출력  강제로 stop 하기 전까지
                break;
            }else if (answer > input) {// 정답이 큰 경우
                System.out.println(input + "보다 큰 수입니다.");
            }else{// 정답이 작은 경우
                System.out.println(input + "보다 작은 수 입니다.");
            }
        }
    }
}
