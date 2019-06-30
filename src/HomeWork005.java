/**
 * Created by gorch on 4/11/2017.
 */
public class HomeWork005 {
    public static void main(String [] args){
        System.out.println("ex 2.29");
        int x = 356;
        int d1 = x / 100;
        int d2 = x % 100;
        int d3 = d2 / 10;
        int d4 = d2 % 10;
        int n = d3 * 100 + d1 * 10 + d4;
        System.out.println("n = " + n);

        System.out.println("ex 2.30");
        x = 465;
        d1 = x / 100;
        d2 = x % 100;
        d3 = d2 / 10;
        d4 = d2 % 10;
        n = d1 * 100 + d4 * 10 + d3;
        System.out.println("n = " + n);

        System.out.println("2.31");
        n = 346;
        d1 = n / 100;
        d2 = n % 100;
        d3 = d2 / 10;
        d4 = d2 % 10;
        x = d1 * 100 + d4 * 10 + d3;
        System.out.println("n = " + x);

        System.out.println("ex 2.32");
        n = 654;
        d1 = n % 100;
        d2 = d1 / 10;
        d3 = d1 % 10;
        d4 = n / 100;
        x = d3 * 100 + d2 * 10 + d4;
        System.out.println("x = " + x);

        System.out.println("ex 2.33");
        n = 643;
        d1 = n % 100;
        d2 = d1 / 10;
        d3 = d1 % 10;
        d4 = n / 100;
        x = d3 * 100 + d2 * 10 + d4;
        System.out.println("x = " + x);

        System.out.println("2.34");
        int a2 = 2;
        int a1 = 5;
        int b = a2 * 10 + a1;
        System.out.println("b = " + b );


    }
}
