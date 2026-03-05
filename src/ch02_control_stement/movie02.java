package ch02_control_stement;


public class movie02
{
    String tittle ; // 영화제목 왕과 사는 남자
    String drector ;//영화 감독
    int showtime;//상영시간
     //상영일


    public void setTittle(String _tittle){
        tittle=_tittle ;
        System.out.println(tittle );
    }
    public void  showinfo(){
        System.out.println("제목 : "+ tittle);
        System.out.println("감독 : "+ drector);
        System.out.println("상영시간 : "+showtime);
    }
}
