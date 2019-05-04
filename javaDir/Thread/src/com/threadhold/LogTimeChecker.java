package com.threadhold;

public class LogTimeChecker
{
    static long beginMills;
    static long endMills;

    public static void star()
    {
        beginMills = System.currentTimeMillis();
    }

    public static void end()
    {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        endMills = System.currentTimeMillis();
        System.out.println( methodName + " cost:" + (endMills - beginMills));
    }
}