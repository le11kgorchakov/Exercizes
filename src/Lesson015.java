/**
 * Created by gorch on 7/25/2017.
 */
public class Lesson015 {
    public static void main(String []args){
        System.out.println("Ex 8.9");

        int array[][] = new int[][]{
                {1,2,4},
                {2,4,5},
                {5,3,2},
                {1,2,4},
                {2,4,5},
                {5,3,2},
                {5,2,3},
                {5,3,2},
                {5,2,3},
                {5,3,2},
                {5,2,3},
                {1,2,4}
        };
      //  array[9][0]=0;
        int count = 0;
        int stroka = 5;
        int colonka = 2;
        int summa = 0;
      //  array[stroka][colonka] = 3;
       // for (stroka=0;stroka<array.length;stroka++){
         //   for (colonka=0;colonka<array[stroka].length;colonka++){
         //       System.out.print(array[stroka][colonka]);
         //       summa = summa + array[stroka][colonka];
         //       count ++;
         //   }
         //   System.out.println();
       // }
       // System.out.println("summa" + summa);

      //  for (stroka=0; stroka<array.length;stroka++){
      //      summa =0;
      //      for (colonka=0;colonka<array[stroka].length;colonka++){
      //          summa += array[stroka][colonka];
      //      }
      //      System.out.println();
      //      System.out.println(summa);
      //  }

        for (colonka=0; colonka < array[colonka].length; colonka++){
            summa = 0;
            for(stroka =0; stroka< array.length; stroka++){
                summa += array[stroka][colonka];

            }
            System.out.println();
            System.out.println(summa);
        }

        System.out.println("Ex 8.12");
        int ar[][]= new int[][]{
                {0,4,8},
                {4,5,7},
                {9,3,5},
                {5,7,2},
                {4,1,7},
                {8,2,5},
                {9,1,5},
                {3,6,2},
                {3,5,2},
                {7,8,6},
                {6,5,9},
                {4,5,3},
                {4,2,1},
                {6,8,9},
                {3,5,1}

        };
        int sportsmen = 0;
        int programma = 0;
        ar[sportsmen][programma]=0;


        for (sportsmen = 0; sportsmen<ar.length; sportsmen++){
            summa = 0;
            for (programma = 0; programma< ar[sportsmen].length; programma++){
                summa = summa + ar[sportsmen][programma];
                //System.out.print(ar[sportsmen][programma]);
            }
            System.out.println();
            System.out.println(summa / ar[sportsmen].length);
        }

        for (programma = 0; programma< ar[programma].length; programma++){
            summa = 0;
            for (sportsmen = 0; sportsmen<ar.length; sportsmen++){
                summa = summa + ar[sportsmen][programma];
                //System.out.print(ar[sportsmen][programma]);
            }
            System.out.println();
            System.out.println(" progr  " + summa / ar.length);
        }

        System.out.println("Ex 8.13");

        int a[][] = new int [][]{
                {1,5,3},
                {1,5,4},
                {1,4,5},
                {2,4,3},
                {3,5,3},
                {5,5,4},
                {4,4,5},
                {2,4,3}
        };

        int sum=0;
        int uchenik =0;
        int predmet =0;


        for (uchenik=0; uchenik<a.length;uchenik++){
            for (predmet=0;predmet<a[uchenik].length;predmet++){
                if (a[uchenik][predmet]==1){
                    sum+=1;
                }
            }
            System.out.println();

        }
        System.out.println(sum);
    }
}
