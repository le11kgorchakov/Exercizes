/**
 * Created by gorch on 8/8/2017.
 */
public class Lesson016 {
    public static void main (String []args) {
        int array[][] = new int[][]{
                {22, 24, 21, 19},
                {1, 2, 3, 4},
                {22, 25, 21, 27},
                {13, 24, 21, 23},
                {22, 26, 21, 23},
                {22, 24, 37, 22},
                {22, 22, 21, 23},
                {30, 24, 21, 23},
                {12, 45, 56, 10},
                {22, 24, 20, 23},
                {33, 24, 21, 17}
        };
        int k = 0;
        int p = 0;
        int minK = array[0][0];
        for (k = 0; k < array[0].length; k++) {
            System.out.println(" k = " + k);
            minK = array[0][k];
            for (p = 0; p < array.length; p++) {
                //System.out.print(array[k][p]+" ");
                if (minK > array[p][k]) {
                    minK = array[p][k];
                }
            }
            System.out.println(minK);
            System.out.println();
        }
        boolean flag = true;

        int sump = 0;
        int minsum = 0;
        for (k = 0; k < array.length; k++) {
            sump = 0;
            for (p = 0; p < array[k].length; p++) {
                sump += array[k][p];

            }
            if (flag == true) {
                minsum = sump;
                flag = false;
            }
            if (sump < minsum)
                minsum = sump;
            System.out.println();

        }
        System.out.println("sump = " + minsum);

        System.out.println("Ex 8.21 B");

        int aray[][] = new int[][]{
                {678, 9843, 345, 2334, 556, 2456, 765, 3578, 8754, 6768},
                {576, 4534, 7676, 565, 4533, 76767, 767, 34, 3454, 454},
                {34, 243, 5465, 7676, 4343, 456, 4546, 345, 656, 767}
        };
        int m = 0;
        int d = 0;
        //int maxd=aray[0][d];
        for (m = 0; m < aray[0].length; m++) {
            int maxd = aray[0][m];
            for (d = 0; d < aray.length; d++) {
                if (maxd < aray[d][m]) {
                    maxd = aray[d][m];
                }
            }
            System.out.println();
            System.out.println("maxd = " + maxd);
        }

        System.out.println("Ex 8.22 a");
        int ku = 0;
        int gr = 0;
        int minku = 0;
        flag = true;
        int mins = 0;

        for (ku = 0; ku < aray.length; ku++) {
            minku = 0;
            for (gr = 0; gr < aray[ku].length; gr++) {
                minku += aray[ku][gr];

            }
            System.out.println("mink=== " + minku);
            if (flag == true) {
                minku = mins;
                flag = false;
            }
            if (minku > mins) {
                minku = mins;
            }
            System.out.println();
            System.out.println("minku = " + minku);
        }

        System.out.println("Ex 8.22 b");

        int grmin = 0;
        mins = 0;
        flag = true;
        for (ku = 0; ku < aray.length; ku++) {
            for (gr = 0; gr < aray[ku].length; gr++) {

                grmin += aray[ku][gr];
            }

            if (flag == true){
                grmin = mins;
                flag = false;
            }
            if (grmin < mins){
                grmin = mins;
            }


            System.out.println();


        }
        System.out.println("the smalest gorup = " + grmin);
    }
}