package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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

        if (a>0 && b>0 && c>0 )
            System.out.print("3");
        else if (a>0 && b>0 && c<0)
            System.out.print("2");
        else if (a>0 && b<0 && c>0)
            System.out.print("2");
        else if (a<0 && b>0 && c>0)
            System.out.print("2");
        else if (a>0 && b<0 && c<0)
            System.out.print("1");
        else if (a<0 && b>0 && c<0)
            System.out.print("1");
        else if (a<0 && b<0 && c>0)
            System.out.print("1");
        else
            System.out.print("0");

    }
}
