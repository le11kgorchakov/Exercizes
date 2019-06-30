/**
 * Created by gorch on 3/15/2017.
 */
public class rain {
    public static void main (String args[]){
        int i,j,sum=0;
        for (i = 1;i<5;i++){
            for (j = 1; j< i; j++){
                sum = i*j;
                System.out.println();
            }
            System.out.print(sum);
        }
    }


}