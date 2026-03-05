package ch02_control_stement;

public class MyArr01 {
    static void main(String[] args) {
       int x =3;
       int y =5;
        // 배열 정의 : 정수 3개를 배열로 만들어 봅니다.
        //타입[] 배열이름 = new 타입 [요소개수];
        // 요소 개수는 "배열 이름.length"라는 메소드로 접근이 가능합니다.
        //방법 01 : new 연산자를 사용하여 배열 정의
        int[] arr = new int[3] ; //arr은 배열 이름 입니다.  배열 이름.length <--배열의 갯수
        arr[0] =  x - y + 6 ; //4----->배열이 요소는 1부터 시작.
        arr[2] = arr[0] + 3; //7  4+3=7
        arr[1] = arr[0] + arr[2];//11  // 0,1,2 츌력한다. (i<3)----->i>arr.length 4+7=11

        for (int i = 0; i <arr.length ; i++)
            System.out.println(arr[i]);

        }
//// 방법02 : 초기화 기법
//        int[] brr = {15,30,22};
//        for (int i = 0 ;i < brr.length ; i++) {
//            System.out.println(brr[i]);
//        }
//    }

}
