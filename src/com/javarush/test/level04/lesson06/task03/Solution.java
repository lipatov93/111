package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x1 = reader.readLine();
        int a = Integer.parseInt(x1);
        String x2 = reader.readLine();
        int b = Integer.parseInt(x2);
        String x3 = reader.readLine();
        int c = Integer.parseInt(x3);
/**
        if ((a >= b) && (b >= c)) System.out.println(a + " " + b + " " + c);
        else if ((b >= a) && (b >= c))System.out.println(b + " " + c + " " + a);
        else if ((b >= a) && (c >= b))System.out.println(c + " " + b + " " + a);
        else System.out.print(c + " " + a + " " + b);**/

        if (c>=b && b>=a) System.out.println(c + " " + b + " " + a);
        else if (b>=c && c>=a) System.out.println(b + " " + c + " " + a);
        else if (a>=c && c>=b) System.out.println(a + " " + c + " " + b);
        else if (c>=a && a>=b) System.out.println(c + " " + a + " " + b);
        else if (b>=a && a>=c) System.out.println(b + " " + a + " " + c);
        else if (a>=b && b>=c) System.out.println(a + " " + b + " " + c);
    }
}



