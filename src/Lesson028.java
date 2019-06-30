/**
 * Created by gorch on 12/20/2017.
 */
public class Lesson028 {
    public static void main (String []args){
        System.out.println("Ex 11.152");
        int [] array = new int [] {123,122,121,119,118,117,116,115,114,113,112,111};
        int n = 1;
        for(int i = n; i < array.length-1; i++){
            array[i]=array[i+1];
            //System.out.println(array[i]);
        }

        array[array.length-1] = 0;

        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Ex 2.39");
        double h = 9;
        double m = 20;
        double s = 0;
        double hindegrese = 360 /12;
        double mindegrese = hindegrese / 60;
        double sindegrese = mindegrese / 60;
        double res = h * hindegrese + m * mindegrese + s * sindegrese;
        System.out.println(res);

        System.out.println("Ex 2.40");
        double y = 6.28;
        h = y /30;
        m = (y % 30) / 0.5;
        System.out.println(h+"  " + m);




    }
}
