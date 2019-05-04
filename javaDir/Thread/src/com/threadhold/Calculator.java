package com.threadhold;

public class Calculator
{

    public void addNum(int value)
    {
        LogTimeChecker.star();
        for (int i = 0; i < 10000000; i++)
        {
            value++;
        }
        System.out.println(value);
        LogTimeChecker.end();
    }

    public void subNum(int value)
    {
//        for (int i = 0; i < 100; i++)
//        {
//            value--;
//        }
        LogTimeChecker.star();
        for (int i = 0; i < 1000000000; i++)
        {
            value--;
        }
        System.out.println(value);
        LogTimeChecker.end();
    }
}
