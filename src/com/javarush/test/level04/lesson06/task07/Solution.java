package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String v1 = reader.readLine();
        String v2 = reader.readLine();
        String v3 = reader.readLine();
        int a = Integer.parseInt(v1);
        int b = Integer.parseInt(v2);
        int c = Integer.parseInt(v3);
        int x1 = 1, x2 = 2, x3 = 3;
        if (a == b)
            System.out.print(x3);
        else if (b == c)
            System.out.print(x1);
        else
            System.out.print(x2);
    }
}
