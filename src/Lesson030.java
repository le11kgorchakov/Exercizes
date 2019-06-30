import java.util.Random;

/**
 * Created by gorch on 1/2/2018.
 */
public class Lesson030 {
    public static void main (String args[]){
        System.out.println("Ex 11.18");
        int array[] = new int[]{11,12,13,14,2};
        int res = 0;
        for (int i = 0; i < array.length; i++){
            res = array[i] - 20;
            System.out.println(res);
        }
        System.out.println();
        int i = 0;
        while (i < array.length){
            res = array[i] * (array[array.length-1]);
            i ++;
            System.out.println(res);
        }
        System.out.println();
        i = 0;
        int b = 5;
        do{
            res = array[i] + b;
            i ++;
            System.out.println(res);
        }while (i < array.length);

        System.out.println("Ex 11.19");
        array = new int[]{33,44,55,66,77,88,33,45,78};
        res = 0;
        for (i = 0; i < array.length; i++){
            res += array[i];

        }
        System.out.println(res);
        System.out.println();
        res = 1;
        i = 0;
        while ( i < array.length){
            res *= array[i];
            i++;

        }
        System.out.println(res);

        System.out.println();

        res = 1;
        i = 0;
        do {
            res +=Math.pow(array[i],2);
            i++;

        }while (i < array.length);
        System.out.println(res);

        System.out.println();

        res = 0;
        for (i = 0; i < 6; i++){
            res +=array[i];

        }
        System.out.println(res);
        System.out.println();

        i = 2;
        res = 0;
        while (i < 6){
            res +=array[i];
            i++;
        }
        System.out.println(res);

        i = 0;
        res = 0;
        int sum =0;
        do {
            sum +=array[i];
            i++;
        }while (i < array.length);
        res = sum/array.length;
        System.out.println("sum = "+sum);
        System.out.println("res = "+res);

        System.out.println();
        int count = 0;
        sum =0;
        for (i = 2; i < 5; i++){
            count++;
            sum +=array[i];
            res = sum/count;
        }
        System.out.println("res = " + res + "     sum = " + sum);

        System.out.println("11.30");

        array = new int[42];
        Random rnd = new Random();

        sum = 0;
        for (i = 0; i < array.length; i++){
            int number = rnd.nextInt(17) + 18;
            array[i]= number;
            sum+=array[i];

            //System.out.println(array[i]);
        }
        if (sum > 1000 && sum < 10000){
            System.out.println("obchee kolichestvo uchenikov chetyrexznachnoe chidslo");
        }else{
            System.out.println("obchee kolichestvo uchenikov  NE chetyrexznachnoe chidslo");
        }
        System.out.println("sum = " + sum);

        array = new int[1];
        rnd = new Random();

        sum = 0;
        for (i = 0; i < array.length; i++){
            int number = rnd.nextInt(100) - 50;
            array[i]= number;
            sum+=array[i];

        }
        System.out.println("summa array = " + sum);
        if (sum >0){
            System.out.println("summa array pologitelnoe chislo");
        }else{
            System.out.println("summa array otrizatelnoe chislo");
        }

    }
}
