/**
 * Created by gorch on 1/31/2018.
 */
public class Lesson031 {
    public static void main (String args[]){

        System.out.println("2.38");
        /*Даны целое число k (1 k 150) и последовательность цифр 101102103...149150, в которой выписаны подряд все трехзначные числа от 101
до 150.
1-1  11-0 21-7 31-1 41-1
2-0  12-4 22-1 32-1 42-4
3-1  13-1 23-0 33-1 43-1
4-1  14-0 24-8 34-1 44-1
5-0  15-5 25-1 35-1 45-5
6-2  16-1 26-0 36-2 46-1
7-1  17-0 27-9 37-1 47-1
8-0  18-6 28-1 38-1 48-6
9-3  19-1 29-1 39-3 49-1
10-1 20-0 30-0 40-1 50-1
*/

        int k = 145;
        System.out.println(k%3);
        System.out.println(k/3);
        int num = 2;
        int cifra =1;
        if (k % 3 == 1){
            num = k / 3 + 101;
            cifra = num / 100;
        }else if (k % 3 == 2){
            num = k / 3 + 101;
            cifra = num % 100 / 10;
        }else if (k % 3 ==0){
            num = k / 3 + 100;
            cifra = num % 10;
        }

        System.out.println("num = " + num + "   cifra = " + cifra);




        System.out.println("Ex 2.37");
        k = 179;
        int res = k /2 + 9;
        res%=10;
        if (k % 2 != 0){
            res = k / 2 + 10;
            res/=10;
        }

        System.out.println(res);
    }
}
