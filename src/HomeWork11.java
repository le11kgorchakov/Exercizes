import java.util.Scanner;

/**
 * Created by gorch on 5/24/2017.
 */
public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println("ex 6.14");
        double a = 1.04;
        double n = 2;
        double i = 2;
        while (i >= a) {
            i = 1 + 1 / n;
            n = n + 1;


        }
        System.out.println("n = " + n);
        System.out.println("i = " + i);

        System.out.println("ex 6.15");
        // a = 1.3  i = 1, 1+1/2, 1+1/3, 1+1/4...... print i < a
        a  = 1.4;
        i = 1;
        n = 21;
        //double dev = 1/n;

        while (i<a){
            System.out.println("i2 = " + i);
            i = 1 + 1/n;
            n = n - 1;

        }

        System.out.println("ex 6.16");

       i = 2;
       n = 2;
        i = 1;
        while (i > 1.1){
            System.out.println("chislo = " + i);
            i += 1 / n;
            n = n + 1;
           // i = result + 1/n;


            }




        System.out.println("n = " + n);




        System.out.println("ex 6.21");
        //fibonaci  0,1,1,2,3,5,8,13.....

        double number = 3;
        int first = 0;
        int second = 1;
        int third;
        while(first <= number){

            third = first + second;
            first = second;
            second = third;
            //first = 0 ,second = 1, third = 0 + 1 ,first 0 = second 1, second 1 = third 1; 1  + 1 = third 2;

        }
        System.out.println("first = " + first);


        System.out.println("ex 6.21  B");

        int a1 = 0;
        int b1 = 1;
        int numb = 1000;
        while (a1 < numb){
            System.out.println("a1 = " + a1);
            int c1 = a1 + b1;
            a1 = b1;
            b1 = c1;

        }

        System.out.println("ex 6.22");
        //find out how many 3 in the number
        number = 77;
        // 77
        double res = number / 3;
        System.out.println("a) result is =  " + res);
        res = number / 7;
        System.out.println("b) result is = " + res);
        res = number / 2;
        System.out.println("c) result is = " + res);
        res = (number / 6 ) * 6;
        System.out.println("d) result is = " + res);

        System.out.println("practice");
        i=0;
        n=10;
        while(n>i){
            n--;
            System.out.print(n + " , ");
        }




    }
}



