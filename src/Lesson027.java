import java.util.Random;

/**
 * Created by gorch on 12/12/2017.
 */
public class Lesson027 {

    public static int abs(int a) {
        if(a < 0){
            return -a;
        }else{
            return a;
        }
        //return (a < 0) ? -a : a;
    }


    public static void main (String [] args){
        System.out.println("Ex 11.1");
        int array [] = {37,0,50,46,34,46,0,13};
        for (int i =0; i<array.length;i++) {
            System.out.println(array[i]);
        }
        array = new int[8];
        array[0]=37;
        array[1]=0;
        array[2]=50;
        array[3]=46;
        array[4]=34;
        array[5]=46;
        array[6]=0;
        array[7]=13;
        for (int i =0; i<array.length;i++) {
            System.out.println(array[i]);
        }

        System.out.println("Ex 11.3");
        Random rnd = new Random();
        double DArray [] = new double[15];
        for (int i = 0;i< DArray.length;i++){
            double num = rnd.nextDouble();
            DArray[i]=num;
            System.out.println(DArray[i]);
        }
        System.out.println("Ex 11.3 B");
        DArray = new double[15];
        for (int i = 0; i < DArray.length;i++){
            double num = rnd.nextDouble();
            DArray[i]=num + 22;
            System.out.println(DArray[i]);
        }
        System.out.println("Ex 11.3 C");
        array = new int[15];
        for (int i =0; i<array.length;i++){
            int n = rnd.nextInt(10);
            array[i] = n;
            System.out.println(array[i]);
        }
        array = new int[15];
        for (int i =0; i<array.length;i++){
            int n = rnd.nextInt()%10;
            //array[i] = Math.abs(n);
            array[i] = (n <0 ) ? -n : n;

            System.out.println(array[i]);
        }
        System.out.println("Ex 11.3 D");
        array = new int[15];
        for (int i = 0 ;i < array.length;i++){
            int n = rnd.nextInt(100)-50;
            array[i] = n;
            System.out.println(array[i]);
        }
        System.out.println("Ex 11.3 D");
        array = new int[15];
        for (int i = 0 ;i < array.length;i++){
            int n = rnd.nextInt();
            array[i] = Math.abs(n%100)-50;
            System.out.println(array[i]);
        }

        System.out.println("Ex 11.7");
        array = new int[20];
        int c = 20;
        for (int i = 0;i<array.length;i++){
            array[i]=c;
            System.out.println(array[i]);
            c--;
        }
        System.out.println("Ex 11.10");

        int n = 123654987;
        int dev = 10;
        c = n;
        while (c>0){
            int num  = c % 10;
            c = c / 10;
            System.out.println(num);
        }

    }
}
