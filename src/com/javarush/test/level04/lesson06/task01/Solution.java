package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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

        if (a < b)
            System.out.print(a);
        else
            System.out.print(b);


    }
}