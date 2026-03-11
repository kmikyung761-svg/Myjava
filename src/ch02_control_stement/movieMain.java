package ch02_control_stement;

public class movieMain {
    static void main(String[] args) {
        movie02 mov2 = new movie02("왕과 사는 남자",  "장항준" , 100);
//        mov2.setTitle("왕과 사는 남자"); // 영화제목
//        // 영화감독
//        mov2.drector = "장항준 ";
//        mov2.showtime = 100;
        mov2.showinfo();

        //System.out.println("제목 : " + mov2.tittle);// .멤버 참조 연산자
        System.out.println("감독 : " + mov2.drector);
        System.out.println("상영시간 : " + mov2.showtime);
    }
}
