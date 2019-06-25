package company;

import java.util.Random;

// Имееться целое число(задать с помощью Random rand =new Random(); int x = rand.nextInt());.Это число - количество денег в рубляхх. Вывести это число
// добавив к нему слово "рублей" в праильном падеже.
public class Main {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        Random rand = new Random();
        int x = rand.nextInt(min + max);
        System.out.println(x);

        int a = x % 100;
        int b = x % 10;
        System.out.println(b);
        if (a == 1 || b == 1)
            System.out.println(x + " рубль");
        else if (5 > a && a > 1 || b > 1 && b < 5)
            System.out.println(x + " рубля");
        else if (40> a && a > 10 || b != 5 && b != 5 || a==0 && b == 0)
        System.out.println(x + " рублей");


    }
}


