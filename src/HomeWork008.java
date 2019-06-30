import java.util.Scanner;

/**
 * Created by gorch on 5/3/2017.
 */
public class HomeWork008 {
    public static void main (String []args){

        System.out.println("ex 5.4a");
        for(int i = 10; i<=25;i++){
            double j = (double)i + 0.4;
            System.out.println(i+" "+j+" ");
        }
        System.out.println("ex 5.4b");
        for(int i = 25; i<=35;i++){
            double j = (double)i + 0.4;
            double k = (double)i - 0.2;
            System.out.println(i+" "+j+" " + k);
        }
        System.out.println("ex 5.5a");
        for (int i = 21; i >= 10; i --){
            double j = (double)i -1.8;
            System.out.println(i + " " + j);
        }
        System.out.println("5.5b");
        for (int i = 45; i >= 25; i --){
            double j = (double)i - 0.5;
            double k = (double)i - 0.8;
            System.out.println(i + " " + j + " " + k);
        }
        System.out.println("ex 5.7");

        for (int i = 1; i <= 20; i++){
           double price = (double) i * 20.4;
            System.out.println(i+" price " +price);
        }

        System.out.println("ex 5.6");
        for ( int i = 21; i <= 35; i ++){
            double j = (double)i  - 0.6;
            System.out.println(i + " " + j);
        }

        System.out.println("ex 5.8 ");
        for (int funt = 1; funt <= 10; funt ++){
            double kg = (double)funt * 0.453;
            System.out.println("funtov = " + funt + " kilogramov = " + kg);
        }
        System.out.println("ex 5.9");
        for (int duim = 10; duim <= 22; duim ++){
            double sm = (double)duim * 25.4;
            System.out.println(duim + " duimov = " + sm / 10 + " sm  " );
        }
        System.out.println("ex 5.10");
        System.out.println("Enter $ currency _____ ");
        Scanner scan = new Scanner(System.in);
        double kurs = scan.nextDouble();
        for (int d = 1; d <= 20; d++){

            double res  = d * kurs;
            System.out.println(d + " dollar = " + res + " rubley" );
        }
        System.out.println("ex 5.13");
        System.out.println("Tablica umnojeniya");
        System.out.print("vvedite chislo ....  ");
        scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        for (int i = 0; i <=9; i ++){
            int res = i * chislo;
            System.out.println(i + " * " + chislo + " = " + res);
        }

        System.out.println("ex 5.16");
        for (double i = 2; i <= 20; i ++ ){
            double res = Math.sin(i);
            System.out.println(res);
        }

        System.out.println("ex 5.17");
        for (int x = 4; x <= 28; x ++){
            int t = x + 2;
            int t2 = 5 * t - 2;
            int y = 2 * (t * t) + 5;
            int y2 = 2 * (t2 * t2) + 5;
            System.out.println("pri x = " + x + " y = " + y + "    y2 = " + y2 );

        }

        System.out.println("ex 5.18");
        for (int a = 2; a <= 17; a ++){
            int t = 4 * a;
            double z = 3.5 * (t * t) - 7 * t + 16;
            System.out.println("pri a = " + a + "  z =  " + z);
        }

        System.out.println("ex 5.19");
        for (double i = 0.1; i <= 1.1; i += 0.1){
            double res = Math.sin(i);
            System.out.println(res);
        }

        System.out.println("5.20");
        for (double i = 0.1; i <= 0.9; i += 0.1){
            double res = Math.sqrt(i);
            System.out.println(res);
        }
        System.out.println("ex 5.21");
        System.out.println("vvedite stoimost' za 1kg syra _________  ");
        scan = new Scanner(System.in);
        double price = scan.nextInt();
        for (double i = 50; i <= 1000; i += 50){
            double res = (i / 1000) * price;
            System.out.println("cena za " + i + " gramm" + " = " + res);
        }
        System.out.println("ex 5.23");
        for (double i = 2.1; i <= 2.8; i += 0.1){
            System.out.println(i);
        }
        System.out.println("ex 5.27");
        int res = 0 ;
        for (int i = 100; i <= 500; i ++){
             res += i;
        }
        System.out.println(res);

        System.out.println("5.27b");
        res = 0;
        for (int a = 457; a <= 500; a ++){
            res += a;
        }
        System.out.println(res);

        System.out.println();

    }
}
