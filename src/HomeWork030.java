import com.sun.org.apache.bcel.internal.generic.ClassGen;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ClassGenerator;

import java.util.Random;

/**
 * Created by gorch on 1/3/2018.
 */
public class HomeWork030 {
    public static void main(String args[]){
        System.out.println("Ex 11.31");
        int [] array = new int[35];
        int sum = 0;
        Random rnd = new Random();
        for (int i = 0;i<array.length;i++){
            int num = rnd.nextInt(120)+2800;
            array[i] = num;
            sum +=array[i];
            //System.out.println(array[i]);
        }
        if (sum>100000 && sum<1000000){
            System.out.println("kolichestvo knig est shestiznachnoe chislo");
        }else{
            System.out.println("kolichestvo knig est NE shestiznachnoe chislo");
        }
        System.out.println(sum);

        System.out.println("Ex 11.32");
        array = new int[30];
        int  i = 0;
        sum =0;
        while (i<array.length){
           int num = rnd.nextInt(500)+1000;
           array[i] = num;
           sum += array[i];
            System.out.println(array[i]);
           i++;
        }
        System.out.println(sum);
        if (sum > 37000){
            System.out.println("massa bolshe pologennogo");
        }else{
            System.out.println("massa v norme");
        }
        System.out.println("Ex 11.33");
        array = new int[10];
        i = 0;
        sum = 0;
        do {
            int num = rnd.nextInt(3)+8;
            array[i] = num;
            sum +=array[i];
            //System.out.println(array[i]);
            i++;
        }while(i<array.length);
        System.out.println("obchee kolichestvo ballov = " + sum);
        if (sum>=90){
            System.out.println("vyxod v sleduuchii round");
        }else{
            System.out.println("sorry try again");
        }

        System.out.println("Ex 11.34");
        array = new int[30];
        int Fdec = 0;
        int Sdec = 0;
        int Tdec = 0;
        int Polovina = 0;
        int VtorPolovina = 0;

        for (i = 0; i < array.length; i++) {
            int num = rnd.nextInt(20);
            array[i] = num;
            if (i < 10) {
                Fdec += array[i];
            } else if (i > 10 && i < 20) {
                Sdec += array[i];
            } else if (i > 20 && i < 30) {
                Tdec += array[i];
            }
        }

        for (i = 0; i < array.length; i++) {
            if (i < 15) {
                Polovina += array[i];
            } else if (i > 15 && i < 30) {
                VtorPolovina += array[i];
            }
        }

        System.out.println(" za pervuu decadu vapalo " + Fdec + " osadkov ");
        System.out.println(" za vtorouu dacadu vypalo " + Sdec + " osadkov " );
        System.out.println(" za tretiu decadu vypalo " + Tdec + " osadkov ");
        System.out.println(" za pervuu poloviny mesyaca vypalo " + Polovina + " osadkov ");
        System.out.println(" za vtoruu poloviny mesyaca vypalo " + VtorPolovina + " osadkov ");

        System.out.println("Ex 11.35");
        array = new int[18];
        i = 0;
        int ObProg = 0;
        int KorProg = 0;
        int ProizProg = 0;
        do{
            int num = rnd.nextInt(10);
            array[i] = num;
            if (i<6){
                ObProg+=array[i];
            }else if (i>6 && i<=12){
                KorProg+=array[i];
            }else if (i>12 && i<array.length){
                ProizProg+=array[i];
            }
            i++;
        }while(i < array.length);
        if (ObProg>KorProg && ObProg>ProizProg){
            System.out.println("sprotsmen nabral bolshe ochkov po Obchey programme");
        }else if (KorProg>ObProg && KorProg>ProizProg){
            System.out.println("sprotsmen nabral bolshe ochkov po Korotkoi programme");
        }else if (ProizProg>ObProg && ProizProg>KorProg){
            System.out.println("sprotsmen nabral bolshe ochkov po Proizvolnoi programme");
        }else{
            System.out.println("po kakoi to programme sportsmen nabral odinakovo ochkov");
        }

        System.out.println("Ex 11.36");
        array = new int[10];
        for (i = 0; i < array.length; i++){
            int num = rnd.nextInt(120)-10;
            array[i] = num;

            if (array[i]>0){
                System.out.println("vse ne otricatelnye chisla  "+array[i]);
            }
        }
            i=0;
        do {
            int num = rnd.nextInt(120)-10;
            array[i] = num;
            if (array[i]<100){
                System.out.println("chisla ne privyshauchie 100 " +array[i]);
            }
            i++;
        }while(i<array.length);
        System.out.println("Ex 11.37");
        i = 0;

        while(i<array.length){
            int num = rnd.nextInt(99);
            array[i] = num;
            if (array[i] % 2 ==0){
                System.out.println("vse chetnye chisla array " + array[i]);
            }
            if (array[i] % 10 ==0){
                System.out.println("vse chisla array okonchivauchiesya na 0 " + array[i]);
            }
            i++;
        }

        System.out.println("Ex 11.38");
        for (i = 0; i< array.length; i++){
            int num = rnd.nextInt(200);
            array[i] = num;
            if (array[i] < 100){
                System.out.println("array dvuznachnyi " + array[i]);
            }else if (array[i]>99 && array[i]<1000){
                System.out.println("array trexznachnyi " + array[i]);
            }
        }
        System.out.println("Ex 11.40");
        array = new int[]{-4,4,5,6,7,-2,-1,-9};
        java.util.Arrays.sort(array);
        for (i=0;i<array.length;i++){
            //array[i] = i;
            System.out.println(array[i]);
        }


        System.out.println("_____________________________________________________________________________");
        int array1[] = new int[] {12,-1, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};

        for (int positive: array1) {

            if (positive >0)
                System.out.println("Positive numbers :" + positive);
        }
        System.out.println();
        System.out.println("Array 2 :");

        for (int negative: array1) {
            if (negative <0) {
                System.out.println("Negative numbers :" +negative);
            }
        }


        System.out.println("otricatelnyi, pologitelnyi, povtor array");
        array = new int[]{-1,2,-2,-4,5,4,3,2,-4,-6,-6,-8,2};
        java.util.Arrays.sort(array);
        for (int pos: array){
            if (pos > 0){
                System.out.println("pos = " + pos);
            }
        }
        for (int neg: array){
            if (neg < 0){
                System.out.println("neg = " + neg);
            }
        }
            for (i = 0; i< array.length-1; i++){
            if (array[i]==array[i+1]){
                System.out.println("povtor = " + array[i]);
            }
        }

        System.out.println(" Ex 11.39 ");
        array = new int[]{1,2,3,4,5,6,7,7,8,9,9,5,7,6,9};
        // print out array 2.4.6.8.....
        for (i = 0;i < array.length; i+=2){
            System.out.println(array[i]);
        }
        // print out array 3.6.9.....
        System.out.println("11.39 B print array 3,6,9,......");
        i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i+=3;
        }
        System.out.println("Ex 11.42");
        array = new int[]{
                1,3,4,50,20,11,234,65,70,900,1500,34,2324,1300
        };
        i = 0;
        do {
            if(array[i]<99 && array[i] % 10 == 0){
                System.out.println(array[i]);
            }else if (array[i]>99 && array[i]<9999 & array[i] % 100 ==0){
                System.out.println(array[i]);
            }
            i++;
        }while (i < array.length);
        System.out.println();
        System.out.println("Ex 11.43");
        array = new int[31];
        java.util.Arrays.sort(array);
        for (i = 1; i < array.length; i++){
            int num = rnd.nextInt(20);
            array[i] = num;
            if (array[i] == 0){
                System.out.println("osadkov nebylo  " + i + " chisla");
            }
            if (array[i] < 3){
                System.out.println("array < 3  =  " + array[i]);
            }
        }
    }
}
