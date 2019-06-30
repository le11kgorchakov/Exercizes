/**
 * Created by gorch on 6/4/2017.
 */
public class Lesson012 {
    public static void main(String[] args) {
        System.out.println("ex.6.22");
        int sum = 0;
        int zero = 0;
        int number = 983;
        int dev = 1_000_000_000;
        int res = 0;
        boolean isWork = false;
        while (dev > 0) {
            res = number / dev;
            dev /= 10;
            res %= 10;
            if (res == 3){
                sum = sum + 1;

            }


            if (isWork == true) {
                System.out.println(res);
                if (res == 0){
                    zero = zero + 1;
                }
            }else{
                if (res!=0){
                    isWork = true;
                    System.out.println(res);
                }
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("zero = " + zero);


        System.out.println("6.22 b");

        sum = 0;
        number = 980;
        dev = 1_000_000_000;
        res = 0;
        isWork = false;
        int ln = number % 10;
        while (dev > 0) {
            res = number / dev;
            dev /= 10;
            res %= 10;


            if (isWork == true) {
                System.out.println(res);
                if (res == ln){
                    sum += 1;
                }
            }else{
                if (res!=0){
                    isWork = true;
                    System.out.println(res);
                }
            }
        }
        System.out.println("sum ln = " + sum);


        System.out.println("ex.6.22 c");
        sum = 0;
        number = 980;
        dev = 1_000_000_000;
        res = 0;
        isWork = false;
        int chet = res % 2 ;



        while (dev > 0) {

            res = number / dev;
            dev /= 10;
            res %= 10;



            if (isWork == true) {
                System.out.println(res);
                if (chet == 0 ){
                    sum +=1;
                }

            }else{
                if (res!=0){
                    isWork = true;
                    System.out.println(res);
                }
            }
        }
        System.out.println("chet = " + sum);



        System.out.println("ex.6.22 d");
        sum = 0;
        number = 980;
        dev = 1_000_000_000;
        res = 0;
        isWork = false;
        while (dev > 0) {

            res = number / dev;
            dev /= 10;
            res %= 10;
            if (res > 5 ){
                sum +=1;
            }


            if (isWork == true) {
                System.out.println(res);


            }else{
                if (res!=0){
                    isWork = true;
                    System.out.println(res);
                }
            }
        }
        System.out.println("bigger then 5 = " + sum);

    }
}