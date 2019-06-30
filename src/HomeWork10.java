/**
 * Created by gorch on 5/23/2017.
 */
public class HomeWork10 {
    public static void main(String []args){
        System.out.println("ex 6.8");
        int n = 100;
        int i = 0;
        int step = 1;
        while (i < n){
            i = i+step;
            System.out.print(i + " ");
            step = step + 2;
        }



        System.out.println("ex 6.9");
        int array [] = new int [10];
        int ind = 0;
        int num = 65;
        while(ind < array.length){
            array[ind] = (ind+1)*(ind+1);
            if (num < array[ind]) {
                System.out.println(array[ind]);
                break;
            }
            ind++;
           }

       System.out.println("ex 6.10");
       //number = 87;
       double sq[] = new double [12];
       num = 100;
       n = 1;
       while(n*n < num){
           n++;
       }




    }
}
