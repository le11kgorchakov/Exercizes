/**
 * Created by gorch on 4/23/2017.
 */
public class Lesson007 {
    public static void main(String []args){
       int a = 14;
       int b = 16;
       if (a > b){
           System.out.println(" a = " + a);
       }
       if (b > a){
           System.out.println(" b = " + b);
       }

       String message = "a > b";
       a = 24;
       b = 51;
       if (a < b){
           message = "a < b";

       }
        System.out.println(message);

        System.out.println("4.71");
        a = 11;
        b = 12;
        if (a > b){
            System.out.println("a naibolshee , b naimenshee");

        }
        if (a < b){
            System.out.println(" b  naibolshee, a naibolshee");
        }

        String m = "a naibolshee b naimenshee";
        a = 14;
        b = 16;
        if(a < b){
            m = "b naibolshee a naimenshee";
        }

        System.out.println("ex 4.72");
        a = 13;
        b = 14;
        int c = 17;
        if (a > b && a > c){
            System.out.println("a naibolshee ");
        }
        if (b > a && a < c){
            System.out.println("b naibolshee");
        }
        if (c > a && a < b){
            System.out.println("c naibolshee");
        }

        System.out.println("ex 4.74");

        a = -18;
        if (a < 0){
            a = a * -1;

        }
        System.out.println("res = " + a);

        System.out.println("ex 4.75");
        a = -66;
        b = 17;
        if (a < 0){
            a = a * -1;

        }
        if (b < 0){
            b = b * -1;
        }
        double q = (double)a / 2.0;
        double w = b / 2.0;
        System.out.println("polusumma a = " + q + " polusumma b = " + w);

        System.out.println("ex 4.77");
        a = 34;
        b = 17;
        if (Math.sqrt(b) < a){
            b = b * 5;
        }
        System.out.println(" b = " + b);

        System.out.println("4.80");
        a = 1;
        b = 2;
        c = 3;
        if (a > 1.6 && a < 3.8){
            System.out.println("a prenadlegit intervalu " + a);
        }
        if (b > 1.6 && b < 3.8){
            System.out.println("b prenadlegit intervalu " + b);
        }
        if (c > 1.6 && c < 3.8){
            System.out.println("c prenadlegit intervalu " + c);
        }

        System.out.println("ex 4.84");
        a = 44;
        b = 15;
        c = 18;
        int d = 77;
        int summ = 0;
        if (a % 3 == 0){
             summ = summ + a;

        }
        if (b % 3 == 0){
            summ = summ + b;
        }
        if (c % 3 == 0){
            summ = summ + c;
        }
        System.out.println("summa = " + summ);

        System.out.println("ex 4.85");
        int x = 5;
        int y = 0;
        if (x < -1){
            y = -1;

        }
        if (x > -1){
            y = x;
        }
        if (x == -1){
            y = 1;
        }
        System.out.println(" y = " + y);

        double xx = 0.9;
        double f  =xx*xx;
        if(xx<=0){
            f = 0;
        }
        if (xx >0 && xx <=1){
            f = x;
        }
        System.out.println("f = " + f);

        System.out.println(" 4.88");
        xx = 0.11;
        f = -3 * y;
        if (y >2){
            f = 2;
        }
        if (y > 0 && y <= 2){
            f = 0;
        }
        System.out.println("f = " + f);

        y = 9;
        if(x>1){
            if(x>5){

            }
            if(x<5){

            }
        }
        System.out.println("ex 4.32");
        int num = 6587;
        int t = num / 1000;
        int s = num / 100 % 10;
        int de = num % 100 / 10;
        int e = num % 10;
        System.out.println(t + " " + s + " " + de + " " + e);
        if (t + s == de + e){
            System.out.println(" summy ravny");
        }
    }
}
