/**
 * Created by gorch on 7/14/2017.
 */
public class HomeWork014 {
    public static void main (String []args){
        System.out.println("Ex 8.4c");

        for (int i=6;i>=2;i--){
            for (int j=i;j>1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Ex 8.4d");
        int n=24;
        for (int i=20;i>=16;i--){
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            n-=2;
            System.out.println();
        }

        System.out.println("Ex 8.5");
        System.out.println(                             "*******************TABLICA SLOGENIYA***********************");
        int x=0;
        int y=0;
        int res=0;
        for (x = 1;x<10;x++) {
            for (y = 1; y < 10; y++) {
                res = y + x;
                System.out.print(y + " + " + x + " = " + res + "    ");

            }

            System.out.println();
        }

            System.out.println("Ex 8.6");
            System.out.println(                             "*******************TABLICA  SLOGENIYA***********************");
            x=0;
            y=0;
            res=0;
            for (x = 1;x<10;x++){
                for(y=1;y<10;y++){
                    res=y+x;
                    System.out.print(x +" + " +y +" = "+ res+ "    ");

                }

                System.out.println();

            }

        System.out.println("Ex 8.7");
        System.out.println(                             "*******************TABLICA UMNOGENIYA***********************");
        x=0;
        y=0;
        res=0;
        for (x = 1;x<10;x++) {
            for (y = 1; y < 10; y++) {
                res = y * x;
                System.out.print(y + " * " + x + " = " + res + "    ");

            }

            System.out.println();
        }

        System.out.println("Ex 8.8");
        System.out.println(                             "*******************TABLICA UMNOGENIYA***********************");
        x=0;
        y=0;
        res=0;
        for (x = 1;x<10;x++){
            for(y=1;y<10;y++){
                res=y*x;
                System.out.print(x +" * " +y +" = "+ res+ "    ");

            }

            System.out.println();

        }

        System.out.println("Ex 8.9");
        int o[] = {3,4,5,5,4,3,4,4,5,5,2,3,3,3,4,4,5,4};

        for (int i = 0; i < o.length; i++){

            for (int j = 0; j < 2; j ++){
                System.out.print(o[j]+" ");
            }
            System.out.println(o[i]);
        }

        System.out.println("Ex 8.9");
        int o2[][] = {
                     {2,3,4},
                     {3,4,5},
                     {3,4,5},
                     {3,4,5},
                     {3,4,5},
                     {3,4,4}};

        int j = 0;
        for (int i = 0; i < 18; i++){//

            for (j = 0; j < 2; j ++){
                System.out.print(o2[i][j]+" ");
            }
            System.out.println(o2[j]);
        }



    }
}
