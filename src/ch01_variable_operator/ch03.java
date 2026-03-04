
public class ch03 {
    static void main(String[] args) {
        int x = 3 ;
        int y = 8 ;
        int z = 4 ;
        int min = x < y ? x : y ;
            min = min < z ? min : z ;
        System.out.println("최소값" + min + "result");
    }
}
