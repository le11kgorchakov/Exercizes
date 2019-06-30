/**
 * Created by gorch on 10/27/2017.
 */
public class HomeWork022 {
    public static void main (String []args){
        System.out.println("4.135");
        //in the begining of each hour 3min Green,1min Yellow, 2min Red.
        //Green 1,2,3 Y4 R5,6 G7,8,9 Y10 R11,12 G13,14,15 Y16 R17,18 G19,20,21 Y22 R23,24 G25,26,27 Y28 R29,30
        int time =13;

        if (time >30){
            time -=30;
        }
        switch (time){
            case 1:case 2:case 3:case 7:case 8:case 9:case 13:case 14:case 15:case 19:case 20:case 21:case 25:case 26:case 27:
                System.out.println("Green");
                break;
            case 4:case 10:case 16:case 22:case 28:
                System.out.println("Yellow");
                break;
            case 5:case 6:case 11:case 12:case 17:case 18:case 23:case 24:case 29:case 30:
                System.out.println("Red");
                break;
        }

        System.out.println("4.136");
        int k=345; // nekii den goda k>=1 k<=365
        int day =0;
        int nDay = 0;

        /*
        1M..6Sat7sun,13Sat14Sun,20Sat21Sun,27Sat28Sun,34Sat35Sun,41Sat42Sun,48Sat49Sun,55Sat56Sun,62Sat63Sun,69Sat70Sun,76Sat77Sun,83Sat84Sun90Sat91Sun
        */
        day = k % 7;

        for (day = 1; day <= 365; day += 7) {
           if (day==k){
            System.out.println("monday");
        }
        }

        for (day = 2; day <= 365; day += 7) {
            if (day==k){
            System.out.println("tuesday");
        }}

        for (day = 3; day <= 365; day += 7){
            if (day==k){
            System.out.println("wednesday");
        }}
        for (day = 4; day <= 365; day += 7) {
            if (day==k){
            System.out.println("thursday");
        }}

        for (day = 5; day <= 365; day += 7){
            if (day==k){
            System.out.println("friday");
        }}
        for (day = 6; day <= 365; day += 7) {
            if (day==k){
            System.out.println("saturday");
            }}

        for (day = 7; day <= 365; day += 7){
            if (day==k){
            System.out.println("sunday");
        }}

        System.out.println("Ex 4.137");
        k = 2;
        int num = 9;
        for (int  i = 0;i<=180;i++){
            if (i==k){
                break;
            }
            num++;
        }
        System.out.println("k= " +k+ " num = " + num);



    }
}
