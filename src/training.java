/**
 * Created by gorch on 9/12/2017.
 */
public class training {
    public static void main (String [] args){

        int x=0;
        int array[] = new int[1];
        for (int i = 0; i<  array.length; i++){
            for ( x = 2;x<=Math.random();x++){
                x = (int)(Math.random()*5);
                System.out.println(x);
            }
        }

        System.out.println("___________________________________________________________________________________________");
        int[] narray;
        narray = new int[12];
        for (int i = 0; i < narray.length; i++) {
            narray[i] = ((int)(Math.random() * 51) +50);
            System.out.println(narray[i]);
        }

        System.out.println("______________________________________________________________________________________________________");

        narray = new int [20];

        for (int i = 0;i < narray.length;i++){
            int num =20;
            num = num - i;
            System.out.println(num);

        }


    }
}
