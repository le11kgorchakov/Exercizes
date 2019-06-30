/**
 * Created by gorch on 11/30/2017.
 */
public class HomeWork027 {
    public static void main (String []args){
        System.out.println("Ex 4.137");
        int k = 153;
        int number = 0;
        if (k%2==0){
            number = ((k / 2) -1);


        }if (k%2==0 && k > 20 && k <= 40){
            number = ((k / 2) -11);
        }if (k%2==0 && k > 40 && k <= 60){
            number = ((k / 2) -21);
        }if (k%2==0 && k > 60 && k <= 80){
            number = ((k / 2) -31);
        }if (k%2==0 && k > 80 && k <= 100){
            number = ((k / 2) -41);
        }if (k%2==0 && k > 100 && k <= 120){
            number = ((k / 2) -51);
        }if (k%2==0 && k > 120 && k <= 140){
            number = ((k / 2) -61);
        }if (k%2==0 && k > 140 && k <= 160){
            number = ((k / 2) -71);
        }if (k%2==0 && k > 160 && k <= 180){
            number = ((k / 2) -81);
        }else if (k%2!=0 && k > 0 && k < 21){
            number = k / k;
        }if (k%2!=0 && k > 21 && k < 41){
            number = k / k + 1;
        }if (k%2!=0 && k > 41 && k < 61){
            number = k / k + 2;
        }if (k%2!=0 && k > 61 && k < 81){
            number = k / k + 3;
        }if (k%2!=0 && k > 81 && k < 101){
            number = k / k + 4;
        }if (k%2!=0 && k > 101 && k < 121){
            number = k / k + 5;
        }if (k%2!=0 && k > 121 && k < 141){
            number = k / k + 6;
        }if (k%2!=0 && k > 141 && k < 161){
            number = k / k + 7;
        }if (k%2!=0 && k > 161 && k < 181){
            number = k / k + 8;
        }
        System.out.println(number);

        System.out.println("4 .138");
        int n  = 32;
        k = 0;
        if (n>32 || n<0){
            System.out.println("please input correct Number....");
        }
        if (n<=10 && n>=1){
            k = n-1;
        }if (n>10 && n <=27 && n % 2 !=0){
            k = n/n;
        }if (n >=12 && n <=28 && n %2 ==0){
            for (int i = 14; i <=n ;i+=2){
                k++;
            }
        }if (n >=31 && n <32 && n % 2 !=0){
            k = n /n + 1;
        }if (n >=30 && n <=32 && n %2 ==0) {
            for (int i = 32; i <= n; i += 2) {
                k++;
            }
        }
        System.out.println(k);


        System.out.println("Ex 4.139");
        k = 23;
        int ii = 1;
        if (k%2!=0) {
                if (1<= k && k <=20) {
                    k = ii / ii + 4;
                } if (21<= k && k <=40) {
                k = ii / ii + 5;
                }

        }
        System.out.println(k);

        System.out.println("Ex 4.139_______________________________________________________");
        k = 33;
        for (int i = 1; i<=252;i++){
            if (i<20 && k%2!=0){
                k = i/i+4;
            }if (i>20 && i < 40){
                k = i/i+5;
            }if (i>40 && i < 60){
                k = i/i+6;
            }if (i>60 && i < 80){
                k = i/i+7;
            }if (i>80 && i < 100){
                k = i/i+8;
            }if (i>100 && i < 120){
                k = i/i+9;
            }if (i>120 && i < 140){
                k = i/i+10;
            }if (i>140 && i < 160){
                k = i/i+11;
            }if (i>160 && i < 180){
                k = i/i+12;
            }if (i>180 && i < 200){
                k = i/i+13;
            }if (i>200 && i < 220){
                k = i/i+14;
            }if (i>220 && i < 240){
                k = i/i+15;
            }if (i>240 && i < 252){
                k = i/i+16;
            }
        }
        System.out.println(k);

        System.out.println("Ex 2.28");
        int z = 546;
        int sotni = z / 100;
        int desyatki = (z % 100)/10;
        int edenicy = z % 10;
        int x = desyatki * 100 + sotni * 10 + edenicy;
        System.out.println(x);

        System.out.println("Ex 2.37");
        //  1<=k<=180
        k=1;
        int cifra = 0;
        int addNum = 0;
        int addNum2 = 2;
        int array []= new int[180];
        int array2 []= new int[181];
       for (int i = 0;i <180; i+=20){

           for (int j =1;j<=20;j++){
               if (k % 2 != 0) {
                   cifra = k/k + addNum;
                   array[k]=cifra;

               }
               int cifra2 = 0;
               if (k % 2 == 0){
                   cifra2 = k - addNum2;
                   addNum2++;
                   array2[k]=cifra2;
               }
               k++;
           }
           addNum++;
           addNum2+=10;
       }
        System.out.println(array[1]);
        System.out.println(array2[8]);

        System.out.println("Ex 2.39");
        int hours = 3;
        int min = 12;
        int sec = 16;
        int tsec = hours * 3600 + min * 60 + sec;
        int deg = tsec / 120;
        System.out.println(deg);


    }
}
