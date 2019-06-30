import java.util.Random;

/**
 * Created by gorch on 11/15/2017.
 */
public class Lesson025 {
    public static void main(String [] args){
        System.out.println("Ex 6.1");
        int aray [ ] = {1,2,3,4,5,6,0};
        int i = 0;
        int sum = 0;
        while (aray[i] != 0){
            sum+=aray[i];
            i++;
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 6.2");
        aray = new int [] {1,2,3,4,5,6,-7};
        i = 0;
        sum = 0;
        while (aray[i] > 0 ){
            sum+=aray[i];
            i++;
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 6.3");
        aray = new int [] {3,5,7,2,3,4};
        i = 0;
        sum = 0;
        while (aray[i] %2 != 0){
            sum +=aray[i];
            i++;
        }
        System.out.println("sum = " +sum);

        System.out.println("Ex 6.4");
        aray = new int [] {-1,-2,-3,-4,5,5,6,7,7};
        i = 0;
        sum  = 0;
        while (aray[i] < 0){
            sum += aray[i];
            i++;
        }
        System.out.println("quantity  = " + i);

        System.out.println("2.38");
        aray = new int[150];

        int count = 0;
        int ed = 0;
        int des = 0;
        int sot =0;
        for (i = 101;i <= 150;i++){
           sot = i / 100;
           aray [count] = sot;
           count++;
           des = i % 100 / 10;
           aray [count] = des;
           count++;
           ed = i % 10;
           aray [count] = ed;
           count++;

        }
        for (i = 0; i<aray.length;i++){
            System.out.print(aray[i]);
        }

        System.out.println("Ex 11.1");
        int array[] = {37,0,50,46,34,46,0,13};

        System.out.println("Ex 11.3");
        array = new int [15];
        Random rnd = new Random();
        for (i=0;i<array.length;i++){
            int number = rnd.nextInt(2);
            array[i] = number;
            System.out.println(array[i]);
        }

        System.out.println("Ex 11.6");
        array = new int[13];
        for (i = 1;i<array.length;i++){
            array[i] = i;
            System.out.println(array[i]);
        }
        array[0] = 1562343;
        int j = 0;
        count = 0;
        System.out.println(array[j]+" " + array[count] + " " + array[0]);

        System.out.println("Ex 11.7");
        array = new int [20];
        count = 0;
        for (i = 19; i >=0 ; i--){
            array[count]=i+1;
            count++;

        }

        for(i = 0; i< array.length; i++){
            System.out.println(" " + array[i]);
        }

    }

}
