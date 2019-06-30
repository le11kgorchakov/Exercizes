/**
 * Created by gorch on 10/18/2017.
 */
public class Lesson020 {
    public static void main(String[] args) {
        System.out.println("Ex 4.126");
        int k = 0;/*
       1 grib. 2,3,4 griba. 5,6,7,8,9,0 gribov. 11 - 14 gribov.
        */
        for (k = 0; k < 30; k++) {
            int numb = k % 10;
            if ((numb >= 5 && numb <= 9) || numb == 0 || (k >= 11 && k <= 14)) {
                System.out.println(k + " gribov");
            } else if (numb >= 2 && numb <= 4) {
                System.out.println(k + " griba");
            } else if (numb == 1) {
                System.out.println(k + " grib");
            }

        }

        System.out.println("Ex 4.127");
        int n = 1113;
        int kop = n % 100; //67 kop
        int rub = n / 100; //65 rub
        System.out.println("kop = " + kop + " rub = " + rub);
        int ko = kop % 10;
        int ru = rub % 10;

        if (ru == 0 || (ru >= 5 && ru <= 9) || rub >= 10 && rub <= 20) {
            System.out.print(rub + " rublei");
        } else if (ru >= 2 && ru <= 4) {
            System.out.print(rub + " rublya");
        } else if (ru == 1) {
            System.out.print(rub + " rubl'");
        }

        if (ko == 0 || (ko >= 5 && ko <= 9) || kop >= 10 && kop <= 20) {
            System.out.print(kop + " kopeek");
        } else if (ko == 1) {
            System.out.print(kop + " kopeika");
        } else if (ko >= 2 && ko <= 4) {
            System.out.print(kop + " kopeiki");
        }

        System.out.println("Ex 4.128");
        n = 1145;
        int year = n / 12;
        int month = n % 12;

        System.out.println("year = " + year + " months = " + month);

        int y = year % 10;
        int m = month % 10;

        if (y == 0 || y >= 5 && y <= 9 || year >= 10 && year <= 20) {
            System.out.println(year + " let");
        } else if (y == 1) {
            System.out.println(year + " god");
        } else if (y >= 2 && y <= 4){
            System.out.println(year + " goda");
        }
    }
}
