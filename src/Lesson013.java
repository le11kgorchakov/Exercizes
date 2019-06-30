/**
 * Created by gorch on 7/4/2017.
 */
public class Lesson013 {
    public static void main (String args[]){
        int num [] = {-12,-10,45,78,-8,6,8,9,0};
        int i = 1;
        int count = 0;

        while (num[i]!=0){
            if ((num[i] > 0 && num[i-1] < 0) || (num[i] < 0 && num[i-1] > 0)){
                count ++;
            }
            i++;
        }
        System.out.println(count);

        System.out.println("ex 6.27");
        int number = 657_987_462;
        count = 0;
        int result = 0;
        i = 0;

        int dev = 100_000_000;
        int res = number;
        while(res > 0){
            res = res / 10;
            count ++;
        }
        int array[] = new int[count];
        System.out.println(count);
        while(dev>0){

            result = number / dev;
            result %= 10;
            dev /= 10;
            array[i] = result;
          //  System.out.println(result);
            i++;

        }
        int max = array[0];
        int min = array[0];
        int razniza = 0;
        int summa = 0;
        for (i=1;i<array.length;i++){
           if (array[i]>max){
               max = array[i];
           }if (array[i]<min){
               min = array[i];
            }

        }
        razniza = max - min;
        System.out.println("razniza = " + razniza);
        summa = max + min;
        System.out.println("summa = " + summa);

        System.out.println("ex 6.28");
      number = 987654321;
      dev = 100000000;
      int nLenght = number;
      count = 0;
      res = 0;
      i=0;

      while(nLenght>0){
          nLenght /= 10;
          count++;
      }
      int n[] = new int[count];
      while(dev>0){
          res = number / dev;
          res %= 10;
          dev /= 10;
          n[i] = res;
          i++;

      }
      for (i=0;i<n.length;i++) {


      }
        System.out.println(n[i]);
    }
}
