package com.collections;

import java.util.LinkedList;

/**
 * Created by ganesh on 09-11-2018.
 */
public class testerEmp
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(new Employee(4,"asd",545));
        list.add(new Employee(5,"ert",789));
        list.add(new Employee(6,"iop",564));
        for (int i=0;i<list.size();i++)
        {
            Object ob=list.get(i);
            Employee e =(Employee)ob;
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.salary);
        }
        String s1 = list.toString();
        System.out.println(s1);
    }
}
