/**
 * Created by gorch on 3/21/2017.
 */
public class HomeWork003 {
    public static void main(String [] args){
        System.out.println("ex 2.9");
        int n,x;
        n = 10;
        x = n + 1;
        System.out.println("if n = " + n + " then its " + x + " month");

        System.out.println("ex.2.11");
        int a =23;
        int des = a / 10;
        int ed = a % 10;

        a = ed * 10 + des;


        System.out.println("swapped number is " + a);

        System.out.println("ex 2.12");
        int number = 365;
        int tens = number / 10;
        int singls = number % tens;
        int summa = tens + singls;
        int mult = tens * singls;
        System.out.println("singls = " + singls + " tens = " + tens + " summa = " + summa + " multiple = " + mult);

        System.out.println("ex.2.13");
        int revn,num,sot;
        num = 586;
        sot = num / 100; // 5
        des = num / 10 % 10; // 8
        ed = num % 10; // 6

        System.out.println("original number is = " + sot +  des  + ed);

        revn = (ed * 100) + (des * 10) + sot;
        System.out.println("reversed number is = " + revn);

        System.out.println("ex 2.14");
        //750 we should get 507
        num = 750;
        sot = num / 100; //7
        des = num % 100; // 50
        System.out.println("original number = " + num);
        int modNum = des * 10 + sot;
        System.out.println("modified number =  " + modNum);

        System.out.println("ex 2.15");
        //389 we should get 938
        num = 389;
        ed = num / 10; // 38
        sot = num % 10; // 9
        System.out.println("original number = " + num);
        modNum = sot * 100 + ed;
        System.out.println("modified number = " + modNum);

        System.out.println("ex 2.16");
        // 341 we should get 431
        num = 341;
        sot = num / 100; // 3
        des = num % 100 / 10; // 4
        ed = num % 100 % 10; // 1
        System.out.println("original number = " + num);
        modNum = des * 100 + sot * 10 + ed;
        System.out.println("modified number = " + modNum);

        System.out.println("ex 2.17");
        // 568 we need to get 865
        num = 568;
        sot = num / 100; // 5
        des = num % 100 / 10; // 6
        ed = num % 100 % 10; // 8
        System.out.println("original number = " + num);
        modNum = ed * 100 + des * 10 + sot;
        System.out.println("midified number is = " + modNum);

        System.out.println("ex 2.18");
        //345 we need to get 543,453,534,435,354,345
        num = 345;
        sot = num /100; // 3
        des = num % 100 / 10; // 4
        ed = num % 100 % 10; // 5
        System.out.println("original number is = " + num);
        int snum,tnum,finum,firnum, fnum,senum;
        firnum = ed * 100 + des * 10 + sot;
        senum = des * 100 + ed * 10 + sot;
        tnum = ed * 100 + sot * 10 + des;
        fnum = des * 100 + sot * 10 + ed;
        finum = sot * 100 + ed * 10 + des;
        snum = sot * 100 + des * 10 + ed;
        System.out.println("first modified number is = " + firnum);
        System.out.println("second modified number is = " + senum);
        System.out.println("third modified number is = " + tnum);
        System.out.println("fourth modified number is = " + fnum);
        System.out.println("fifth modified number is = " + finum);
        System.out.println("sixth modified number is = " + snum);

        System.out.println("ex 2.19");
        // 5678 find a. sum b. product
        num = 5678;
        int thousands = num / 1000; // 5
        int hundreds = num % 1000 / 100; // 6
        tens = num % 100 /10; // 7
        ed = num % 10; // 8
        System.out.println("original number is = " + num);
        System.out.println("thousands = " + thousands + " hundreds = " + hundreds + " tens = " + tens + " singls = " + ed);
        int sum = thousands + hundreds + tens + ed;
        System.out.println("sum of numbers is = " + sum);
        int product = thousands * hundreds * tens * ed;
        System.out.println("product of numbers is = " + product);

        System.out.println("ex 2.20");
        //3496 need to find a) 6943 b) 4369 c) 3946 d)9634
        num = 3496;
        thousands = num / 1000; // 3
        hundreds = num % 1000 / 100; // 4
        tens = num % 100 / 10; // 9
        ed = num % 10;  //6
        System.out.println("original number is = " + num);
        firnum = ed * 1000 + tens * 100 + hundreds * 10 + thousands;
        System.out.println("a) modified number is = " + firnum);
        senum = hundreds * 1000 + thousands * 100 + ed * 10 + tens;
        System.out.println("b) modified number is = " + senum);
        tnum = hundreds * 1000 + thousands * 100 + ed * 10 + tens;
        System.out.println("c) modified number is = " + tnum);
        int fpart = num / 100; // 34
        int spart = num % 100; // 96
        int fnumA = tens * 1000 + ed * 100 + thousands * 10 + hundreds;
        int fnumB = spart * 100 + fpart;
        System.out.println("d) first method = " + fnumA);
        System.out.println("d) second method = " + fnumB);




    }
}
