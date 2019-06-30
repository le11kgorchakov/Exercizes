import java.util.Random;

/**
 * Created by gorch on 11/29/2017.
 */
public class Lesson026 {
    public static void main (String []args){
        System.out.println("Ex 16.5");
        Random rnd = new Random();
        int num = rnd.nextInt(6)+1;
        System.out.println(num);

        System.out.println("Ex 16.8");
        int a1 =0;
        int a2 =0;
        int a3 =0;
        int a4 =0;
        int a5 =0;
        int a6 =0;

        for (int i = 0;i<=100;i++){
            num = rnd.nextInt(6)+1;
            if (num == 1){
                a1++;
            }else if (num == 2){
                a2++;
            }else if (num ==3){
                a3++;
            }else if (num == 4){
                a4++;
            }else if (num == 5){
                a5++;
            }else if (num == 6){
                a6++;
            }
        }
        System.out.println("edenica =" + a1);
        int res[] = new int[6];
        for (int i = 0;i<=100;i++){
            num = rnd.nextInt(6)+1;
            res[num-1]++;
        }
        for(int i = 0;i<6;i++){
            System.out.println((i+1)+" vypala " + res[i] + " raz");

        }

        System.out.println("Ex 16.22");
        Random rn = new Random();
        int n = rn.nextInt(3);
        System.out.println(n);
        Random rn1 = new Random();
        int n1 = rn.nextInt(4);
        System.out.println(n1);
        System.out.println("Ex 16.22c");

        Random rnd1 = new Random();

        int dvoiki = 0;
        int troiki = 0;
        while ((dvoiki < 7) || (troiki < 8)){
            int number = rnd1.nextInt(4)+1;
            System.out.println(number);
            if (number == 2 && dvoiki < 7){
                dvoiki++;
            }
            if (number == 3 && troiki < 8){
                troiki++;
            }
            System.out.println(" 2 =" +dvoiki + "  3 = " + troiki);
        }
        System.out.println(" 2 =" +dvoiki + "  3 = " + troiki);



    }
}
