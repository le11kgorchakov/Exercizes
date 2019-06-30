import java.util.Random;

/**
 * Created by gorch on 6/4/2017.
 */
public class Practice {
    public static void main(String[] args) {
        System.out.println("wow");
       int x= 365;
       int tens = x/10;
       int single = x%10;
       int hundreds = tens/10;
        System.out.println(" tens = " + tens +" singles = "+single + " hundreds = " + hundreds);

        System.out.println(" 8.1 ");
        int num = 5;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j <= 6;j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for (int i = 1;i <=5;i++){
            for (int j = 0; j< i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        for (int i = 1;i <=5;i++){
            for (int j = 0; j<10 ; j++){
                System.out.print(i+ " ");
            }
            System.out.println(i+" ");
        }

        System.out.println("Ex 8.7 and 8.8");
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                int res = j * i;
                System.out.print(i+" x "+j+ " = " + res + "    ");
            }
            System.out.println();
        }
        System.out.println("8.25 and 8.26 ");
        for (int i = 120; i <= 140; i ++ ){
            int delitel = 0;
            String del = "  ";
            for (int j = 1;j <=i; j++){
                if (i % j == 0){
                    delitel += 1;
                    del += " + ";
                }
                }
            System.out.println(" chislo = " + i +"   deliteley = " + delitel + " + =  " + del + " ");
            System.out.println();

        }

        System.out.println(" Ex 9.7 ");
        String name = "Spartak";
        int dl = name.length();
        System.out.println(dl);

        System.out.println(" num ");
        num = 1987987654;
        while (num > 0) {
            int chislo = num % 10;
            System.out.print(chislo);
            num/=10;
        }

        System.out.println();
        System.out.println(" num 2 ");
        num = 1987987654;
        int dev = 1000000000;
        while (dev > 0) {
            int chislo = num / dev;
            dev/=10;
            chislo%=10;
            System.out.print(chislo);
            }
        System.out.println();

        System.out.println("Ex 11.3" +
                "Заполнить массив из пятнадцати элементов случайным образом: " +
                "а) вещественными значениями, лежащими в диапазоне от 0 до 1; " +
                "б) вещественными значениями х (22  х < 23); " +
                "в) вещественными значениями х (0  х < 10); " +
                "г) вещественными значениями х (–50  х < 50); " +
                "д) целыми значениями, лежащими в диапазоне от 0 до 10 включительно");

        int array[] = new int[15];
        Random number = new Random();
        for (int i = 0;i < array.length;i++){
            int n = number.nextInt(2);
            array[i] = n;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0;i < array.length;i++){
            int n = number.nextInt(1)+22;
            array[i] = n;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0;i < array.length;i++){
            int n = number.nextInt(10);
            array[i] = n;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0;i < array.length;i++){
            int n = number.nextInt(100)-50;
            array[i] = n;
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("11.4 " +
                " Массив предназначен для хранения значений ростов двенадцати человек.  " +
                "С помощью датчика случайных чисел заполнить массив целыми значениями," +
                " лежащими в диапазоне от 163 до 190 включительно. ");

        array = new int[12];
        for (int i = 0;i < array.length; i++){
            int n = number.nextInt(27)+163;
            array[i] = n;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("2.37. Даны целое число k (1  k  180) и последовательность цифр 10111213...9899, " +
                "в которой выписаны подряд все двузначные числа. Определить: а) номер пары цифр, в которую входит k-я цифра; " +
                "б) двузначное число, образованное парой цифр, в которую входит k-я цифра; " +
                "в) k-ю цифру, если известно, что:  k — четное число;  k — нечетное число. ");
        int k =179;

        if (k%2==0){
            int z = (k / 2)+9;
            z%=10;
            System.out.println(z);
        }else if (k%2!=0){
            int s = (k / 2)+10;
            s/=10;
            System.out.println(s);
        }

        System.out.println("2.38. Даны целое число k (1  k  150) и последовательность цифр 101102103...149150, " +
                "в которой выписаны подряд все трехзначные числа от 101 до 150. Определить k-ю цифру, если известно, " +
                "что:  k — число, кратное трем;  k — одно из чисел 1, 4, 7, ...;  k — одно из чисел 2, 5, 8, ... ");
        k =150;

        System.out.println(k%3);
        if (k%3==1){
            int z = (k /3) + 101;
            z/=100;
            System.out.println(z);
            }else if (k%3==0){
            int s = (k /3) + 100;
            s%=10;
            System.out.println(s);
        }else if (k%3==2){
            int c = (k / 3) + 101;

            System.out.println(c);
        }

    }
   }
