import java.util.Random;

/**
 * Created by gorch on 5/16/2017.
 */
public class Lesson10 {
    public static void main(String[]args){
        System.out.println("ex 6.2");
        int n[] = {1,2,3,4,5,6,7,-8};
        int sum = 0;
        int i = 0;
        while(n[i] > 0){
            sum = sum + n[i];
            i ++;

        }
        int res = sum / i;
        System.out.println("sr orifmeticheskoe = " + res);

        System.out.println("ex 6.3");
        int n2[] = {-3,-7,-9,-45,6,7,234,9};
        i=0;
        while(n2[i] < 0){
        sum = sum + n2[i];
        i++;
        }
        System.out.println("summa = " + sum);

        System.out.println("ex 6.4");
        int n3[] = {-9,-1,-7,98,-14};
        i=0;
        while(n3[i]<0){
            i++;
        }
        System.out.println(i);

        System.out.println("ex 6.5");
        i=0;
        int a[] = new int [18];
        a[0] = 7;
        a[1] = 7;
        a[2] = 7;
        a[3] = 7;
        a[4] = 8;
        a[5] = 4;
        a[6] = 9;
        a[7] =10;
        a[8] =18;
        a[9] =12;
        a[10]=18;
        a[11]=19;
        a[12]=20;
        a[13]=21;
        a[14]=22;
        a[15]=24;
        a[16]=25;
        a[17]=24;

        while(a[i+1] == a[i]){

            i++;
        }
        System.out.println("result = " + (i+1));

        System.out.println("ex 6.6");
       //int a2[] = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
       //            0 1 2 3 4 5 6 7 8
        int number = 15;
        int a2[] = new int[15];
        for (i=0; i<a2.length; i++){
           a2[i] = i*2;
           System.out.println("i = " + i + " a2["+i+"] = " + a2[i] + "; ");
        }
        i = 0;
        while(a2[i]<= number){
            sum = sum + a2[i];
            i++;
        }
        System.out.println("sum = " + sum);
        i = 0;
        while (a2[i] < number ){
            i++;
        }
        System.out.println(i +" " + (i+1));

        System.out.println("ex 6.7");
        int a3[] = {1,2,3,4,5,6,7,0};
        i = 0;
        sum = 1;
        while(i < a3.length){
            sum = sum * a3[i];
            i++;
            if (a3[i] == 0 ){
                break;
            }
        }
        System.out.println("summa = " + sum);

    }
}
