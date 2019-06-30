/**
 * Created by gorch on 5/23/2017.
 */
public class Lesson11 {
    public static void main(String []args){

        int num = 100;
        int i = 0;

        int step = 1;
        while (i*i < num){
            i = i + step;
            System.out.println(i);
            step = step +2;

        }
        System.out.println(i);
        double i2 = 2;
        double a = 1.1;
        double in = 2;
        while(in > a){
            in = 1+ 1 / i2;
            i2 = i2 + 1;
            System.out.println(in);
        }


        System.out.println("ex 6.12");
        a = 1.3;
        i2 = 2;
        in = 2;
        while (in > a){
            in = 1 + 1 / i2;
            i2 = i2 + 1;

        }
        System.out.println(in);

        System.out.println("ex 6.13");
        a = 1.4;
        double n = 2;
        in = 2;
        while(in > a){
            in = 1 + 1/n;
            n = n + 1;
            System.out.println(in);
        }

        System.out.println("6.22");
        // int numb = 113485694
        // int[] arr = [1][1]3][4][5][6][7]
    }
}
