package ch01_variable_operator;

public class Operatior01 {
    static void main() {

        int a= 3 - -2 ;
        int b= 3;
        int x=(a>=b) ? 5: (a+2);
        x += ++a ;
        int y = ++ a ;
        System.out.println(x);
        y += a + --b ;
        System.out.println(y);
        char ch3 = 'D' ;
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2 ;
        System.out.println(z);
        int result = 0;
        result = x > y ? z-y : x + z ;
        System.out.println("result :" + result);








    }
}
