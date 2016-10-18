package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String x4 = reader.readLine();
        int d = Integer.parseInt(x4);

        if ((a > b) && (a > c) && (a > d))
            System.out.print(a);
        else if ((b > c) && (b > d))
            System.out.print(b);
        else if (c > d)
            System.out.print(c);
        else
            System.out.print(d);
    }
}

