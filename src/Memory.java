import java.awt.*;
import java.util.Arrays;

/**
 * Created by gorch on 1/25/2018.
 */
public class Memory {
    public static void main (String args[]){
        System.out.println("vspomnit");
        int [] finalGrades = {1,2,3,4,15,9,9,8,9};
        int sum = 0;
        Arrays.sort(finalGrades);
        int MedGrades = finalGrades.length/2;
        System.out.println("srednee = " + finalGrades[MedGrades]);
        System.out.println(MedGrades);
        for (int i = 0; i < finalGrades.length; i++){
            System.out.println(finalGrades[i]);
            sum+=finalGrades[i];
        }
        int Med = sum/finalGrades.length;
        System.out.println("sum = " + sum + "  Med = "+ Med);

        System.out.println();
        System.out.println("Ex 11.44");
        int FootballTeams[] = {3,4,5,2,6,7,2,2,1,3,8,2};
        for (int i = 0;i < FootballTeams.length;i++){
            if(FootballTeams[i] < 3 && FootballTeams[i] > 0){
                System.out.println(i);
            }
        }

        System.out.println("2.33");
        /*В трехзначном числе x зачеркнули его последнюю цифру. Когда в оставшемся двузначном числе переставили цифры, а затем приписали к ним слева последнюю цифру числа x,
        то получилось число n. По заданному n найти число x (значение n вводится с клавиатуры, 1 ≤ n ≤ 999 и при этом число единиц в n не
равно нулю). 746 */

        int x = 647;
        int sotni = x /100;
        int desyatki = (x % 100) / 10;
        int edenitsy = (x % 100) % 10;
        System.out.println(sotni+ " " + desyatki + " " + edenitsy);
        int result = edenitsy * 100 + desyatki * 10 + sotni;
        System.out.println(" result  number = " + result);

        System.out.println();
        System.out.println(" Работа светофора для водителей запрограммирована следующим образом: в начале каждого часа в течение трех минут " +
                "горит зеленый сигнал, затем в течение одной минуты — желтый, в течение двух минут — красный, в течение трех минут — опять зеленый и т. д." +
                " Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа. Определить,\n" +
                "сигнал какого цвета горит для водителей в этот момент.");
        /* 1,2,3 ,6,7,8 Gr
           4,10 Yellow
           5,6,11,12 Red
         */
        int t1 = 5;
        int z=t1%6;
        if(z>=0&&z<=3){
            System.out.println("green");
        }
        if(z>3&&z<=4 || t1 == 4){
            System.out.println("yellow");
        }
        else{
            System.out.println("red");
        }

        System.out.println("___________________________________________________________________________");


        if (t1 >30){
            t1 -=30;
        }
        switch (t1){
            case 1:case 2:case 3:case 7:case 8:case 9:case 13:case 14:case 15:case 19:case 20:case 21:case 25:case 26:case 27:
                System.out.println("Green");
                break;
            case 4:case 10:case 16:case 22:case 28:
                System.out.println("Yellow");
                break;
            case 5:case 6:case 11:case 12:case 17:case 18:case 23:case 24:case 29:case 30:
                System.out.println("Red");
                break;
        }


        System.out.println("2.38");
        /*Даны целое число k (1 k 150) и последовательность цифр 101102103...149150, в которой выписаны подряд все трехзначные числа от 101
до 150.
1-1  11-0 21-7 31-1 41-1
2-0  12-4 22-1 32-1 42-4
3-1  13-1 23-0 33-1 43-1
4-1  14-0 24-8 34-1 44-1
5-0  15-5 25-1 35-1 45-5
6-2  16-1 26-0 36-2 46-1
7-1  17-0 27-9 37-1 47-1
8-0  18-6 28-1 38-1 48-6
9-3  19-1 29-1 39-3 49-1
10-1 20-0 30-0 40-1 50-1
*/

        int k = 45;
        int y = k/3;
        System.out.println();
        if (k % 3 == 0){
            int res = k / 3 % 10;
            System.out.println(res);
        }else if (k % 3 != 0){
            int res = (k / 3) / 10;
            System.out.println(res);
        }else if (k % 3 == 2){
            int res = 0;
            System.out.println(res);
        }

    }
}
