/**
 * Created by gorch on 6/5/2017.
 */
public class HomeWork012 {
    public static void main (String [] args){
        System.out.println("ex.6.22 d");
        int number = 2_987_700;
        int dev = 1_000_000_000;
        int res = 0;
        int sum = 0;
        boolean go = true;
        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;

            if (res > 7){
                sum += res;

            }

           if (go == false){

               System.out.print(res);
           }else if(res != 0){

               go = false;
               System.out.print(res);
           }
        }

        System.out.println("summa = " + sum);


        System.out.println("ex.6.22 e");
        number = 2_987_700;
        dev = 1_000_000_000;
        res = 0;
        sum = 0;
        go = true;
        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;
            if (res > 7)

            if (go == false){

                System.out.println(res);
            }else if(res != 0){

                go = false;
                System.out.println(res);
            }
        }


        System.out.println(" 6.22 f");
        number = 1_870_345;
        dev = 1_000_000_000;
        res = 0;
        go = false;
        sum = 0;


        while (dev > 0){
            res = number / dev;
            dev /= 10;
            res %= 10;
            if (res == 5){
                sum += 1;
            }

        if (go == true){
            System.out.print(res);
            if (res == 0){
                sum += 1;
            }

        }else if(res != 0){
            go = true;
            System.out.print(res);

        } }
        System.out.println("     " +sum + "     5 and 0");

        System.out.println("ex 6.23 a");

        number = 45_987_076;
        dev = 1_000_000_000;
        res = 0;
        int a = 0;
        go = false;
        sum = 0;
        System.out.println("a value = " + a);

        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;


            if (go == true){
                System.out.print(res);
                if (res == a){
                    sum += 1;
                }
            }else if (res != 0){
                go = true;
                System.out.print(res);

            }

        }
        System.out.println("             a number quantity is = " + sum);

        System.out.println("ex 6.23 b");

        number = 45_987_076;
        dev = 1_000_000_000;
        res = 0;
        int z = 4;
        go = false;
        sum = 0;
        System.out.println("z value = " + z);
        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;


            if (go == true ){
                System.out.print(res);
                if (res % z == 0 && res > 0){
                    sum +=1;
                }

            }else if (res != 0 && res > 0){
                go = true;
                System.out.print(res);
                if (res % z == 0){
                    sum +=1;
                }
            }
        }
        System.out.println("             a number quantity multiple of Z value is  = " + sum);

        System.out.println("6.23 c");
        number = 65_987_076;
        dev = 1_000_000_000;
        res = 0;
        a = 4;
        go = false;
        sum = 0;
        System.out.println("a value = " + a);
        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;


            if (go == true ){
                System.out.print(res);
                if (res > a){
                    sum +=1;
                }

            }else if (res != 0 && res > 0){
                go = true;
                System.out.print(res);
                if (res > a){
                   sum +=1;
                }
            }
        }
        System.out.println("     sum of numbers > a =   " + sum);


        System.out.println("6.23 d");
        number = 65_987_076;
        dev = 1_000_000_000;
        res = 0;
        int x = 4;
        int y = 6;
        go = false;
        sum = 0;
        System.out.println("x value = " + x);
        System.out.println("y value = " + y);
        while (dev > 0 ){
            res = number / dev;
            dev /= 10;
            res %= 10;


            if (go == true ){
                System.out.print(res);
                if (res == x || res == y){
                    sum +=1;
                }

            }else if (res != 0 && res > 0){
                go = true;
                System.out.print(res);
                if (res == x || res == y){
                    sum +=1;
                }
            }
        }
        System.out.println("     quantity of numbers equal to x and y is  =   " + sum);

        System.out.println("6.24 a");

        number = 11;
        x = 5;
        sum = 0;
        while (number >= 0){
            System.out.print(number + " , ");
            number --;
            if (number > x){
                sum += number;
            }
        }
        System.out.println("sum of all numbers greater than X =  " + sum);

        System.out.println("6.24 b");

        number = 11;

        sum = 0;
        while (number >= 0){
            System.out.print(number + " , ");
            number --;
            if (number % 2 == 0 && number > 0){
                sum += 1;
            }
        }
        System.out.println("sum of all even numbers = " + sum);

        System.out.println("ex 6.25");

        int num [] = {-12,-10,45,78,-8,6,8,9,0};
        int i = 0;
        sum = 0;
        go = false;
        while (i<num.length){
            i++;


            if (go == true){
                sum ++;

            }else if (num[i] < 0){
                go = true;
                sum ++;
            }
        }
        System.out.println("sign changes  " + sum + " times");

        System.out.println("ex 6.26");
        number = 675_987;
        dev = 100_000_000;
        res = 0;

        while (dev>0){
            res = number / dev;
           res %= 10;
           dev /= 10;
            System.out.println(res);

        }


    }
}
