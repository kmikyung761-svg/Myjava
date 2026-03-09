package ch02_control_stement;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름 입력 :");
        String name = scan.nextLine();

        int[] jumsu = new int[3];

        int total = 0;
        double average = 0;

        for (int i = 0; i < jumsu.length; i++) {
            System.out.println("점수 입력: ");
            jumsu[i] = scan.nextInt();
            total += jumsu[i];
        }
        average = (double) total / jumsu.length;

        System.out.println("이름 : " + name);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f ", average);
    }
}
