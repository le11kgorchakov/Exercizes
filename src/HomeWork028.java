import com.sun.deploy.net.proxy.RemoveCommentReader;
import com.sun.deploy.util.ArrayUtil;

import java.util.Random;

/**
 * Created by gorch on 12/13/2017.
 */
public class HomeWork028 {
    public static void main (String []args){
        System.out.println("Es 11.16");
        int array [] = new int [11];
        Random rnd = new Random();
        int max = 0;
        for (int i = 0; i < array.length;i++) {
            int num = rnd.nextInt(100);
            array[i] = num;
           if (array[i]>max){
               max = array[i];
           }
            System.out.println(array[i]);
        }
        int s = array[0];
        int k = array[1];
        if (k % 2 == 0){
            System.out.println(" chislo " + k + " chetnoe ");
        }else{
            System.out.println(" chislo " + k + " ne chetnoe ");
        }
            if(s > 0){
                System.out.println(" chislo " + s  +  " pologitelnoe ");
            }else{
                System.out.println(" chislo " + s  +  " ortitsatelnoe ");
            }
        System.out.println("max number = " + max);

        System.out.println("Ex 11.17");

        int res = 0;
        int res2 =0;
        int res3 =0;
        int a = 1;
        array = new int [] {2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i ++){
            res = array[i] * 2;
            System.out.print("res = " + res + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i ++){
            res2 = array[i] - a;
            System.out.print("res2 = " + res2 + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i ++){
            res3 = array[i] / array[0];
            System.out.print("res3 = " + res3 + " ");
        }
        System.out.println();

        System.out.println("Ex 11.18");
        array = new int[] {20,22,24,37,87,44,34,34,28};
        res = 0;
        res2 = 0;
        for (int i = 8;i >= 0; i--){
            res+= array[i];
            res2 = array[i] - 20;
            System.out.println("array - 20 = " + res2);
        }
        System.out.println("sum of array = " + res);

        System.out.println(" Povtor ");
        int num = 932142537;
        int count = 0;
        while (num > 0){
            int n = num % 10;
            num /= 10;
            count++;
            array = new int[count+1];
            array[count] = n;
            System.out.print(array[count]);
        }
        System.out.println();

        System.out.println(" Povtor 2");
        num = 23434598;
        int dev = 10000000;
        count = 0;
        while (dev > 0 ){
            int n = num / dev;
            dev /= 10;
            n %= 10;
            array = new int[count+1];
            array[count] = n;
            System.out.print(array[count]);
        }
        System.out.println();

        System.out.println("Ex 11.152");
        array = new int[5];
        array[0] = 190;
        array[1] = 188;
        array[2] = 186;
        array[3] = 185;
        array[4] = 184;
        array[2] = array[array.length-1];
        int[] newArray = new int[array.length -1];
        for (int i = 0;i<newArray.length;i++){
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }

        System.out.println("array removing");
        array = new int []{1,2,3,4,5,6,7,8,9,10};
        int rem = 0;
        array[2] = array[array.length -1];
        newArray = new int[array.length -1];
        for (int i = 0; i < newArray.length;i++){
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }
        System.out.println("num");
        num = 987345;
        while (num > 0){
            int n = num % 10;
            num/=10;
            System.out.println(n);
        }
        System.out.println("____________");
       num = 234665427;
       dev = 100000000;
       while (dev > 0){
           int n = num / dev;
           dev /=10;
           n %=10;
           System.out.println(n);
       }

    }
}
