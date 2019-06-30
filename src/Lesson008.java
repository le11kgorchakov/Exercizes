import java.util.Scanner;

/**
 * Created by gorch on 5/2/2017.
 */
public class Lesson008 {
    public static void main (String []args){
        System.out.println("ex 4.33");
        int n = 44;
        int d = n / 10;
        int e = n % 10;
        if (e % 2 == 0){
            System.out.println("chetnoe");
        }else {
            System.out.println("nechetnoe");
        }
        System.out.println("ex 4.34");
        int a = 8;
        int b = 4;
        if (a % b == 0){
            System.out.println("chislo b delitel chisla a");
        }if (b % a == 0){
            System.out.println("chislo a delitel chisla b");
        }
        System.out.println("4.35");
        a = 144;   // stol
        b = 44;
        int c = 9; //korobka
        d =4;
        int dl = a / c;
        int k = b/ d;
        System.out.println("dlinnaya st vmechaet " + dl);
        System.out.println("korotkaya st vmechaet " + k);
        if (dl > k){
            System.out.println("pri razmechenie dlinnoi storonoi bolshe");
        }if (k > dl){
            System.out.println("pri razmechenie korotkoi storonoi bolshe");
        }
        System.out.println("ex 4.36");
        int t = 9;
        int kr = 2;
        int zel = 3;
        c = t % (kr + zel);
        if (c < kr){
            System.out.println("gorit krasnyi");
        }else {
            System.out.println("gorit zelenyi");
        }
        System.out.println("4.38");
        n = 9;
        int x = 3;
        int y = 2;
        if (n >= x && n >= y){
            System.out.println("n popodaet v zadannuyu oblast");
        }else {
            System.out.println("n ne popodaet v zadannuyu oblast");
        }
        System.out.println("ex 4.44");
        a = 84;
        b = 14;
        c = 16;
        d = 6;
        if (a % b == c || a % b == d){
            System.out.println("uslovie vernoe");
        }else {
            System.out.println("uslovie ne vernoe");
        }



        for(int i =0; i<10; i++){
            //тело цикла
        }

        int j = 151;
        for(;;){
            if(j>171){
                break;
            }
            System.out.print("LOOP!!!");
            j++;
        }
        System.out.println("ex 5.1");
        int number = 20;
        for (n = 0; n < 10; n++){
            System.out.print(number+" ");
        }
        System.out.println("ex 5.3");

        for (n = 20; n <= 35; n++){
            System.out.println(n);
        }
        System.out.println("ex 5.3b");
        System.out.print("enter b =  ");
        Scanner scan = new Scanner(System.in);
        b =scan.nextInt();
        for (int i = 10;i<b;i++){
            System.out.println(i*i);
        }
        System.out.println("ex 5.3c");
        System.out.print("enter b =  ");
        scan = new Scanner(System.in);
        b = scan.nextInt();
        for (int i = 10;i<b;i++){
            System.out.print(Math.pow(i,3));
        }
    }
}
