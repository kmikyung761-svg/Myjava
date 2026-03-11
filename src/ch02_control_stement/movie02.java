package ch02_control_stement;


public class movie02 {
    String title; // 영화제목 왕과 사는 남자
    String drector;//영화 감독
    int showtime;//상영시간
    //상영일

    public void setTitle(String tittle) {
        this.title= title;
    }

    public movie02(String tittle, String drector,int showtime){
        this.title = tittle ;
        this.drector = drector ;
        this.showtime = showtime ;
    }

    public void showinfo() {
        System.out.println("제목 : " + title);
        System.out.println("감독 : " + drector);
        System.out.println("상영시간 : " + showtime);
    }
}
