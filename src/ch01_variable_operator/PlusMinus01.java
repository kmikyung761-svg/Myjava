package ch01_variable_operator;

public class PlusMinus01 {
    static void main() {
        int a = 10, b =20, c ;
        c= ++a + b++ ;
        System.out.println("a : "  + a);//
        System.out.println("b : "  + b);//
        System.out.println("c : "  + c);//

        c= a++ + --b ;
        System.out.println("a : "  + a);//
        System.out.println("b : "  + b);//
        System.out.println("c : "  + c);//

        c= --a + --b ;
        System.out.println("a : "  + a);//
        System.out.println("b : "  + b);//
        System.out.println("c : "  + c);//
        a = 10 ;
        b = 20 ;
        ++a ;
        b--;

        c=++a + b-- ;
        System.out.println("a : "  + a);//
        System.out.println("b : "  + b);//
        System.out.println("c : "  + c);//

                int x = 3, y =5, z ;
                z = x++ + --y ;
                System.out.println("x : "  + x);//
                System.out.println("y : "  + y);//
                System.out.println("z : "  + z);//
        z+=--x + y++ ;
        System.out.println("x : "  + x);//
        System.out.println("y : "  + y);//
        System.out.println("z : "  + z);//

            }
}
