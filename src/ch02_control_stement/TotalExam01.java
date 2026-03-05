package ch02_control_stement;

public class TotalExam01 {
    static void main(String[] args) {
        String name ="김철수";  // 변수선언
        String grade ="" ;
        int kor = 85, eng = 70, math = 90 ;
        int total = kor + eng + math;
        double average = total/3.0 ;
        String message ;

    if(average >=90) {
        grade ="A";
    }else if (average >=85){
        grade ="B";
    }
    else if (average >=70){
        grade ="C";
    } else if (average >=60){
        grade = "D";
    }
    else {
        grade = "F";///else {    }나머지 grade
    }
switch (grade){
    case "A":
    case "B":
    message= "참 잘 하셨습니다";
    break;
    case "C" :
    case "D" :
        message = "조금만 더 노력하세요";
        break;
    case "F" :
        message = "다음 학기에 재수강하세요";
        break;
    default:// 그외 지정
        message="잘못된 입력입니다.";
}
        System.out.println("이름 : " + name +"님");
        System.out.println("국어 : " + kor +"점");
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + average +"점");
        System.out.println("학점 : " + grade);
        System.out.println("메시지 :"+ message );
    }
}
