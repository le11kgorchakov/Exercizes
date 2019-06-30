

/**
 * Created by gorch on 10/19/2017.
 */
public class HomeWork021 {
    public static void main (String []args){
        System.out.println("Ex 4.129");
        // 10/19/2017 today  , my birthday 01/15/1985
        int y,m,d;
        y= 2017;
        m=10;
        d=19;
        int By,Bm,Bd;
        By=1988;
        Bm=11;
        Bd=19;
        int res =0;
        if (m>Bm){
            res = y-By;
        }else if(m <Bm){
          res = y - By -1;
        }else if(m == Bm){
            if (d>=Bd){
                res = y-By;
            }else if (d<Bd){
                res = y - By -1;
            }
        }
        System.out.println(res);


        System.out.println(" Ex  4.128 ");

        int n = 384;
        int let = n/12;
        int num = let % 10;

        if(num ==0 || num >= 5 && num <=10 || let >=11 && let <=19){
            System.out.println(let + " let");
        }else if(num >=1 && num <=4){
            System.out.println(let + " goda");
        }

        System.out.println("Ex 4. 129");
        y= 1988;
        m=10;
        d=19;
        By=1988;
        Bm=10;
        Bd=19;


        if (y<By){
            System.out.println("first person is older");
        }else if(y==By){
            if (m<Bm){
                System.out.println("first person is older");
            }else if (m==Bm){
                if (d<Bd){
                    System.out.println("first person is older");
                }else if(d==Bd){
                    System.out.println(" they same age ");
                }
                else{
                    System.out.println("first person is yang");
                }
            }
        }else{
            System.out.println("first person is yang");
        }

        System.out.println("Ex 4.131");
        y = 2017;
        m = 10;
        By=1988;
        Bm=10;

        res = y-By;
        int res2 = m - Bm;
        System.out.println("polnyx let " + res+ " polnyx mesyacev " + res2);

        System.out.println("Ex 4.132");
        int a,b,c;
        a = 12;
        b = 32;
        c = 12;
        d = 50;
        n = 12;
        m = 49;

        if (n == a && n <=c && m >= b && m <= d){
            System.out.println(" poezd budet stoyat ");
        }else{
            System.out.println("poezd ushel ili eche ne prishol");
        }

        System.out.println("Ex 4.133");
        m = 10;
        n = 32;

        if (m > 1 && m <= 12 && n>=2 && n <=31){
            n = n-1;
            System.out.println("yesterday is month = "+m+" day = "+ n);
        }else{
            System.out.println("wrong date");
        }
        n=32;
        if (m>=1 && m <=12 && n >=1 && n <31){
            n = n+1;
            System.out.println("tomorrow is month = " + m+" day = " +n);
        }else{
            System.out.println("wrong date");
        }

        System.out.println("4.134");
        int year = 2017;
        int month =3;
        int day = 1;
        int nextDay = day;
        int nextMonth =month;
        int nextYear = year;
        int prevDay = day;
        int prevMonth =month;
        int prevYear = year;

        System.out.println(day+"/"+month+"/"+year);
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
               nextDay++;
                if (day == 31){
                    nextMonth++;
                    nextDay = 1;
                    if (month ==12) {
                        nextYear++;
                    }
                }
                break;
            case 4:case 6:case 9:case 11:
               nextDay++;
                if (day == 30){
                    nextDay = 1;
                    nextMonth++;
                }

                break;
            case 2:
                nextDay++;
                if (day == 28&& (year%4==0 && year%100!=0) || (year%400==0)){
                    nextDay = 29;
                }else{
                    nextDay = 1;
                    nextMonth ++;
                }
        }

        System.out.println("next Day "+nextDay+ "/" + nextMonth+"/"+nextYear);
        switch (month){
            case 1:case 5:case 7:case 8:case 10:case 12:

                if (day ==1) {
                    prevDay = 30;
                    prevMonth--;
                    if (month == 8) {
                        prevDay = 31;

                    }

                    if (month == 1 ) {
                        prevDay = 31;
                        prevYear--;
                        prevMonth = 12;
                    }
                }else {
                    prevDay--;
                }
                break;
            case 3:
                prevDay--;
                prevMonth--;
                if(day==1 && (year%4==0 && year%100!=0) || (year%400==0)){
                    prevDay = 29;
                }else {
                    prevDay = 28;
                }
                break;
            case 4:case 6:case 9:case 11:case 2:
               prevDay--;
                if (day == 1){
                    prevDay = 31;
                    prevMonth--;
                }
                break;

                }

        System.out.println("prev Day " +prevDay+"/" +prevMonth+"/"+prevYear);














       /* int yesterday = n -1;
        int tomorrow = n +1;
        if (y==) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                if (n >= 1 && n <= 31) {
                    System.out.println("yesterday - " + yesterday + "/" + m + "/" + y);
                    System.out.println("tomorrow - " + tomorrow + "/" + m + "/" + y);
                }
            }


            if (m == 4 || m == 4 || m == 9 || m == 11) {
                if (n >= 1 && n <= 30) {
                    System.out.println("yesterday - " + yesterday + "/" + m + "/" + y);
                    System.out.println("tomorrow - " + tomorrow + "/" + m + "/" + y);
                }
            }

            if (m==2){
                if (n >= 1 && n <= 29) {
                    if (n==29){
                        System.out.println("yesterday - " + yesterday + "/" + m + "/" + y);
                        System.out.println("tomorrow - " + "1" + "/" + m+1 + "/" + y);
                    }
                    System.out.println("yesterday - " + yesterday + "/" + m + "/" + y);
                    System.out.println("tomorrow - " + tomorrow + "/" + m + "/" + y);
                }
            }
        } else {
            System.out.println(" data vvedena ne verno ");
        }
*/


    }
}
