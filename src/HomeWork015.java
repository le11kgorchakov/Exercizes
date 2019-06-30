/**
 * Created by gorch on 7/26/2017.
 */
public class HomeWork015 {
    public static void main(String []args){
        System.out.println("Ex 8.18");
        int array[][] = new int[][]{
                {22,24,21,19},
                {21,24,13,11},
                {22,25,21,27},
                {13,24,21,23},
                {22,26,21,23},
                {22,24,37,22},
                {22,22,21,23},
                {30,24,21,23},
                {12,45,56,10},
                {22,24,20,23},
                {33,24,21,17}
        };
        int P = 0;
        int K = 0;
        int min = array[0][0];

        System.out.println("A..................");

        for (P = 0; P < array.length; P++){
            for (K = 0; K < array[P].length; K++){
                //System.out.print(array[P][K] + " ");
                if (array[P][K]<min){
                    min = array[P][K];

                }
            }
            System.out.println();
        }
        System.out.println("The smallest Klass is contained " + min);

        System.out.println("B..................");

        int minP =0;
        int x = array[0][0]+array[0][1]+array[0][2]+array[0][3];
        for (P = 0; P < array.length; P++){
            minP =array[0][0];
            for (K = 0; K < array[P].length; K++ ){
                if (array[P][K]<minP){
                    minP = array[P][K];
                }

            }
            System.out.println("minimum sum of parralel = " + minP);

            System.out.println();

        }

        System.out.println("C............................");


        int minKL=0;
        for (K = 0; K < array[K].length; K++){
            minKL = array[0][0];
            for (P = 0; P < array.length;P++){
                System.out.print(array[P][K]+"  ");
                if (array[P][K]<minKL){
                   minKL = array[P][K];
                }
            }

            System.out.println();
            System.out.println(minKL);

        }

        System.out.println("Ex 8.19");
        System.out.println("A......................................");

        int array2[][] = new int[][]{
                {76,53,32,53},
                {43,75,21,10},
                {55,32,16,89},
                {98,11,34,56},
                {67,21,22,56},
                {76,22,56,11},
                {77,45,88,23}
        };
        int Klass = 0;
        int Paral = 0;
        int minKlass = 0;

        for (Paral = 0; Paral < array2.length; Paral++){
            minKlass = 100; //array2[0][0]           prosto maximalnoe chislo
            for (Klass =0; Klass < array2[Klass].length; Klass++){
                System.out.print(array2[Paral][Klass] +"  ");
                if (array2[Paral][Klass] < minKlass){
                    minKlass = array2[Paral][Klass];

                }
            }
            System.out.println();
            System.out.println("The smallest Klass by Paralel above is ____ " + minKlass + " person");
        }


        System.out.println("B......................................");

        int minParal = 0;
        for (Klass = 0; Klass < array2[Klass].length; Klass++){
            minParal = 100;
            for (Paral = 0; Paral < array2.length; Paral++){
                System.out.print(array2[Paral][Klass]+"   ");
                if (array2[Paral][Klass]<minParal){
                    minParal= array2[Paral][Klass];
                }
            }
            System.out.println();
            System.out.println("The smallest Klass by Klass above_____________" + minParal + " person");
        }

        System.out.println("Ex 8.20");
        int mag[][] = new int[][]{
                {1200,896,1900,1234,4567,1256,2356,987,3010,99999},
                {987,5643,8765,3453,2543,1243,2543,1360,930,990},
                {874,3462,3456,3478,1260,3250,7200,8462,9120,4321}
        };

        int magaz =0;
        int dni =0;

        int maxdni = 0;
        int mag1 = mag[0][0]+mag[0][1]+mag[0][2]+mag[0][3]+mag[0][4]+mag[0][5]+mag[0][6]+mag[0][7]+mag[0][8]+mag[0][9];
        int mag2 = mag[1][0]+mag[1][1]+mag[1][2]+mag[1][3]+mag[1][4]+mag[1][5]+mag[1][6]+mag[1][7]+mag[1][8]+mag[1][9];
        int mag3 = mag[2][0]+mag[2][1]+mag[2][2]+mag[2][3]+mag[2][4]+mag[2][5]+mag[2][6]+mag[2][7]+mag[2][8]+mag[2][9];

        for (magaz =0; magaz < mag.length; magaz++){

            maxdni = 0;
            for (dni =0; dni < mag[magaz].length;dni++){
                //System.out.print(mag[magaz][dni]+"  ");
                maxdni += mag[magaz][dni];

            }
            System.out.println(maxdni);
            System.out.println();

        }
        System.out.println("maximum income for 10 days = ");
        if (mag1>mag2 && mag1 > mag3){
            System.out.println(mag1);
        }else if (mag2>mag1 && mag2>mag3){
            System.out.println(mag2);
        }else {
            System.out.println(mag3);
        }

        System.out.println("Ex 8.20 what day Store have a maximum income");
        int SMI = mag[0][0];
        int SMIday = 0;
        for (magaz =0; magaz < mag.length; magaz++){
            for (dni =0; dni <mag[magaz].length; dni++){
                if (SMI < mag[magaz][dni]){
                    SMI = mag[magaz][dni];
                    SMIday=dni;
                    }
            }
            System.out.println();

        }
        System.out.println("SMI = " + SMI + " was made in day " + SMIday);

        System.out.println("Ex 8.20 what day and what Store have a maximum income");
        SMI = mag[0][0];
        int day = 0;
        int store = 0;
        for (magaz =0; magaz < mag.length; magaz++){
            for (dni =0; dni <mag[magaz].length; dni++){
                if (SMI < mag[magaz][dni]){
                    SMI = mag[magaz][dni];
                    day=dni;
                    store=magaz;
                }
            }
            System.out.println();

        }
        System.out.println(store + " store , " + day + " day");

        System.out.println("Ex 8.21 ");
        int aray [][] = new int [][]{
                {678,9843,345,2334,556,2456,765,3578,8754,6768},
                {576,4534,7676,565,4533,76767,767,34,3454,454},
                {34,243,5465,7676,4343,456,4546,345,656,767}
        };
        int m = 0;
        int d = 0;
        int mMax = aray[0][0];
        int dayMax = 0;
       for (m=0;m<aray.length;m++){
           mMax = 0;
           for (d=0;d<aray[m].length;d++){
               if (mMax < aray[m][d]){
                   mMax = aray[m][d];
                   dayMax = d;
               }
               //System.out.print(aray[m][d]+" ");
           }
           //System.out.println("mMax " + mMax);
           System.out.println("max income in "+dayMax+" day = "+ mMax );
           System.out.println();
       }

       System.out.println("Ex 8.21 b");

        int mi = 0;
        for (m=0;m<aray[d].length;m++){
            for (d=0;d<aray.length;d++){
                System.out.print(aray[m][d]+" ");
            }
            System.out.println();
        }

    }
}
