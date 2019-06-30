/**
 * Created by gorch on 11/9/2017.
 */
public class HomeWork024 {
    public static void main(String[] args) {
        System.out.println("Ex 6.1");
        int number = 1234567890;
        int devider = 1000000000;
        int res = number;
        int count = 0;
        int res2 = 0;
        int summa = 0;

        while (res > 0) {
            res /= 10;
            count++;
        }
        System.out.println("count = " + count);

        while (devider > 0) {
            res2 = number / devider;
            devider /= 10;
            res2 %= 10;
           // System.out.println("result   " + res2);
            summa += res2;
        }
        System.out.println("summa = " + summa);

        System.out.println("Ex 6.2");
        int array[] = {1, 2, -3, 4, 5, 6, 7, 8, -9};
        summa = 0;
        count = 0;
        for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);
            if (array[i] > 0) {
                summa += array[i];
            }
            count++;
        }
        System.out.println("summa = " + summa + " count = " + count);

        System.out.println("Ex 6.3");
        array = new int[]{3, 5, 7, 2, 4, 5, 6, 7};
        boolean start = false;
        summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (start == false && array[i] % 2 != 0) {
                summa += array[i];
                System.out.println("array = " + array[i]);
            } else {
                start = true;
                break;
            }

        }
        System.out.println("summa = " + summa);

        System.out.println(" Ex 6.4 ");
        array = new int[]{-23, -11, -34, -434, 9, -2, 44, 63, 34, -4, -7, 45};
        start = true;
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (start == true && array[i] < 0) {
                count++;
            } else {
                start = false;
                break;
            }
        }
        System.out.println("count = " + count);

        System.out.println(" Ex 6.5 ");
        array = new int[]{6, 6, 453, 676, 3, 4, 6, 4545, 6, 4543, 6, 454, 6, 6};
        count = 0;
        int equel = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == equel) {
                equel = array[i];
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println(" Ex 6.6 A");
        int n = 10;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16};
        summa = 0;
        int nLess = 0;
        int nI = 0;
        int nMore = 0;
        int nI2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                summa += array[i];
            }
        }
        System.out.println("sum of numbers less then N =" + summa);

        System.out.println(" Ex 6.6 B");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                nLess = array[i];
                nI = i;
            } else if (array[i] > n) {
                nMore = array[i];
                nI2 = i;
                break;
            }
        }
        System.out.println(" number less then n = " + nLess + " array number is = " + nI);
        System.out.println(" number bigger then n = " + nMore + " array number is = " + nI2);

        System.out.println("Ex 2.27");
        // x = 123 ->23-> *10 + 1 -> 231
        int num = 231;
        int sot = 0;
        int des = 0;
        int ed = 0;

        ed = num % 10;
        sot = num / 100;
        des = (num / 10) % 10;

        int x = (num -1)/10+100;
        System.out.println(sot + " " + des + " " + ed);
        System.out.println(x);


        System.out.println("Ex 2.35");
        //a2a1== a1=20 a2=1, b2b1== b1=10 b2=4;
        int a1=20;
        int a2=1;
        int b1=10;
        int b2=4;
        int sum = 0;
        sum = a1+a2+b1+b2;
        System.out.println(sum);

        System.out.println("Ex 2.38");
        /* . Даны целое число k (1 k 150) и последовательность цифр 101102103...149150, в которой выписаны подряд все трехзначные числа от 101 до 150. Определить k-ю цифру, если известно,
         что: k — число, кратное трем; k — одно из чисел 1, 4, 7, ...;
k — одно из чисел 2, 5, 8, ...*/
        num =98;


    }
}
