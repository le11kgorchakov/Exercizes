/**
 * Created by gorch on 8/9/2017.
 */
public class HomeWork016 {
    public static void main (String []args){
         System.out.println("Ex 8.23 a");

         int array [][] = new int [][]{
                 {615,23,62,12,97,34},
                 {43,52,16,67,86,56},
                 {31,65,98,43,26,82},
                 {11,67,42,36,89,26},
                 {24,78,16,78,90,43}
         };

         int t =0;
         int d =0;
         int summat = 0;

         for (t =0; t < array.length; t++){
             summat = 0;
             for (d =0; d < array[t].length; d++){
                 //System.out.print(array[t][d]+" ");
                 summat += array[t][d];

             }

             System.out.println("income for certain product for all period = " + summat);
             System.out.println();
         }

         System.out.println("Ex 8.23 b");

        int summad = 0;

        for (t = 0; t < array.length; t++){
            summad = 0;
            for (d = 0; d < array.length; d++){
                //System.out.print(array[d][t]+ " ");
                summad += array[d][t];
            }

            System.out.println("sum of income for all days = " + summad);
            System.out.println();
        }

        System.out.println("Ex 8.23 c");

        int totalsum = 0;
        for (t = 0; t < array.length; t++){
            for (d = 0; d < array[t].length; d++){
                //System.out.print(array[t][d]+" ");
                totalsum += array[t][d];
            }
            System.out.println();
        }
        System.out.println("total income = " + totalsum);

        System.out.println("Ex 8.23 d");
        summad = 0;
        int sum = 0;
        for (t = 0; t < array.length; t++){
            summad = 0;
            for (d = 0; d < array.length; d++){
                //System.out.print(array[d][t]+ " ");
                summad += array[d][t];
            }
            if (summad > sum){
                sum = summad;
            }
            System.out.println();
        }
        System.out.println("maximum income for the product = " + sum);


        System.out.println("Ex 8.23 e");
        summat = 0;
        sum = 0;
        int day = 0;
        for (t = 0; t < array.length; t++){
            summat = 0;
            for (d = 0; d < array.length; d++){
                //System.out.print(array[d][t]+ " ");
                summat += array[d][t];
            }
            if (summat > sum){
                sum = summat;
                day = t;
            }
            System.out.println();
        }
        System.out.println("max income for all product = " + sum +" in day = " + day);

        summat = 0;
        sum = 330;
        day = 0;
        for (t = 0; t < array.length; t++){
            summat =0;
            for (d = 0; d < array[t].length; d++){
                summat += array[t][d];
            }
            if (summat > sum){
                day++;
            }
            System.out.println("summat = " + summat);
            System.out.println();
        }
        System.out.println(day + " dney");

        System.out.println("Ex 8.24a");

        int st [][] = new int[][]{
                {14,13,15,13,12,14,15,13,15,14,14,12,13,14,14,15,15,14,12,14},
                {14,12,13,14,14,15,15,14,12,14,12,12,13,14,12,14,12,14,14,12},
                {12,14,14,15,15,14,12,13,14,14,15,15,14,12,14,14,15,15,15,14}
        };
        int s = 0;
        int g = 0;
        sum = 0;
        double srsum = 0;
        double res =0;

        for (s =0; s < st.length; s++){
            sum = 0;
            for (g =0; g < st[s].length; g++){
                System.out.print(st[s][g]+" ");
                sum += st[s][g];
            }
            srsum = (double)sum / 20;
            System.out.println("points = " + srsum);
            if (srsum > res){
                res = srsum;
            }

            System.out.println();
        }
        System.out.println("result = " + res);



        System.out.println("Ex 8.25");


        for (int i =120; i<=140; i++){
            int count = 2;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    count++;
                }
            }
            System.out.println("count of dividers for number " + i +" = " +count);
        }


    }
}
