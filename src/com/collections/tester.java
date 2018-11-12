package com.collections;

import java.util.LinkedList;

/**
 * Created by ganesh on 09-11-2018.
 */
public class tester
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(new student(2,"test",20));
        list.add(new student(3,"asdf",30));
        list.add(new student(4,"eyete",40));
        Object ob = list.get(1);
        student s=(student)ob;
        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);
    }
}
