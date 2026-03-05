package ch02_control_stement;

public class while01 {
    static void main(String[] args) {
        int total = 0 ;
        int i =  1 ;
        while (i <97 ){
            ; // i가 2부터 +// 반복횟수가 정해진것 for =>그외 while
             total += i * i;
            i+=5 ;
        }
        System.out.println("총합01 : " + total);
        
        
        
        
        
         total = 0 ;
        // 2 + 4 + 6 + ... + 100 = 2550

        for (i =2; i <101 ; i+=2) {
            total += i ;
        }
        System.out.println("총합06 : " + total);

        total = 0;
        for ( i = 1; i<100 ; i+=2) {
            total+=i;
        }
        System.out.println("총합03 : " + total);



        total = 0 ;
        for ( i = 100 ; i>=5; i-=5) {
             total +=i ;
        }
        System.out.println("총합04 : " + total);

        total = 0 ;
        for (i =2 ; i<=20 ; i+=2) {
            total+=i*i;
        }
        System.out.println("총합05 : " + total);
        total = 0;
        for (i =5; i<=100 ; i+=5) {
            total+= i*i ;
        }
        System.out.println("총합06 : " + total);
        //100부터 2까지  2씩 뺀 값을 total에 저장 및 출력

        total = 0;
        for (i = 100 ; i >=2 ; i-=2) {
            total +=i ;
        }

        System.out.println("총합06 : " + total);
        // 1x1 ~1*9;
        //1 부터 9번까지 반복해준다.
        total = 0;
        for (i =1; i<10 ; i++) {
            System.out.println("2 * " +i  +"="+ (2 * i ));
        }
    }
}


/*
* int 변수 = 할당 또는 초기화
* 반복하겠다 이 조건에 따라(조건){
* 반복하는 횟수를 증가 한다 (증감식)
* */
// 초기식

