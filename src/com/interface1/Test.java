package com.interface1;

import com.overriding.*;

/**
 * Created by ganesh on 27-09-2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        Sample s = new Sample();
        s.m1();
        s.m2();
        System.out.println(Demo.y);
        int i = s.y;
        System.out.println(i);
    }
}
