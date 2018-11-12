package com.collections;

import java.util.ArrayList;

/**
 * Created by ganesh on 09-11-2018.
 */
public class arrayList
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(20);
        list.add("qspiders");
        list.add('d');
        list.add(45);
        list.add("test");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove("test");
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
