package ch02_control_stement;
public class IF02 {
    static void main(String[] args) {
        //짝수이면 '하하하''를 홀수이면 '호호호'를 출력해주세요.--->선택2 가지
        int su = 4 ;
        //양자 택일 구문-->구문 확인 작업 경우의수 몇가지인지 알아야 한다.
        if(su%2 == 0){ //짝수이면
            System.out.println("하하하");
            System.out.println("는 짝수");
        }else{// 홀수이면
            System.out.println("호호호");
           System.out.println(su + "는 홀수");
        }
    }
}
