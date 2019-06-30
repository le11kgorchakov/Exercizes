import java.security.Principal;

/**
 * Created by gorch on 9/22/2017.
 */
public class HomeWork019 {
    /*
     Билли Бонс положил в сундук некоторое количество золотых монет. На второй год он вынул из сундука положительное количество монет.
     Начиная с третьего года, он добавлял столько монет, сколько было в сундуке два года назад.

    Требуется написать программу, которая определит, сколько монет было в сундуке в первый и во второй года, если в X-м году там оказалось ровно Y монет.
    6 25
    //1god   5
    2 god    2
     */

    public static void main(String[] args) {
        System.out.println("billi bong ");
        int year = 6;
        int num = 25;
        int first = 5;
        int second =2;

        int res =0;
        boolean isEnd = false;
       for (first = 1;first<100;first++){

           for (second =1;second<100;second++){
                int a1 = first;
                int a2 = second;

               for (int i = 3;i<=year; i++) {
                   res = a1 + a2;  // 5 2 7 9 16 25
                   a1 = a2;
                   a2 = res;
               }
               if(res == num){
                   isEnd = true;
                   break;
               }

           }
           if(isEnd){
               break;
           }
       }
       System.out.println("first = " + first + " second = " + second);
       System.out.println("res = " + res);







        System.out.println("Ex 4.121");

        int a, b, c, d;
        a = 4;
        b = 6;
        c = 8;
        d = 7;
        if ((a % 2 != 0 && b % 2 != 0 || a % 2 == 0 && b % 2 == 0) == (c % 2 != 0 && d % 2 != 0 || c % 2 == 0 && d % 2 == 0)) {
            System.out.println("they both black color");
        } else {
            System.out.println("they are different color");
        }

    }
}
