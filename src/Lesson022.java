/**
 * Created by gorch on 11/1/2017.
 */
public class Lesson022 {
    public static void main (String []args){
        System.out.println("2.9");
        int n = 25;
        int x = n % 12;
        System.out.println(x);
        int part1 = n / 12;
        System.out.println("part 1 = n / 12 =" + part1);
        int part2 = part1 * 12;
        System.out.println("part 2 = part1 * 12 = " + part2);
        int ostatok = n - part2;

        System.out.println("Ex 2.6");
        n = 7265;
        int min = n / 60;
        int hours = min / 60;
        int m = min%60;
        int sec = n%60;
        System.out.println(hours+" "+m+" " +sec);

        System.out.println("Ex 2.8");
        int k = 7;
        int day = k %7;
        day++;
        System.out.println(day);
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tueeday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

        System.out.println("Ex 4.54");
        int a1 = 8;
        int a2 = 14;
        int a3 = 11;

        int b1 = 1;
        int b2 = 6;
        int b3 = 7;

        if (a1 >= b1 && a2>=b2 && a3 >= b3 || b2 < a1 && b3 < a2 && b1< a3){
            System.out.println(" good deal ");
        }else {
            System.out.println(" will not fit ");
        }

        System.out.println("Ex 4.95");
        int weight = 63;
        if (weight<=60){
            System.out.println("light weight");
        }else if (weight>60 && weight <=64){
            System.out.println("1 midle weight");
        }else if (weight > 64 && weight <=69){
            System.out.println("midle weight");
        }else{
            System.out.println(" you FAT");
        }

        System.out.println("Ex 5.38");
        double distance = 1;
        n = 1;
        double res = 1;

        for (int i = 0;i<=100;i++){
            n++;
            boolean sign = true;
            if (sign==true) {
                res -=distance/n;

            }
            n++;
            sign = false;
            res +=distance/n;

        }
        System.out.println("distance = "+ res);

    }
}
